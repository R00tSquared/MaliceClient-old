
import java.util.Hashtable;

public final class ObjectDef
{
	public void readValues(Stream buffer)
	{
		while (true)
		{
			int opcode = buffer.getUnsigned();
			if (opcode == 0)
				break;

			if (opcode == 1 || opcode == 5)
			{
				boolean lowMem_ = lowMem;
				if (opcode == 5 && lowMem_) {
					skip(buffer);
				}
				int count = buffer.getUnsigned();
				anIntArray776 = new int[count];
				anIntArrayArray3031 = new int[count][];
				for (int i = 0; i != count; ++i)
				{
					anIntArray776[i] = buffer.getUnsigned();
					int childCount = buffer.getUnsigned();
					anIntArrayArray3031[i] = new int[childCount];
					for (int i1 = 0; i1 != childCount; ++i1)
						anIntArrayArray3031[i][i1] = buffer.getUnsignedShort();

				}

				if (opcode == 5 && !lowMem_)
					skip(buffer);

			}
			else if (opcode == 2)
				name = buffer.getString();
			else if (opcode == 3)
				description = buffer.readBytes();
			else if (opcode == 14)
				sizeX = buffer.getUnsigned();
			else if (opcode == 15)
				sizeY = buffer.getUnsigned();

			else if (opcode == 17)
			{
				aBoolean3034 = false;
				anInt3010 = 0;
				aBoolean767 = false;
			}
			else if (opcode == 18)
			{
				aBoolean3034 = false;
				aBoolean757 = false;
			}
			else if (opcode == 19)
				anInt3057 = buffer.getUnsigned();
			else if (opcode == 21)
			{
				aByte3027 = (byte) 1;
				aBoolean762 = true;
			}
			else if (opcode == 22)
				aBoolean769 = true;
			else if (opcode == 23)
				anInt2977 = 1;
			else if (opcode == 24)
			{
				int n = buffer.getUnsignedShort();
				if (n != 0xffff)
				{
					anIntArray3019 = new int[] { n };
					anInt781 = n;
				}
			}
			else if (opcode == 27)
				anInt3010 = 1;
			else if (opcode == 28)
				anInt775 = buffer.getUnsigned();
			else if (opcode == 29)
				aByte737 = buffer.get();
			else if (opcode == 39)
				anInt3026 = 5 * buffer.get();

			else if (opcode >= 30 && opcode < 35)
			{
				if (actions == null)
					actions = new String[5];

				actions[opcode - 30] = buffer.getString();
			}
			else if (opcode == 40)
			{
				int count = buffer.getUnsigned();
				modifiedModelColors = new short[count];
				originalModelColors = new short[count];
				for (int i = 0; i != count; ++i)
				{
					modifiedModelColors[i] = (short) buffer.getUnsignedShort();
					originalModelColors[i] = (short) buffer.getUnsignedShort();
				}

			}
			else if (opcode == 41)
			{
				int count = buffer.getUnsigned();
				modifiedModelTextures = new short[count];
				originalModelTextures = new short[count];
				for (int i = 0; i != count; ++i)
				{
					modifiedModelTextures[i] = (short) buffer.getUnsignedShort();
					originalModelTextures[i] = (short) buffer.getUnsignedShort();
				}

			}
			else if (opcode == 42)
			{
				int count = buffer.getUnsigned();
				aByteArray2996 = new byte[count];
				for (int i = 0; i != count; ++i)
					aByteArray2996[i] = buffer.get();

			}
			else if (opcode == 62)
				aBoolean751 = true;
			else if (opcode == 64)
				aBoolean779 = false;
			else if (opcode == 65)
				anInt748 = buffer.getUnsignedShort();
			else if (opcode == 66)
				anInt772 = buffer.getUnsignedShort();
			else if (opcode == 67)
				anInt740 = buffer.getUnsignedShort();
			else if (opcode == 69)
				anInt768 = buffer.getUnsigned();
			else if (opcode == 70)
				anInt738 = buffer.getSignedShort();
			else if (opcode == 71)
				anInt745 = buffer.getSignedShort();
			else if (opcode == 72)
				anInt783 = buffer.getSignedShort();
			else if (opcode == 73)
				aBoolean736 = true;
			else if (opcode == 74)
				aBoolean766 = true;
			else if (opcode == 75)
				anInt760 = buffer.getUnsigned();

			else if (opcode == 77 || opcode == 92)
			{
				anInt774 = buffer.getUnsignedShort();
				if (anInt774 == 0xffff)
					anInt774 = -1;

				anInt749 = buffer.getUnsignedShort();
				if (anInt749 == 0xffff)
					anInt749 = -1;

				int ending = -1;
				if (opcode == 92)
				{
					ending = buffer.getUnsignedShort();
					if (ending == 0xffff)
						ending = -1;

				}
				int count = buffer.getUnsigned();
				childrenIDs = new int[count + 2];
				for (int i = 0; i <= count; ++i)
				{
					childrenIDs[i] = buffer.getUnsignedShort();
					if (childrenIDs[i] == 0xffff)
						childrenIDs[i] = -1;

				}

				childrenIDs[count + 1] = ending;
			}
			else if (opcode == 78)
			{
				anInt3015 = buffer.getUnsignedShort();
				anInt3012 = buffer.getUnsigned();
			}
			else if (opcode == 79)
			{
				anInt2989 = buffer.getUnsignedShort();
				anInt2971 = buffer.getUnsignedShort();
				anInt3012 = buffer.getUnsigned();
				int count = buffer.getUnsigned();
				anIntArray3036 = new int[count];
				for (int i = 0; i != count; ++i)
					anIntArray3036[i] = buffer.getUnsignedShort();

			}
			else if (opcode == 81)
			{
				aByte3027 = (byte) 2;
				anInt3023 = buffer.getUnsigned() * 256;
			}
			else if (opcode == 82)
				aBoolean2990 = true;
			else if (opcode == 88)
				aBoolean2972 = false;
			else if (opcode == 89)
				aBoolean3000 = false;
			else if (opcode == 91)
				aBoolean3002 = true;
			else if (opcode == 93)
			{
				aByte3027 = (byte) 3;
				anInt3023 = buffer.getUnsignedShort();
			}
			else if (opcode == 94)
				aByte3027 = (byte) 4;

			else if (opcode == 95)
			{
				aByte3027 = (byte) 5;
				anInt3023 = buffer.getSignedShort();
			}
			else if (opcode == 97)
				aBoolean3056 = true;
			else if (opcode == 98)
				aBoolean2998 = true;

			else if (opcode == 99)
			{
				anInt2987 = buffer.getUnsigned();
				anInt3008 = buffer.getUnsignedShort();
			}
			else if (opcode == 100)
			{
				anInt3038 = buffer.getUnsigned();
				anInt3013 = buffer.getUnsignedShort();
			}
			else if (opcode == 101)
				anInt2958 = buffer.getUnsigned();
			else if (opcode == 102)
				anInt3006 = buffer.getUnsignedShort();
			else if (opcode == 103)
				anInt2977 = 0;
			else if (opcode == 104)
				anInt3024 = buffer.getUnsigned();
			else if (opcode == 105)
				aBoolean3007 = true;

			else if (opcode == 106)
			{
				int count = buffer.getUnsigned();
				int total = 0;
				anIntArray3019 = new int[count];
				anIntArray2995 = new int[count];
				for (int i = 0; i != count; ++i)
				{
					anIntArray3019[i] = buffer.getUnsignedShort();
					if (anIntArray3019[i] == 0xffff)
						anIntArray3019[i] = -1;

					if (i == 0)
						anInt781 = anIntArray3019[i];

					total += anIntArray2995[i] = buffer.getUnsigned();
				}

				for (int i = 0; i != count; ++i)
					anIntArray2995[i] = anIntArray2995[i] * 0xffff / total;

			}
			else if (opcode == 107)
				anInt2994 = buffer.getUnsignedShort();

			else if (opcode >= 150 && opcode < 155)
			{
				if (actions == null)
					actions = new String[5];

				actions[opcode - 150] = buffer.getString();
				//if (!aClass112_3028.aBoolean1431)
				//	actions[opcode - 150] = null;

			}
			else if (opcode == 160)
			{
				int count = buffer.getUnsigned();
				anIntArray2981 = new int[count];
				for (int i = 0; i != count; ++i)
					anIntArray2981[i] = buffer.getUnsignedShort();

			}
			else if (opcode == 162)
			{
				aByte3027 = (byte) 3;
				anInt3023 = buffer.getInt();
			}
			else if (opcode == 163)
			{
				aByte2974 = buffer.get();
				aByte3045 = buffer.get();
				aByte3052 = buffer.get();
				aByte2960 = buffer.get();
			}
			else if (opcode == 164)
				anInt2964 = buffer.getSignedShort();
			else if (opcode == 165)
				anInt2963 = buffer.getSignedShort();
			else if (opcode == 166)
				anInt3018 = buffer.getSignedShort();
			else if (opcode == 167)
				anInt2983 = buffer.getUnsignedShort();
			else if (opcode == 168)
				aBoolean2961 = true;
			else if (opcode == 169)
				aBoolean2993 = true;
			else if (opcode == 170)
				anInt3032 = buffer.getUnsignedSmart();
			else if (opcode == 171)
				anInt2962 = buffer.getUnsignedSmart();

			else if (opcode == 173)
			{
				anInt3050 = buffer.getUnsignedShort();
				anInt3020 = buffer.getUnsignedShort();
			}
			else if (opcode == 177)
				aBoolean2992 = true;
			else if (opcode == 178)
				anInt2975 = buffer.getUnsigned();

			else if (opcode == 249)
			{
				int count = buffer.getUnsigned();
				if (aHashTable3014 == null)
					aHashTable3014 = new Hashtable<Integer, Object>();

				for (int i = 0; i != count; ++i)
				{
					boolean string = buffer.getUnsigned() == 1;
					int key = buffer.getMedium();
					Object value = string ? buffer.getString():buffer.getInt();
					aHashTable3014.put(new Integer(key), value);
				}

			}
			else
			{
				System.out.println("[ObjectDef] Unknown opcode: " + opcode);
				break;
			}
		}
		if (anInt3057 == -1)
		{
			anInt3057 = 0;
			if (anIntArray776 != null && anIntArray776.length == 1 && anIntArray776[0] == 10)
				anInt3057 = 1;

			if (anInt3057 == 0 && actions != null)
				for (int i = 0; i != 5; ++i)
					if (actions[i] != null)
					{
						anInt3057 = 1;
						break;
					}


		}
		if (anInt760 == -1)
			anInt760 = anInt3010 == 0 ? 0:1;

		if (anIntArray3019 != null || aBoolean2998 || childrenIDs != null)
			aBoolean2992 = true;

		hasActions = anInt3057 == 1;
	}

	private void skip(Stream buffer)
	{
		int count = buffer.getUnsigned();
		for (int i = 0; i != count; ++i)
		{
			++buffer.currentOffset;
			int childCount = buffer.getUnsigned();
			buffer.currentOffset += childCount * 2;
		}

	}

	public boolean aBoolean767;
	public byte[] description;
	public static boolean hasActions;

	public int anInt746;
	public static int mapSceneId;
	public int anInt781;
	public boolean aBoolean762;
	public boolean aBoolean764;
	public boolean aBoolean757;

	public void setDefaults()
	{
		aBoolean767 = true;
		aBoolean757 = true;
		hasActions = false;
		aBoolean762 = false;
		aBoolean764 = false;
		anInt746 = -1;
		mapSceneId = -1;
		anInt781 = -1;

		anInt3030 = 0;
		aBoolean2961 = false;
		aByte2974 = 0;
		aByte3045 = 0;
		aByte3052 = 0;
		anIntArray776 = null;
		aByteArray2996 = null;
		originalModelTextures = null;
		originalModelColors = null;
		modifiedModelTextures = null;
		modifiedModelColors = null;
		anIntArray2981 = null;
		childrenIDs = null;
		anIntArray3036 = null;
		anIntArrayArray3031 = null;
		actions = null;
		aHashTable3014 = null;

		aBoolean2972 = true;
		anInt772 = 128;
		anInt2963 = 0;
		aByte2960 = (byte) 0;
		anInt2983 = 0;
		anInt2971 = 0;
		sizeY = 1;
		anInt2987 = -1;
		anInt2975 = 0;
		anInt2964 = 0;
		anInt748 = 128;
		name = "null";
		anInt783 = 0;
		aBoolean3002 = false;
		anInt760 = -1;
		anInt2994 = -1;
		anInt2977 = -1;
		anInt3012 = 0;
		anInt3015 = -1;
		anInt774 = -1;
		aBoolean766 = false;
		aBoolean3007 = false;
		anInt740 = 128;
		anInt3018 = 0;
		anInt3024 = 0xff;
		anInt2958 = 0;
		anIntArray3019 = null;
		anInt3023 = -1;
		anInt2989 = 0;
		anInt3008 = -1;
		anInt3032 = 960;
		aBoolean3000 = true;
		anInt775 = 64;
		anIntArray2995 = null;
		aByte3027 = (byte) 0;
		anInt3020 = 256;
		anInt3038 = -1;
		anInt738 = 0;
		aByte737 = 0;
		anInt3010 = 2;
		aBoolean2993 = false;
		aBoolean2998 = false;
		anInt745 = 0;
		anInt768 = 0;
		anInt3050 = 256;
		anInt3026 = 0;
		aBoolean736 = false;
		aBoolean2990 = false;
		aBoolean3034 = true;
		aBoolean2992 = false;
		aBoolean769 = false;
		sizeX = 1;
		anInt2962 = 0;
		anInt3006 = -1;
		anInt749 = -1;
		anInt3013 = -1;
		aBoolean779 = true;
		aBoolean3056 = false;
		aBoolean751 = false;
		anInt3057 = -1;
	}

	public int type;

	//private static final Model[] aModelArray741s = new Model[4];
	public static boolean lowMem;
	private static Stream buffer;
	private static int[] streamIndices;
	public static Client clientInstance;
	private static int cacheIndex;
	public static Cache mruNodes2 = new Cache(30);
	public static Cache mruNodes1 = new Cache(500);
	private static ObjectDef[] cache;
	public static int totalObjects;

	public int anInt2958;
	public int anInt2962;
	public int anInt2963;
	public int anInt2964;
	public int anInt738;
	public int anInt748;
	public int anInt760;
	public int anInt2971;
	public int anInt772;
	public int anInt2975;
	public int anInt2977;
	public int anInt2983;
	public int anInt783;
	public int sizeY;
	public int anInt2987;
	public int anInt2989;
	public int anInt2994;
	public int anInt3006;
	public int anInt3008;
	public int anInt740;
	public int anInt3010;
	public int anInt775;
	public int anInt3012;
	public int anInt3013;
	public int anInt3015;
	public static int anInt774;
	public int anInt3018;
	public int anInt3020;
	public int anInt3023;
	public int anInt3024;
	public int anInt3026;
	public int anInt3030;
	public int anInt3032;
	public static int anInt749;
	public int anInt745;
	public int anInt3038;
	public int anInt768;
	public int aByte737;
	public int anInt3050;
	public int sizeX;
	public int anInt3057;
	public boolean aBoolean2961;
	public boolean aBoolean2972;
	public boolean aBoolean2990;
	public boolean aBoolean2992;
	public boolean aBoolean2993;
	public boolean aBoolean2998;
	public boolean aBoolean3000;
	public boolean aBoolean3002;
	public boolean aBoolean3007;
	public boolean aBoolean766;
	public boolean aBoolean779;
	public boolean aBoolean3034;
	public boolean aBoolean751;
	public boolean aBoolean736;
	public boolean aBoolean769;
	public boolean aBoolean3056;
	public byte aByte2960;
	public byte aByte2974;
	public byte aByte3027;
	public byte aByte3045;
	public byte aByte3052;
	public int[] anIntArray776;
	public byte[] aByteArray2996;
	public short[] originalModelTextures;
	public short[] originalModelColors;
	public short[] modifiedModelTextures;
	public short[] modifiedModelColors;
	public int[] anIntArray2981;
	public static int[] childrenIDs;
	public int[] anIntArray2995;
	public int[] anIntArray3019;
	public int[] anIntArray3036;
	public int[][] anIntArrayArray3031;
	public String[] actions;
	public String name;
	public Hashtable<Integer, Object> aHashTable3014;

	private final static int[] hotSpotIDs = new int[] {13374, 13375, 13376, 13377, 13378, 39260, 39261, 39262, 39263, 39264, 39265, 2715, 13366, 13367, 13368, 13369, 13370, 13371, 13372, 15361, 15362, 15363, 15366, 15367, 15364, 15365, 15410, 15412, 15411, 15414, 15415, 15413, 15416, 15416, 15418, 15419, 15419, 15419, 15419, 15419, 15419, 15419, 15419, 15402, 15405, 15401, 15398, 15404, 15403, 15400, 15400, 15399, 15302, 15302, 15302, 15302, 15302, 15302, 15304, 15303, 15303, 15301, 15300, 15300, 15300, 15300, 15299, 15299, 15299, 15299, 15298, 15443, 15445, 15447, 15446, 15444, 15441, 15439, 15448, 15450, 15266, 15265, 15264, 15263, 15263, 15263, 15263, 15263, 15263, 15263, 15263, 15267, 15262, 15260, 15261, 15268, 15379, 15378, 15377, 15386, 15383, 15382, 15384, 34255, 15380, 15381, 15346, 15344, 15345, 15343, 15342, 15296, 15297, 15297, 15294, 15293, 15292, 15291, 15290, 15289, 15288, 15287, 15286, 15282, 15281, 15280, 15279, 15278, 15277, 15397, 15396, 15395, 15393, 15392, 15394, 15390, 15389, 15388, 15387, 44909, 44910, 44911, 44907, 44908, 15423, 15423, 15423, 15423, 15420, 48662, 15422, 15421, 15425, 15425, 15424, 18813, 18814, 18812, 18815, 18811, 18810, 15275, 15275, 15271, 15271, 15276, 15270, 15269, 15270, 15274, 15273, 15406, 15407, 15408, 15409, 15368, 15375, 15375, 15375, 15375, 15376, 15376, 15376, 15376, 15373, 15373, 15374, 15374, 15370, 15371, 15372, 15369, 15426, 15426, 15435, 15438, 15434, 15434, 15431, 15431, 15431, 15431, 15436, 15436, 15436, 15436, 15436, 15436, 15437, 15437, 15437, 15437, 15437, 15437, 15350, 15348, 15347, 15351, 15349, 15353, 15352, 15354, 15356, 15331, 15331, 15331, 15331, 15355, 15355, 15355, 15355, 15330, 15330, 15330, 15330, 15331, 15331, 15323, 15325, 15325, 15324, 15324, 15329, 15328, 15326, 15327, 15325, 15325, 15324, 15324, 15330, 15330, 15330, 15330, 15331, 15331, 34138, 15330, 15330, 34138, 34138, 15330, 34138, 15330, 15331, 15331, 15337, 15336, 39230, 39231, 36692, 39229, 36676, 34138, 15330, 15330, 34138, 34138, 15330, 34138, 15330, 15331, 15331, 36675, 36672, 36672, 36675, 36672, 36675, 36675, 36672, 15331, 15331, 15330, 15330, 15257, 15256, 15259, 15259, 15327, 15326};
	
	public static ObjectDef forID(int id)
	{
	
		if(id == 1631)
			id = 37091;
		if(id == 1632)
			id = 39892;
		if(id == 38755)
			id = 1309;
		if(id == 38785 || id == 38760 || id == 5660 || id == 38783 || id == 38731 || id == 38787 || id == 38786)
			id = 1276;
		//if(id > 38000 && id < 40000)//bad tops
			//id = -1;
		if((id > 40290 && id < 40410) || id == 33915 || id == 44336 || id == 38758 ||  id == 37470  ||  id == 37470 ||  id == 38795 || id == 37540 || id == 38437 || id == 38732 || id == 38739 || id == 38791 || id == 38736 || id == 37533 || id == 37548)//bad tree tops
			id = -1;
	
		//System.out.println(id);
		/*for (int j = 0; j < 50; j++)
			if (cache[j].type == id)
				return cache[j];*/

		cacheIndex = (cacheIndex + 1) % 50;
		ObjectDef object = cache[cacheIndex];
		object.type = id;
		object.setDefaults();
		if (id >= 0 && id < totalObjects && streamIndices[id] != -1)
		{
			buffer.currentOffset = streamIndices[id];
			object.readValues(buffer);
			if(Configuration.allObjectsHaveExamine)
				ObjectDef.hasActions = true;
		}
		if(ObjectDef.anInt774 <= 484 && ObjectDef.anInt774 >= 469) {
			ObjectDef.anInt749 = ObjectDef.anInt774;
			ObjectDef.anInt774 = -1;
		}
		switch (id) {//by modelid
		case 6969:
			ObjectDef.hasActions = true;
			object.actions = new String[5];
			object.actions[0] = "Board (City)";
			object.actions[1] = "Board (Dragontooth Island)";
			break;
			
		case 45238:
			object.name = "Grand Exchange booth";
			ObjectDef.hasActions = true;
			object.actions = new String[5];
			object.actions[0] = "Exchange";
			break;
		case 42377:
		case 42378:
		case 42373:
		case 42379:
		case 42217:
		case 42218:
			object.name = "Counter";
			ObjectDef.hasActions = true;
			object.actions = new String[5];
			object.actions[0] = "Use";
			object.actions[1] = "Use-quickly";
		break;
		case 1308://fixes target to tree...
			object.name = "Willow";
			object.actions[0] = "Chop down";
			object.anIntArrayArray3031[0][0] = 5528;
		break;
		case 28209:
			object.name = "Low-level orb";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30262;
			break;
		case 28210:
			object.name = "Mid-level orb";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30262;
			break;
		case 28211:
			object.name = "High-level orb";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30262;
			break;
		case 28119:
			object.name = "Low-level crater";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30147;
			break;
		case 28120:
			object.name = "Med-level crater";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30149;
			break;
		case 28121:
			object.name = "High-level crater";
			object.anIntArrayArray3031 = new int[1][1];
			object.anIntArrayArray3031[0][0] = 30144;
			break;
		}
		if (id >= 30195 && id < 30205) {
			object.aBoolean769 = false;
		}
		if(id >= 5000 && id <= 5500) {
			object.aBoolean769 = false;
		}
		if(id >= 12314 && id <= 12541) {
			object.aBoolean769 = false;
		}
		if(id == 21273 || id == 1278 || id == 1281 || id == 1308 || id == 1406 || id == 1276 || id == 1282) {
			object.aBoolean762 = false;
		}
		if(id == 26420 || id == 26421 || id == 26422) {
			object.aBoolean762 = true;
		}
		
		
		/* Construction Objects */
		if(id == 34255)
		{
			ObjectDef.anInt749 = 8002;
			ObjectDef.childrenIDs = new int[]
					{
						15385
					};
		}
		if (id == 13830) {

			ObjectDef.hasActions = false;
			ObjectDef.anInt749 = 8003;
			ObjectDef.childrenIDs = new int[] { 13217, 13218, 13219, 13220,
					13221, 13222, 13223 };
		}
		
		
		if(id == 42082 || id == 42083)
			ObjectDef.mapSceneId = 0;
		if(id >= 42087 && id <= 42117)
			ObjectDef.mapSceneId = 4;
		
		for(int i1 : hotSpotIDs)
		{
			if(i1 == id)
			{
				//System.out.println(ObjectDef.mapSceneId);
				ObjectDef.anInt749 = 8000;
				ObjectDef.childrenIDs = new int[] {id, 0-1};
			}
		}
		if(id == 15314 || id == 15313)
		{
			ObjectDef.anInt749 = 8000;
			ObjectDef.childrenIDs = new int[] {id, -1};
		}
		
		if(id == 15306)
		{
			ObjectDef.anInt749 = 8001;
			ObjectDef.childrenIDs = new int[] {id,-1, 13015};
		}
		if(id == 15305)
		{
			ObjectDef.anInt749 = 8001;
			ObjectDef.childrenIDs = new int[] {id, -1, 13016};	
		}
		if(id == 15317)
		{
			ObjectDef.anInt749 = 8001;
			ObjectDef.childrenIDs = new int[] {id, -1, 13096};	
		}
		if(id == 8550)
		{
			ObjectDef.childrenIDs = new int[] 
			{
				8576, 8575, 8574, 8573, 8576, 8576, 8558, 8559, 8560, 8561, 8562, 8562, 8562, 8580, 8581, 8582, 8583, 8584, 8584, 8584, 8535, 8536, 8537, 8538, 8539, 8539, 8539, 8641, 8642, 8643, 8644, 8645, 8645, 8645, 8618, 8619, 8620, 8621, 8622, 8623, 8624, 8624, 8624, 8595, 8596, 8597, 8598, 8599, 8600, 8601, 8601, 8601, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8664, 8664, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8563, 8564, 8565, 8566, 8576, 8576, 8576, 8585, 8586, 8587, 8588, 8576, 8576, 8576, 8540, 8541, 8542, 8543, 8576, 8576, 8576, 8646, 8647, 8648, 8649, 8576, 8576, 8576, 8625, 8626, 8627, 8628, 8629, 8630, 8576, 8576, 8576, 8602, 8603, 8604, 8605, 8606, 8607, 8576, 8576, 8576, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8567, 8568, 8569, 8576, 8576, 8576, 8576, 8589, 8590, 8591, 8576, 8576, 8576, 8576, 8544, 8545, 8546, 8576, 8576, 8576, 8576, 8650, 8651, 8652, 8576, 8576, 8576, 8576, 8631, 8632, 8633, 8634, 8635, 8576, 8576, 8576, 8576, 8608, 8609, 8610, 8611, 8612, 8576, 8576, 8576, 8576, 8673, 8674, 8675, 8676, 8677, 8678, 8679, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8570, 8571, 8572, 8576, 8576, 8576, 8576, 8592, 8593, 8594, 8576, 8576, 8576, 8576, 8547, 8548, 8549, 8576, 8576, 8576, 8576, 8653, 8654, 8655, 8576, 8576, 8576, 8576, 8636, 8637, 8638, 8639, 8640, 8576, 8576, 8576, 8576, 8613, 8614, 8615, 8616, 8617, 8576, 8576, 8576, 8576, 8680, 8681, 8682, 8683, 8684, 8685, 8686, 8576, 8576, 8576, 8576
			};
		}
		if(id == 8551)
		{
			ObjectDef.childrenIDs = new int[] 
			{
					8576, 8575, 8574, 8573, 8576, 8576, 8558, 8559, 8560, 8561, 8562, 8562, 8562, 8580, 8581, 8582, 8583, 8584, 8584, 8584, 8535, 8536, 8537, 8538, 8539, 8539, 8539, 8641, 8642, 8643, 8644, 8645, 8645, 8645, 8618, 8619, 8620, 8621, 8622, 8623, 8624, 8624, 8624, 8595, 8596, 8597, 8598, 8599, 8600, 8601, 8601, 8601, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8664, 8664, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8563, 8564, 8565, 8566, 8576, 8576, 8576, 8585, 8586, 8587, 8588, 8576, 8576, 8576, 8540, 8541, 8542, 8543, 8576, 8576, 8576, 8646, 8647, 8648, 8649, 8576, 8576, 8576, 8625, 8626, 8627, 8628, 8629, 8630, 8576, 8576, 8576, 8602, 8603, 8604, 8605, 8606, 8607, 8576, 8576, 8576, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8567, 8568, 8569, 8576, 8576, 8576, 8576, 8589, 8590, 8591, 8576, 8576, 8576, 8576, 8544, 8545, 8546, 8576, 8576, 8576, 8576, 8650, 8651, 8652, 8576, 8576, 8576, 8576, 8631, 8632, 8633, 8634, 8635, 8576, 8576, 8576, 8576, 8608, 8609, 8610, 8611, 8612, 8576, 8576, 8576, 8576, 8673, 8674, 8675, 8676, 8677, 8678, 8679, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8576, 8570, 8571, 8572, 8576, 8576, 8576, 8576, 8592, 8593, 8594, 8576, 8576, 8576, 8576, 8547, 8548, 8549, 8576, 8576, 8576, 8576, 8653, 8654, 8655, 8576, 8576, 8576, 8576, 8636, 8637, 8638, 8639, 8640, 8576, 8576, 8576, 8576, 8613, 8614, 8615, 8616, 8617, 8576, 8576, 8576, 8576, 8680, 8681, 8682, 8683, 8684, 8685, 8686, 8576, 8576, 8576, 8576
			};
		}
		if(id == 7847)
		{
			ObjectDef.childrenIDs = new int[] 
			{
					7843, 7842, 7841, 7840, 7843, 7843, 7843, 7843, 7867, 7868, 7869, 7870, 7871, 7899, 7900, 7901, 7902, 7903, 7883, 7884, 7885, 7886, 7887, 7919, 7920, 7921, 7922, 7923, 7851, 7852, 7853, 7854, 7855, 7918, 7917, 7916, 7915, 41538, 41539, 41540, 41541, 41542, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7872, 7873, 7874, 7875, 7843, 7904, 7905, 7906, 7907, 7843, 7888, 7889, 7890, 7891, 7843, 7924, 7925, 7926, 7927, 7843, 7856, 7857, 7858, 7859, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7876, 7877, 7878, 7843, 7843, 7908, 7909, 7910, 7843, 7843, 7892, 7893, 7894, 7843, 7843, 7928, 7929, 7930, 7843, 7843, 7860, 7861, 7862, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7879, 7880, 7881, 7882, 7843, 7911, 7912, 7913, 7914, 7843, 7895, 7896, 7897, 7898, 7843, 7931, 7932, 7933, 7934, 7843, 7863, 7864, 7865, 7866, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843, 7843
			};
		}
		if(id == 8150)
		{
			ObjectDef.childrenIDs = new int[] 
			{
					8135, 8134, 8133, 8132, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 21101, 21127, 21159, 21178, 21185, 21185, 21185, 17776, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 17777, 17778, 17780, 17781, 17781, 17781, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8144, 8145, 8146, 8147, 8148, 8149, 8144, 8145, 8146, 8144, 8145, 8146, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 9044, 9045, 9046, 9047, 9048, 9048, 9049, 9050, 9051, 9052, 9053, 9054, 8139, 8140, 8141, 8142, 8143, 8143, 8143, 8144, 8145, 8146, 8135, 8135, 8135, 8135, 8135, 8135, -1, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135, 8135
			};
		}
		switch (id) {
		//case 15639:
		//case 15640:
		case 23268:
		case 26420:
		case 23271:
		case 23261:
		case 23262:
		case 23263:
		case 23264:
		case 23265:
		case 23266:
		case 23267:
		case 26341:
		case 26421:
		case 26422:
		case 30240:
		case 32683:
		case 33758:
		case 33759:
		case 33760:
		case 48407:
		case 48408: 
		case 11448:
		case 16039:
		case 16040:
		case 16041:
		case 41198:
		case 41202:
		case 41203:
		case 41519:
			object.aBoolean769 = false;
			break;
		case 48284:
		case 48312:
			object.anInt745 = 60;
			break;
		case 61880://GE bridge
			object.anInt745 = 0;
			break;
		case 48340:
		case 48281:
		case 48341:
		case 48339:
		case 48286:
			object.anInt745 = 120;
			break;
		case 48342:
			object.anInt745 = 140;
			break;
		case 48343:
			object.anInt745 = 40;
			break;
		case 48282:
			object.anInt745 = 180;
			break;
		case 12201:
			ObjectDef.hasActions = false;
			break;
		}
		
		if(id > 44843 && id < 44907)
			ObjectDef.hasActions = false;
		
		return object;
	}

	public static void clearCache()
	{
		if (cache != null)
			for (int i = 0; i != 50; ++i)
			{
				cache[i].type = -1;
				cache[i].setDefaults();
			}

	}

	public void method574(OnDemandFetcher updateManager)
	{
		if (anIntArrayArray3031 == null)
			return;

		for (int i = 0; i != anIntArrayArray3031.length; ++i)
			for (int i1 = 0; i1 != anIntArrayArray3031[i].length; ++i1)
				Model.method463(anIntArrayArray3031[i][i1] & 0xffff);//updateManager.request(1, anIntArrayArray3031[i][i1] & 0xffff, true, true);//should this be important?


	}

	public static void nullLoader()
	{
		mruNodes1 = null;
		mruNodes2 = null;
		modelBuffer1 = null;
		modelBuffer2 = null;
		streamIndices = null;
		cache = null;
		buffer = null;
	}

	public static void nullLoaderSafe()
	{
		mruNodes1.unlinkAll();
		mruNodes2.unlinkAll();
		for (int i = 0; i != 256; ++i)
		{
			modelBuffer1[i] = null;
			modelBuffer2[i] = null;
		}

		streamIndices = null;
		cache = null;
		buffer = null;
	}

	public static void unpackConfig(byte[] dat, byte[] idx)
	{
		buffer = new Stream(dat);
		totalObjects = idx.length / 2;
		streamIndices = new int[totalObjects];
		int index = 0;
		Stream indexBuffer = new Stream(idx);
		for (int i = 0; i != totalObjects; ++i)
		{
			int size = indexBuffer.getUnsignedShort();
			streamIndices[i] = size != 0 ? index:-1;
			index += size;
		}

		cache = new ObjectDef[50];
		for (int k = 0; k < 50; k++)
			cache[k] = new ObjectDef();

		/*try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("objects.txt"));
			try
			{
				for (int i = 0; i != totalObjects; ++i)
				{
					ObjectDef def = forID(i);
					writer.write(i + "	" + def.name);
					writer.newLine();
				}

			}
			finally
			{
				writer.close();
			}
		}
		catch (Exception ex) { }*/
	}

	public boolean method577(int type)
	{
		if (anIntArray776 == null)
		{
			if (anIntArrayArray3031 == null)
				return true;

			if (type != 10)
				return true;

			boolean flag = true;
			int count = anIntArrayArray3031.length;
			for (int i = 0; i != count; ++i)
			{
				int childCount = anIntArrayArray3031[i].length;
				for (int i1 = 0; i1 != childCount; ++i1)
					flag &= Model.method463(anIntArrayArray3031[i][i1] & 0xffff);

			}

			return flag;
		}
		boolean flag = true;
		int count = anIntArray776.length;
		for (int i = 0; i != count; ++i)
			if (anIntArray776[i] == type)
			{
				int childCount = anIntArrayArray3031[i].length;
				for (int i1 = 0; i1 != childCount; ++i1)
					flag &= Model.method463(anIntArrayArray3031[i][i1] & 0xffff);

				break;
			}

		return flag;
	}

	public Model method578(int i, int j, int k, int l, int i1, int j1, int k1, Animation animDef)
	{
		Model model = method581(i, k1, j, animDef);
		if (model == null)
			return null;
		if (aBoolean762 || aBoolean769)
			model = new Model(aBoolean762, aBoolean769, model);
		if (aBoolean762)
		{
			//Fix this so it can do it while upscaled?
			int l1 = (k + l + i1 + j1) >> 2;
		for(int i2 = 0; i2 < model.numVertices; i2++)
		{
			int j2 = model.verticesX[i2] >> 2;
		int k2 = model.verticesZ[i2] >> 2;
			int l2 = k + (((l - k) * (j2 + 64)) >> 7);
			int i3 = j1 + (((i1 - j1) * (j2 + 64)) >> 7);
			int j3 = l2 + (((i3 - l2) * (k2 + 64)) >> 7);
			model.verticesY[i2] += (j3 - l1) << 2;
		}

		model.method467();
		}
		return model;
	}

	public boolean method579()
	{
		if (anIntArrayArray3031 == null)
			return true;

		boolean flag = true;
		int count = anIntArrayArray3031.length;
		for (int i = 0; i != count; ++i)
		{
			int childCount = anIntArrayArray3031[i].length;
			for (int i1 = 0; i1 != childCount; ++i1)
				flag &= Model.method463(anIntArrayArray3031[i][i1] & 0xffff);

		}

		return flag;
	}

	public ObjectDef method580()
	{
		int i = -1;
		if (anInt774 != -1)
		{
			VarBit variableBit = VarBit.cache[anInt774];
			int j = variableBit.anInt648;
			int k = variableBit.anInt649;
			int l = variableBit.anInt650;
			int i1 = Client.anIntArray1232[l - k];
			i = clientInstance.variousSettings[j] >> k & i1;
		}
		else if (anInt749 != -1)
			i = clientInstance.variousSettings[anInt749];
		if (i < 0 || i >= childrenIDs.length || childrenIDs[i] == -1)
			return null;
		else
			return forID(childrenIDs[i]);
	}

	private static Model[] modelBuffer1 = new Model[256];
	private static Model[] modelBuffer2 = new Model[256];

	private Model method581(int j, int k, int l, Animation animDef)
	{
		Model model = null;
		long l1;
		if (anIntArray776 == null)
		{
			if (j != 0)
				return null;

			l1 = (long) ((type << 8) + l) + ((long) (k + 1) << 32);
			Model model_1 = (Model) mruNodes2.insertFromCache(l1);
			//Model model_1 = null;
			if (model_1 != null)
				return model_1;

			if (anIntArrayArray3031 == null)
				return null;

			boolean flag = aBoolean751 ^ (l > 3);
			int count = anIntArrayArray3031.length;
			for (int i = 0; i != count; ++i)
			{
				int childCount = anIntArrayArray3031[i].length;
				for (int i1 = 0; i1 != childCount; ++i1)
				{
					int id = anIntArrayArray3031[i][i1];
					if (flag)
						id += 0x10000;

					model = null;//model = (Model) mruNodes1.insertFromCache(id);
					if (model == null)
					{
						model = Model.method462(id & 0xffff);
						if (model == null)
							return null;

						if (flag)
							model.method477();

						mruNodes1.removeFromCache(model, id);
					}
					if (childCount > 1)
						modelBuffer2[i1] = model;

				}

				if (childCount > 1)
					model = new Model(childCount, modelBuffer2);

				if (count > 1)
					modelBuffer1[i] = model;

			}

			if (count > 1)
				model = new Model(count, modelBuffer1);

		}
		else
		{
			int i1 = -1;
			int count = anIntArray776.length;
			for (int j1 = 0; j1 < count; j1++)
			{
				if (anIntArray776[j1] != j)
					continue;

				i1 = j1;
				break;
			}

			if (i1 == -1)
				return null;

			l1 = (long) ((type << 6) + (i1 << 3) + l) + ((long) (k + 1) << 32);
			//model = (Model) mruNodes2.insertFromCache(l1);
			model = null;
			if (anIntArrayArray3031 == null)
				return null;

			boolean flag = aBoolean751 ^ (l > 3);
			int childCount = anIntArrayArray3031[i1].length;
			for (int i = 0; i != childCount; ++i)
			{
				int id = anIntArrayArray3031[i1][i];
				if (flag)
					id += 0x10000;

				//model = (Model) mruNodes1.insertFromCache(id);
				model = null;
				if (model == null)
				{
					model = Model.method462(id & 0xffff);
					if (model == null)
						return null;

					if (flag)
						model.method477();

					mruNodes1.removeFromCache(model, id);
				}
				if (childCount > 1)
					modelBuffer1[i] = model;

			}

			if (childCount > 1)
				model = new Model(childCount, modelBuffer1);

		}
		boolean flag;
		flag = anInt748 != 128 || anInt772 != 128 || anInt740 != 128;
		boolean flag2;
		flag2 = anInt738 != 0 || anInt745 != 0 || anInt783 != 0;
		int flags = 0;
		if (k != -1)
			flags |= Model.getFlags(k, animDef);

		if (flag2 || flag)
			flags |= 0x4;

		if (modifiedModelColors != null)
			flags |= 0x2;

		if (modifiedModelTextures != null)
			flags |= 0x8;

		if (l > 0)
			flags |= 0x4;

		Model model_3 = new Model(flags, model);//modifiedModelColors == null && modifiedModelTextures == null, Skeleton.method532(k), l == 0 && k == -1 && !flag && !flag2
		if (k != -1)
		{
			model_3.method469();
			model_3.method470(k, animDef);
			model_3.anIntArrayArray1658 = null;
			model_3.anIntArrayArray1657 = null;
		}
		while (l-- > 0)
			model_3.method473();

		if (modifiedModelColors != null)
			for (int k2 = 0; k2 < modifiedModelColors.length; k2++)
				model_3.setColor(modifiedModelColors[k2], originalModelColors[k2]);


		if (modifiedModelTextures != null)
			for (int k2 = 0; k2 < modifiedModelTextures.length; k2++)
				model_3.setTexture(modifiedModelTextures[k2], originalModelTextures[k2]);


		if (flag)
			model_3.method478(anInt748, anInt740, anInt772);//+2???

		if (flag2)
			model_3.translate(anInt738, anInt745, anInt783);

		model_3.method479(64 + aByte737, 768 + anInt3026, -50, -10, -50, !aBoolean769, false);
		if (anInt760 == 1)
			model_3.anInt1654 = model_3.modelHeight;

		mruNodes2.removeFromCache(model_3, l1);
		return model_3;
	} // that method need redoing i think ic ima get off tv 

	private ObjectDef()
	{
		type = -1;
	}

	public boolean hasActions()
	{
		return hasActions;
	}

	public boolean solid()
	{
		return aBoolean757;
	}

	public int xLength()
	{
		return sizeX;
	}

	public int yLength()
	{
		return sizeY;
	}
}
