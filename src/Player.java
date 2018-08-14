
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public final class Player extends Entity {
	
	private int lastAnim1 = -1;
	private int lastAnim2 = -1;
	private int lastGFX = -1;
	
	public String getInfo()
	{
		return "anim: " + lastAnim1 + (lastAnim2 == -1 ? "":", " + lastAnim2) + (lastGFX == -1 ? "":", gfx: " + lastGFX);
	}
	
	public Model getRotatedModel()
	{
		if (!visible)
			return null;

		Model model = method452();
		if (model == null)
			return null;

		super.height = model.modelHeight;
		model.aBoolean1659 = true;
		if (aBoolean1699)
			return model;

		lastGFX = -1;
		if (super.anInt1520 >= 0 && super.anInt1520 < StillGraphics.cache.length && super.anInt1521 >= 0)
		{
			try
			{
				lastGFX = super.anInt1520;
				StillGraphics graphicDef = StillGraphics.get(super.anInt1520);
				if (graphicDef != null)
				{
					Model model_2 = graphicDef.getModel();
					if (model_2 != null)
					{
						Animation animDef = graphicDef.animDef;
						//if (animDef != null && Skeleton.get(animDef.anIntArray353[0]) == null)
						//{
							boolean rotate = graphicDef.anInt410 != 128 || graphicDef.anInt411 != 128;
							int frame = animDef != null ? animDef.getFrame(super.anInt1521):-1;//animDef != null && super.anInt1521 < animDef.anIntArray353.length ? animDef.anIntArray353[super.anInt1521]:-1;
							int flags = 0;
							if (rotate)
								flags |= 0x4;

							if (super.anInt1524 != 0)
								flags |= 0x10;

							if (frame != -1)
								flags |= Model.getFlags(frame, animDef);

							Model model_3 = new Model(flags, model_2);//true, Skeleton.method532(super.anInt1521), false
							if (super.anInt1524 != 0)
								model_3.translate(0, -super.anInt1524, 0);

							if (frame != -1)
							{
								model_3.method469();
								model_3.method470(frame, animDef);
								model_3.anIntArrayArray1658 = null;
								model_3.anIntArrayArray1657 = null;
							}
							if (rotate)
								model_3.method478(graphicDef.anInt410, graphicDef.anInt410, graphicDef.anInt411);

							model_3.method479(64 + graphicDef.anInt413, 850 + graphicDef.anInt414, -30, -50, -30, true, true);
							Model aclass30_sub2_sub4_sub6_1s[] = {
								model, model_3
							};
							model = new Model(aclass30_sub2_sub4_sub6_1s);
						//}
					}
				}
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if (aModel_1714 != null)
		{
			if (Client.loopCycle >= anInt1708)
				aModel_1714 = null;

			if (Client.loopCycle >= anInt1707 && Client.loopCycle < anInt1708)
			{
				Model model_1 = aModel_1714;
				model_1.translate(anInt1711 - super.x, anInt1712 - anInt1709, anInt1713 - super.y);
				if (super.turnDirection == 512)
				{
					model_1.method473();
					model_1.method473();
					model_1.method473();
				}
				else if (super.turnDirection == 1024)
				{
					model_1.method473();
					model_1.method473();
				}
				else if (super.turnDirection == 1536)
					model_1.method473();
				Model aclass30_sub2_sub4_sub6s[] = {
					model, model_1
				};
				model = new Model(aclass30_sub2_sub4_sub6s);
				if (super.turnDirection == 512)
					model_1.method473();

				else if (super.turnDirection == 1024)
				{
					model_1.method473();
					model_1.method473();
				}
				else if (super.turnDirection == 1536)
				{
					model_1.method473();
					model_1.method473();
					model_1.method473();
				}
				model_1.translate(super.x - anInt1711, anInt1709 - anInt1712, super.y - anInt1713);
			}
		}
		model.aBoolean1659 = true;
		return model;
	}

	public void updatePlayer(Stream stream)
	{
		stream.currentOffset = 0;
		anInt1702 = stream.getUnsigned();
		headIcon = stream.getUnsigned();
		skullIcon = stream.getUnsigned();
		//hintIcon = stream.readUnsignedByte();
		desc = -1;
		team = 0;
		for(int j = 0; j < 12; j++)
		{
			int k = stream.getUnsigned();
			if(k == 0)
			{
				equipment[j] = 0;
				continue;
			}
			int i1 = stream.getUnsigned();
			equipment[j] = (k << 8) + i1;
			if(j == 0 && equipment[0] == 65535)
			{
				desc = stream.getUnsignedShort();
				break;
			}
			if(equipment[j] >= 512 && equipment[j] - 512 < ItemDef.totalItems)
			{
				int l1 = ItemDef.forID(equipment[j] - 512).team;
				if(l1 != 0)
					team = l1;
			}
		}

		for(int l = 0; l < 5; l++)
		{
			int j1 = stream.getUnsigned();
			if(j1 < 0 || j1 >= Client.anIntArrayArray1003[l].length)
				j1 = 0;
			anIntArray1700[l] = j1;
		}

		super.anInt1511 = stream.getUnsignedShort();
		if(super.anInt1511 == 65535)
			super.anInt1511 = -1;
		super.anInt1512 = stream.getUnsignedShort();
		if(super.anInt1512 == 65535)
			super.anInt1512 = -1;
		super.anInt1554 = stream.getUnsignedShort();
		if(super.anInt1554 == 65535)
			super.anInt1554 = -1;
		super.anInt1555 = stream.getUnsignedShort();
		if(super.anInt1555 == 65535)
			super.anInt1555 = -1;
		super.anInt1556 = stream.getUnsignedShort();
		if(super.anInt1556 == 65535)
			super.anInt1556 = -1;
		super.anInt1557 = stream.getUnsignedShort();
		if(super.anInt1557 == 65535)
			super.anInt1557 = -1;
		super.anInt1505 = stream.getUnsignedShort();
		if(super.anInt1505 == 65535)
			super.anInt1505 = -1;
		name = TextClass.fixName(TextClass.nameForLong(stream.getLong()));
		combatLevel = stream.getUnsigned();
		title = stream.getUnsignedShort();
		visible = true;
		aLong1718 = 0L;
		for(int k1 = 0; k1 < 12; k1++)
		{
			aLong1718 <<= 4;
			if(equipment[k1] >= 256)
				aLong1718 += equipment[k1] - 256;
		}

		if(equipment[0] >= 256)
			aLong1718 += equipment[0] - 256 >> 4;
		if(equipment[1] >= 256)
			aLong1718 += equipment[1] - 256 >> 8;
		for(int i2 = 0; i2 < 5; i2++)
		{
			aLong1718 <<= 3;
			aLong1718 += anIntArray1700[i2];
		}

		aLong1718 <<= 1;
		aLong1718 += anInt1702;
	}

	public Model method452()
	{
		lastAnim1 = -1;
		lastAnim2 = -1;
		NPCDef def = desc();
		if (def != null)
		{
			int j = -1;
			Animation animDef = null;
			if (super.anim >= 0 && super.anInt1529 == 0)
			{
				lastAnim1 = super.anim;
				animDef = Animation.get(super.anim);
				if (animDef != null)
					j = animDef.getFrame(super.anInt1527);

			}
			else if (super.anInt1517 >= 0)
			{
				lastAnim2 = super.anInt1517;
				animDef = Animation.get(super.anInt1517);
				if (animDef != null)
					j = animDef.getFrame(super.anInt1518);

			}
			Model model = def.method164(-1, j, animDef, false);
			return model;
		}
		long l = aLong1718;
		int k = -1;
		int i1 = -1;
		int j1 = -1;
		int k1 = -1;
		Animation animDef2 = null;
		if (super.anim >= 0 && super.anInt1529 == 0)
		{
			lastAnim1 = super.anim;
			Animation animDef = Animation.get(super.anim);
			if (animDef != null)
			{
				k = animDef.getFrame(super.anInt1527);
				//lastAnim1 = k;
				if (super.anInt1517 >= 0 && super.anInt1517 != super.anInt1511)
				{
					Animation childAnim = Animation.get(super.anInt1517);
					//lastAnim2 = super.anInt1517 * 100000;
					if (childAnim != null)
						i1 = childAnim.getFrame(super.anInt1518);

					//lastAnim2 = i1;
				}
				if (animDef.anInt360 >= 0)
				{
					j1 = animDef.anInt360;
					l += j1 - equipment[5] << 40;
				}
				if (animDef.anInt361 >= 0)
				{
					k1 = animDef.anInt361;
					l += k1 - equipment[3] << 48;
				}
			}
		}
		else if (super.anInt1517 >= 0)
		{
			lastAnim1 = super.anInt1517;
			animDef2 = Animation.get(super.anInt1517);
			if (animDef2 != null)
				k = animDef2.getFrame(super.anInt1518);

		}
		Model model_1 = (Model) mruNodes.insertFromCache(l);
		if (model_1 == null)
		{
			boolean flag = false;
			for (int i2 = 0; i2 < 12; i2++)
			{
				int k2 = equipment[i2];
				if (k1 >= 0 && i2 == 3)
					k2 = k1;
				if (j1 >= 0 && i2 == 5)
					k2 = j1;
				if (k2 >= 256 && k2 < 512 && !IdentityKit.cache[k2 - 256].method537())
					flag = true;
				if (k2 >= 512 && !ItemDef.forID(k2 - 512).method195(anInt1702))
					flag = true;
			}

			if (flag)
			{
				if (aLong1697 != -1L)
					model_1 = (Model) mruNodes.insertFromCache(aLong1697);
				if (model_1 == null)
					return null;
			}
		}
		if (model_1 == null)
		{
			Model aclass30_sub2_sub4_sub6s[] = new Model[12];
			int j2 = 0;
			for (int l2 = 0; l2 < 12; l2++)
			{
				int i3 = equipment[l2];
				if (k1 >= 0 && l2 == 3)
					i3 = k1;
				if (j1 >= 0 && l2 == 5)
					i3 = j1;
				if (i3 >= 256 && i3 < 512)
				{
					Model model_3 = IdentityKit.cache[i3 - 256].method538();
					if (model_3 != null)
						aclass30_sub2_sub4_sub6s[j2++] = model_3;
				}
				if (i3 >= 512)
				{
					Model model_4 = ItemDef.forID(i3 - 512).method196(anInt1702);
					if (model_4 != null)
						aclass30_sub2_sub4_sub6s[j2++] = model_4;
				}
			}

			model_1 = new Model(j2, aclass30_sub2_sub4_sub6s);
			for (int j3 = 0; j3 < 5; j3++)
				if (anIntArray1700[j3] != 0)
				{
					model_1.setColor((short) Client.anIntArrayArray1003[j3][0], (short) Client.anIntArrayArray1003[j3][anIntArray1700[j3]]);
					if (j3 == 1)
						model_1.setColor((short) Client.anIntArray1204[0], (short) Client.anIntArray1204[anIntArray1700[j3]]);
				}

			model_1.method469();
			model_1.method478(132, 132, 132);
			model_1.method479(84, 1000, -90, -580, -90, true, true);
			//model_1.method478(133, 133, 133);
			mruNodes.removeFromCache(model_1, l);
			aLong1697 = l;
		}
		if (aBoolean1699)
			return model_1;

		Model model_2 = Model.aModel_1621;
		int flags = 0;
		i1 = -1;//NO SUPPORT FOR DOUBLE ANIMS!!!
		if (k != -1 && i1 != -1)
		{
			Animation animDef = Animation.get(super.anim);
			if (animDef != null)
				flags |= Model.getFlags(animDef, i1, k, true);

		}
		else if (k != -1)
			flags |= Model.getFlags(k, animDef2);

		model_2.method464(model_1, flags);
		if (k != -1 && i1 != -1)
		{
			Animation animDef = Animation.get(super.anim);
			if (animDef != null)
				model_2.method471(animDef, i1, k, true);

		}
		else if (k != -1)
			model_2.method470(k, animDef2);

		model_2.anIntArrayArray1658 = null;
		model_2.anIntArrayArray1657 = null;
		model_2.method466();
		return model_2;
	}

	public boolean isVisible()
	{
		return visible;
	}
	
	public NPCDef desc()
	{
		return desc < 0 ? null:NPCDef.forID(desc);
	}

	public int privelage;
	public Model method453()
	{
		if (!visible)
			return null;
		NPCDef def = desc();
		if (def != null)
			return def.method160();
		boolean flag = false;
		for (int i = 0; i < 12; i++)
		{
			int j = equipment[i];
			if (j >= 256 && j < 512 && !IdentityKit.cache[j - 256].method539())
				flag = true;
			if (j >= 512 && !ItemDef.forID(j - 512).method192(anInt1702))
				flag = true;
		}

		if (flag)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[12];
		int k = 0;
		for (int l = 0; l < 12; l++)
		{
			int i1 = equipment[l];
			if (i1 >= 256 && i1 < 512)
			{
				Model model_1 = IdentityKit.cache[i1 - 256].method540();
				if (model_1 != null)
					aclass30_sub2_sub4_sub6s[k++] = model_1;
			}
			if (i1 >= 512)
			{
				Model model_2 = ItemDef.forID(i1 - 512).method194(anInt1702);
				if (model_2 != null)
					aclass30_sub2_sub4_sub6s[k++] = model_2;
			}
		}

		Model model = new Model(k, aclass30_sub2_sub4_sub6s);
		for (int j1 = 0; j1 < 5; j1++)
			if (anIntArray1700[j1] != 0)
			{
				model.setColor((short) Client.anIntArrayArray1003[j1][0], (short) Client.anIntArrayArray1003[j1][anIntArray1700[j1]]);
				if (j1 == 1)
					model.setColor((short) Client.anIntArray1204[0], (short) Client.anIntArray1204[anIntArray1700[j1]]);
			}

		return model;
	}

	Player()
	{
		aLong1697 = -1L;
		aBoolean1699 = false;
		anIntArray1700 = new int[5];
		visible = false;
		equipment = new int[12];
	}

	private long aLong1697;
	public int desc;
	boolean aBoolean1699;
	final int[] anIntArray1700;
	public int team;
	private int anInt1702;
	public String name;
	public int title = 0;
	static Cache mruNodes = new Cache(260);
	public int combatLevel;
	public int headIcon;
	public int skullIcon;
	public int hintIcon;
	public int anInt1707;
	int anInt1708;
	int anInt1709;
	boolean visible;
	int anInt1711;
	int anInt1712;
	int anInt1713;
	Model aModel_1714;
	public final int[] equipment;
	private long aLong1718;
	int anInt1719;
	int anInt1720;
	int anInt1721;
	int anInt1722;

}
