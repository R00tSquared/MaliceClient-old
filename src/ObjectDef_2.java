import sign.signlink;

public final class ObjectDef_2 {

	public static ObjectDef_2 forID(int i) {
		if (i > streamIndices.length)
			i = streamIndices.length - 1;
		for (int j = 0; j < 20; j++)
			if (cache[j].type == i)
				return cache[j];
		cacheIndex = (cacheIndex + 1) % 20;
		ObjectDef_2 class46 = cache[cacheIndex];
		try {
		stream.currentOffset = streamIndices[i];
		} catch(Exception e) {}
		class46.type = i;
		class46.setDefaults();
		class46.readValues(stream);
		return class46;
	}

	public void setDefaults() {
		anIntArray773 = null;
		anIntArray776 = null;
		name = null;
		description = null;
		modifiedModelColors = null;
		originalModelColors = null;
		anInt744 = 1;
		anInt761 = 1;
		aBoolean767 = true;
		aBoolean757 = true;
		hasActions = false;
		aBoolean762 = false;
		aBoolean769 = false;
		aBoolean764 = false;
		anInt781 = -1;
		anInt775 = 16;
		aByte737 = 0;
		aByte742 = 0;
		actions = null;
		anInt746 = -1;
		anInt758 = -1;
		aBoolean751 = false;
		aBoolean779 = true;
		anInt748 = 128;
		anInt772 = 128;
		anInt740 = 128;
		anInt768 = 0;
		anInt738 = 0;
		anInt745 = 0;
		anInt783 = 0;
		aBoolean736 = false;
		aBoolean766 = false;
		anInt760 = -1;
		anInt774 = -1;
		anInt749 = -1;
		childrenIDs = null;
	}

	public static void nullLoader() {
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(FileOperations.ReadFile(signlink.findcachedir() + "loc2.dat"));
		Stream stream = new Stream(FileOperations.ReadFile(signlink.findcachedir() + "loc2.idx"));
		int totalObjects = stream.getUnsignedShort();
		streamIndices = new int[totalObjects];
		int i = 2;
		for (int j = 0; j < totalObjects; j++) {
			streamIndices[j] = i;
			i += stream.getUnsignedShort();
		}
		cache = new ObjectDef_2[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new ObjectDef_2();
	}
	

	private void readValues(Stream stream) {
		int i = -1;
		label0: do {
			int j;
			do {
				j = stream.getUnsigned();
				if (j == 0)
					break label0;
				if (j == 1) {
					int k = stream.getUnsigned();
					if (k > 0)
						if (anIntArray773 == null || lowMem) {
							anIntArray776 = new int[k];
							anIntArray773 = new int[k];
							for (int k1 = 0; k1 < k; k1++) {
								anIntArray773[k1] = stream.getUnsignedShort();
								if(anIntArray773[k1] > 65517)
								anIntArray773[k1] = 10;
								anIntArray776[k1] = stream.getUnsigned();
							}
						} else {
							stream.currentOffset += k * 3;
						}
				} else if (j == 2)
					name = stream.readString();
				else if (j == 3)
					description = stream.readBytes();
				else if (j == 5) {
					int l = stream.getUnsigned();
					if (l > 0)
						if (anIntArray773 == null || lowMem) {
							anIntArray776 = null;
							anIntArray773 = new int[l];
							for (int l1 = 0; l1 < l; l1++)
								anIntArray773[l1] = stream.getUnsignedShort();
						} else {
							stream.currentOffset += l * 2;
						}
				} else if (j == 14)
					anInt744 = stream.getUnsigned();
				else if (j == 15)
					anInt761 = stream.getUnsigned();
				else if (j == 17)
					aBoolean767 = false;
				else if (j == 18)
					aBoolean757 = false;
				else if (j == 19) {
					i = stream.getUnsigned();
					if (i == 1)
						hasActions = true;
				} else if (j == 21)
					aBoolean762 = true;
				else if (j == 22)
					aBoolean769 = false; // change to false to fix gowwars waterfalls??
				else if (j == 23)
					aBoolean764 = true;
				else if (j == 24) {
					anInt781 = stream.getUnsignedShort();
					if (anInt781 == 65535)
						anInt781 = -1;
				} else if (j == 28)
					anInt775 = stream.getUnsigned();
				else if (j == 29)
					aByte737 = stream.get();
				else if (j == 39)
					aByte742 = stream.get();
				else if (j >= 30 && j < 39) {
					if (actions == null)
						actions = new String[5];
					actions[j - 30] = stream.readString();
					if (actions[j - 30].equalsIgnoreCase("hidden"))
						actions[j - 30] = null;
				} else if (j == 40) {
					int i1 = stream.getUnsigned();
					modifiedModelColors = new int[i1];
					originalModelColors = new int[i1];
					for (int i2 = 0; i2 < i1; i2++) {
						modifiedModelColors[i2] = stream.getUnsignedShort();
						originalModelColors[i2] = stream.getUnsignedShort();
					}
				} else if (j == 60)
					anInt746 = stream.getUnsignedShort();
				else if (j == 62)
					aBoolean751 = true;
				else if (j == 64)
					aBoolean779 = false;
				else if (j == 65)
					anInt748 = stream.getUnsignedShort();
				else if (j == 66)
					anInt772 = stream.getUnsignedShort();
				else if (j == 67)
					anInt740 = stream.getUnsignedShort();
				else if (j == 68)
					anInt758 = stream.getUnsignedShort();
				else if (j == 69)
					anInt768 = stream.getUnsigned();
				else if (j == 70)
					anInt738 = stream.getSignedShort();
				else if (j == 71)
					anInt745 = stream.getSignedShort();
				else if (j == 72)
					anInt783 = stream.getSignedShort();
				else if (j == 73)
					aBoolean736 = true;
				else if (j == 74) {
					aBoolean766 = true;
				} else {
					if (j != 75)
						continue;
					anInt760 = stream.getUnsigned();
				}
				continue label0;
			} while (j != 77);
			anInt774 = stream.getUnsignedShort();
			if (anInt774 == 65535)
				anInt774 = -1;
			anInt749 = stream.getUnsignedShort();
			if (anInt749 == 65535)
				anInt749 = -1;
			int j1 = stream.getUnsigned();
			childrenIDs = new int[j1 + 1];
			for (int j2 = 0; j2 <= j1; j2++) {
				childrenIDs[j2] = stream.getUnsignedShort();
				if (childrenIDs[j2] == 65535)
					childrenIDs[j2] = -1;
			}

		} while (true);
		if (i == -1) {
			hasActions = anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10);
			if (actions != null)
				hasActions = true;
		}
		if (aBoolean766) {
			aBoolean767 = false;
			aBoolean757 = false;
		}
		if (anInt760 == -1)
			anInt760 = aBoolean767 ? 1 : 0;
	}

	public ObjectDef_2() {
		type = -1;
	}

	public boolean aBoolean736;
	public int aByte737;
	public int anInt738;
	public String name;
	public int anInt740;
	public static final Model[] aModelArray741s = new Model[4];
	public int aByte742;
	public int anInt744;
	public int anInt745;
	public int anInt746;
	public int[] originalModelColors;
	public int anInt748;
	public int anInt749;
	public boolean aBoolean751;
	public static boolean lowMem;
	public static Stream stream;
	public int type;
	public static int[] streamIndices;
	public boolean aBoolean757;
	public int anInt758;
	public int childrenIDs[];
	public int anInt760;
	public int anInt761;
	public boolean aBoolean762;
	public boolean aBoolean764;
	public static Client clientInstance;
	public boolean aBoolean766;
	public boolean aBoolean767;
	public int anInt768;
	public boolean aBoolean769;
	public static int cacheIndex;
	public int anInt772;
	public int[] anIntArray773;
	public int anInt774;
	public int anInt775;
	public int dummy;
	public int[] anIntArray776;
	public byte description[];
	public boolean hasActions;
	public boolean aBoolean779;
	public int anInt781;
	public static ObjectDef_2[] cache;
	public int anInt783;
	public int[] modifiedModelColors;
	public String actions[];

}
