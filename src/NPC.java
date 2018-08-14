
public final class NPC extends Entity
{
	public String displayName = null;
	public int combatLevel = 0;
	public int lastAnim1 = -1;
	public int lastAnim2 = -1;
	public int desc = -1;

	private Model method450()
	{
		NPCDef desc = desc();
		if (desc == null)
			return null;
		lastAnim1 = lastAnim2 = -1;
		if (super.anim >= 0 && super.anInt1529 == 0)
		{
			lastAnim1 = super.anim;
			int k = -1;
			int i1 = -1;
			Animation animDef = null;
			Animation animDef2 = null;
			animDef = Animation.get(super.anim);
			if (animDef != null)
				k = animDef != null ? animDef.getFrame(super.anInt1527):-1;//animDef.anIntArray353[super.anInt1527];

			if (super.anInt1527 >= 0 && super.anInt1517 != super.anInt1511)
			{
				lastAnim2 = super.anInt1517;
				animDef2 = Animation.get(super.anInt1517);
				if (animDef2 != null)
					i1 = animDef.getFrame(super.anInt1518);

			}
			return desc.method164(i1, k, animDef, true);
		}
		int l = -1;
		Animation animDef = null;
		if (super.anInt1517 >= 0)
		{
			lastAnim1 = super.anInt1517;
			animDef = Animation.get(super.anInt1517);
			if (animDef != null)
				l = animDef.getFrame(super.anInt1518);

		}
		return desc.method164(-1, l, null, false);
	}

	public String getInfo()
	{
		return "anim: " + lastAnim1 + (lastAnim2 == -1 ? "":", " + lastAnim2);
	}

	public Model getRotatedModel()
	{
		NPCDef desc = desc();
		if (desc == null)
			return null;
		Model model = method450();
		if (model == null)
			return null;
		super.height = model.modelHeight;
		if (super.anInt1520 != -1 && super.anInt1521 != -1)
		{
			StillGraphics graphicDef = StillGraphics.get(super.anInt1520);
			Model model_1 = graphicDef != null ? graphicDef.getModel():null;
			if (model_1 != null)
			{
				Animation animDef = graphicDef.animDef;
				int j = animDef != null ? animDef.getFrame(super.anInt1521):-1;//animDef != null ? animDef.anIntArray353[super.anInt1521]:-1;
				//if (animDef != null && Skeleton.get(animDef.anIntArray353[0]) == null)
				//	return null;

				boolean rotate = graphicDef.anInt410 != 128 || graphicDef.anInt411 != 128;
				int flags = 0;
				if (rotate)
					flags |= 0x4;

				if (super.anInt1524 != 0)
					flags |= 0x10;

				if (j != -1)
					flags |= Model.getFlags(j, animDef);

				Model model_2 = new Model(flags, model_1);
				if (super.anInt1524 != 0)
					model_2.translate(0, -super.anInt1524, 0);

				if (j != -1)
				{
					model_2.method469();
					model_2.method470(j, animDef);
					model_2.anIntArrayArray1658 = null;
					model_2.anIntArrayArray1657 = null;
				}
				if (rotate)
					model_2.method478(graphicDef.anInt410, graphicDef.anInt410, graphicDef.anInt411);

				model_2.method479(64 + graphicDef.anInt413, 850 + graphicDef.anInt414, -30, -50, -30, true, false);
				Model aModel[] = {
					model, model_2
				};
				model = new Model(aModel);
			}
		}
		if (desc.aByte68 == 1)
			model.aBoolean1659 = true;
		return model;
	}

	public boolean isVisible()
	{
		return desc >= 0;//desc != null;
	}

	public NPCDef desc()
	{
		return desc >= 0 ? NPCDef.forID(desc):null;
	}

	NPC()
	{
	}
}
