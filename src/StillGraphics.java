import sign.signlink;


public final class StillGraphics
{
	private StillGraphics(/*int id*/)
	{
		//this.id = id;
		anInt2394 = -1;
		anInt410 = 128;
		anInt411 = 128;
		aShortArray2384 = new int[6];
		aShortArray2386 = new int[6];
		anInt2385 = -1;
		aBoolean2402 = false;
	}
    public static int anInt415 = 54;
	public int anInt2378;
	public int anInt2379;
	public byte aByte2381;
	public final int[] aShortArray2384;
	public int anInt2385;
	public final int[] aShortArray2386;
	public short[] aShortArray2389;
	public int anInt2394;
	public short[] aShortArray2395;
	public boolean aBoolean2402;

	/*private StillGraphics(int id, Stream buffer)
	{
		this(id);
		while (true)
		{
			int opcode = buffer.getUnsigned();
			if (opcode == 0)
				break;

			if (opcode == 1)
				anInt2379 = buffer.getUnsignedShort();
			else if (opcode == 2)
			{
				anInt2394 = buffer.getUnsignedShort();
				if (Animation.anims != null && anInt2394 < Animation.anims.length)
					animDef = Animation.anims[anInt2394];
				else
					animDef = null;

			}
			else if (opcode == 4)
				anInt410 = buffer.getUnsignedShort();
			else if (opcode == 5)
				anInt411 = buffer.getUnsignedShort();
			else if (opcode == 6)
				anInt412 = buffer.getUnsignedShort();
			else if (opcode == 7)
				anInt413 = buffer.getUnsigned();
			else if (opcode == 8)
				anInt414 = buffer.getUnsigned();

			else if (opcode == 9)
			{
				aByte2381 = (byte) 3;
				anInt2385 = 8224;
			}
			else if (opcode == 10)
				aBoolean2402 = true;
			else if (opcode == 11)
				aByte2381 = (byte) 1;
			else if (opcode == 12)
				aByte2381 = (byte) 4;
			else if (opcode == 13)
				aByte2381 = (byte) 5;

			else if (opcode == 14)
			{
				aByte2381 = (byte) 2;
				anInt2385 = 256 * buffer.getUnsigned();
			}
			else if (opcode == 15)
			{
				aByte2381 = (byte) 3;
				anInt2385 = buffer.getUnsignedShort();
			}
			else if (opcode == 16)
			{
				aByte2381 = (byte) 3;
				anInt2385 = buffer.getInt();
			}
			else if (opcode == 40)
			{
				int count = buffer.getUnsigned();
				aShortArray2384 = new short[count];
				aShortArray2386 = new short[count];
				for (int i = 0; i != count; ++i)
				{
					aShortArray2386[i] = (short) buffer.getUnsignedShort();
					aShortArray2384[i] = (short) buffer.getUnsignedShort();
				}

			}
			else if (opcode == 41)
			{
				int count = buffer.getUnsigned();
				aShortArray2389 = new short[count];
				aShortArray2395 = new short[count];
				for (int i = 0; i != count; ++i)
				{
					aShortArray2389[i] = (short) buffer.getUnsignedShort();
					aShortArray2395[i] = (short) buffer.getUnsignedShort();
				}

			}
			else
			{
				System.out.println("[StillGraphics] Unknown opcode: " + opcode);
				break;
			}
		}
	}*/

	public static void preload()
	{
		for (int i = 0; i != cache.length; ++i)
		{
			StillGraphics def = cache[i];
			if (def == null)
				continue;

			if (def.anInt2379 >= 0)
				def.getModel();

			Animation animDef = def.animDef;
			if (animDef != null && animDef.anIntArray353 != null)
				for (int i1 = 0; i1 != animDef.anIntArray353.length; ++i1)
					FrameReader.get(animDef.anIntArray353[i1]);


		}

	}

	/*public static void unpackConfig(byte[] data)
	{
		Stream buffer = new Stream(data);
		int count = buffer.getUnsignedShort();
		cache = new StillGraphics[count];
		int pos = buffer.currentOffset;
		for (int i = 0; i != count; ++i)
		{
			buffer.currentOffset = pos;
			int size = buffer.getUnsignedShort();
			pos += 2 + size;
			cache[i] = size != 0 ? new StillGraphics(i, buffer):new StillGraphics(i);
		}

	}*/
	
	public static String loc = signlink.findcachedir();

	public static byte[] getData(String s) {
		return FileOperations.ReadFile(s);
	}
	
    public static void unpackConfig(StreamLoader archive)
    {
        Stream stream = new Stream(getData(loc+"667spotanim.dat"));
        int length = stream.getUnsignedShort();
        if(cache == null)
            cache = new StillGraphics[length];
        for(int j = 0; j < length; j++)
        {
            if(cache[j] == null)
                cache[j] = new StillGraphics();
            cache[j].id = j;
            cache[j].readValues667(stream);
		
        }

    }
    
    private void readValues667(Stream stream) {
		do {
			int i = stream.getUnsigned();
			if (i == 0)
				return;
			if (i == 1)
				anInt2379 = stream.getUnsignedShort();
			else if (i == 2) {
				anInt2394 = stream.getUnsignedShort();
				if (Animation.anims != null)
					animDef = Animation.anims[anInt2394];
			} else if (i == 4)
				anInt410 = stream.getUnsignedShort();
			else if (i == 5)
				anInt411 = stream.getUnsignedShort();
			else if (i == 6)
				anInt412 = stream.getUnsignedShort();
			else if (i == 7)
				anInt413 = stream.getUnsigned();
			else if (i == 8)
				anInt414 = stream.getUnsigned();
			else if (i == 40) {
				int j = stream.getUnsigned();
				for (int k = 0; k < j; k++) {
					aShortArray2384[k] = stream.getUnsignedShort();
					aShortArray2386[k] = stream.getUnsignedShort();
				}
			} else
				System.out.println("Error unrecognised spotanim config code: "
						+ i);
		} while (true);
	}
    
    public Model getModel()
    {
    	if(!Client.GFXEffects){//GFX Toggle
    		return (Model) aMRUNodes_415.insertFromCache(0);
    	}
    	
        Model model = (Model) aMRUNodes_415.insertFromCache(id);
        if(model != null)
            return model;
        model = Model.method462(anInt2379);
        if(model == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(aShortArray2384[0] != 0)
                model.method476(aShortArray2384[i], aShortArray2386[i]);

        aMRUNodes_415.removeFromCache(model, id);
        return model;
    }

	/*public Model getModel()
	{
		Model model = (Model) aMRUNodes_415.insertFromCache(id);
		if (model != null)
			return model;

		model = Model.method462(anInt2379);
		if (model == null)
			return null;

		if (aShortArray2386 != null)
			for (int i = 0; i != aShortArray2386.length; ++i)
				model.setColor(aShortArray2386[i], aShortArray2384[i]);


		if (aShortArray2389 != null)
			for (int i = 0; i != aShortArray2389.length; ++i)
				model.setColor(aShortArray2389[i], aShortArray2395[i]);


		aMRUNodes_415.removeFromCache(model, id);
		return model;
	}*/

	public static StillGraphics get(int id)
	{
		return id >= 0 && id < cache.length ? cache[id]:null;
	}

	public static void nullLoader()
	{
		cache = null;
		aMRUNodes_415.unlinkAll();
	}

	public static StillGraphics[] cache;
	public Animation animDef;
	public int id;
	public int anInt414;
	public int anInt413;
	public int anInt412;
	public int anInt410;
	public int anInt411;
	public static Cache aMRUNodes_415 = new Cache(30);
}
