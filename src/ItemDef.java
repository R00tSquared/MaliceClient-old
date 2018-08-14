import java.util.*;

public class ItemDef {
	public ItemDef() {
		id = -1;
	}

	public static void clearCache() {
		if (cache != null)
			for (int i = 0; i != 50; ++i)
				cache[i].id = -1;

	}

	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		streamIndicesOS = null;
		cache = null;
		itembuffer = null;
		itembufferOS = null;
	}

	public static void nullLoaderSafe() {
		mruNodes2.unlinkAll();
		mruNodes1.unlinkAll();
		streamIndices = null;
		streamIndicesOS = null;
		cache = null;
		itembuffer = null;
		itembufferOS = null;
	}

	private static final String[] wears = { "wield", "wear", "hold" };

	private static final String[] consumes = { "drink", "eat" };

	public static Sprite getFeedImage(int id, int size, int color, int zoom) {
		ItemDef item = forID(id);
		if (item.stackIDs == null) {
			size = -1;
		}
		if (size > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++) {
				if (size >= item.stackAmounts[j1] && item.stackAmounts[j1] != 0) {
					i1 = item.stackIDs[j1];
				}
			}
			if (i1 != -1) {
				item = forID(i1);
			}
		}
		Model model = item.getModelForAmount(1);
		if (model == null)
			return null;
		Sprite image = new Sprite(32, 32);
		int centerX = Rasterizer.centerX;
		int centerY = Rasterizer.centerY;
		int lineOffsets[] = Rasterizer.lineOffsets;
		int pixels[] = DrawingArea.pixels;
		int width = DrawingArea.width;
		int height = DrawingArea.height;
		int startX = DrawingArea.topX;
		int endX = DrawingArea.bottomX;
		int startY = DrawingArea.topY;
		int endY = DrawingArea.bottomY;
		Rasterizer.notTextured = false;
		DrawingArea.initDrawingArea(32, 32, image.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.setDefaultBounds();
		int itemZoom = item.modelZoom * zoom - 500;
		int l3 = Rasterizer.SINE[item.modelRotation1] * itemZoom >> 16;
		int i4 = Rasterizer.COSINE[item.modelRotation1] * itemZoom >> 16;
		model.method482(item.modelRotation2, item.anInt204,
				item.modelRotation1, item.modelOffset1, l3 + model.modelHeight
						/ 2 + item.modelOffset2, i4 + item.modelOffset2);
		if (color == 0) {
			for (int index = 31; index >= 0; index--) {
				for (int index2 = 31; index2 >= 0; index2--)
					if (image.myPixels[index + index2 * 32] == 0
							&& index > 0
							&& index2 > 0
							&& image.myPixels[(index - 1) + (index2 - 1) * 32] > 0)
						image.myPixels[index + index2 * 32] = 0x302020;
			}
		}
		DrawingArea.initDrawingArea(height, width, pixels);
		DrawingArea.setDrawingArea(startX, startY, endX, endY);
		Rasterizer.centerX = centerX;
		Rasterizer.centerY = centerY;
		Rasterizer.lineOffsets = lineOffsets;
		Rasterizer.notTextured = true;
		if (item.stackable) {
			image.maxWidth = 33;
		} else {
			image.maxWidth = 32;
		}
		image.maxHeight = size;
		return image;
	}

	public boolean wearable() {
		if (actions != null) {
			for (int i = 0; i != actions.length; ++i) {
				String action = actions[i];
				if (action == null)
					continue;

				action = action.replace('_', ' ').trim().toLowerCase();
				for (int i1 = 0; i1 != wears.length; ++i1)
					if (action.indexOf(wears[i1]) != -1)
						return true;
			}
		}
		return false;
	}

	public boolean consumable() {
		if (actions != null) {
			for (int i = 0; i != actions.length; ++i) {
				String action = actions[i];
				if (action == null)
					continue;

				action = action.replace('_', ' ').trim().toLowerCase();
				for (int i1 = 0; i1 != consumes.length; ++i1)
					if (action.indexOf(consumes[i1]) != -1)
						return true;
			}
		}
		return false;
	}

	public boolean acceptable() {
		return (wearable() || consumable() || name.toLowerCase().contains(
				"rune"));
	}

	public boolean isValid(int anInt1702) {
		if (id < 0 || id >= totalItems)
			return false;

		if (modelID == 0)
			return false;

		if (name == null)
			return false;

		return true;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}
	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model aclass30_sub2_sub4_sub6s[] = { model, model_1 };
			model = new Model(2, aclass30_sub2_sub4_sub6s);
		}
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < originalModelColors.length; i1++)
				model.setColor(originalModelColors[i1], modifiedModelColors[i1]);
		}
		if (modifiedModelTextures != null) {
			for (int i1 = 0; i1 < modifiedModelTextures.length; i1++)
				model.setTexture(modifiedModelTextures[i1],
						originalModelTextures[i1]);
		}
		return model;
	}

	public boolean method195(int j) {
		int k = maleWearModel1;
		int l = femaleWearModel1;
		int i1 = colorEquip1;
		if (j == 1) {
			k = maleWearModel2;
			l = femaleWearModel2;
			i1 = colorEquip2;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = maleWearModel1;
		int k = femaleWearModel1;
		int l = colorEquip1;
		if (i == 1) {
			j = maleWearModel2;
			k = femaleWearModel2;
			l = colorEquip2;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model aclass30_sub2_sub4_sub6_1s[] = { model, model_1, model_3 };
				model = new Model(3, aclass30_sub2_sub4_sub6_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model aclass30_sub2_sub4_sub6s[] = { model, model_2 };
				model = new Model(2, aclass30_sub2_sub4_sub6s);
			}
		if (i == 0 && aByte205 != 0)
			model.translate(0, aByte205, 0);
		if (i == 1 && aByte154 != 0)
			model.translate(0, aByte154, 0);
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < originalModelColors.length; i1++)
				model.setColor(originalModelColors[i1], modifiedModelColors[i1]);
		}
		if (modifiedModelTextures != null) {
			for (int i1 = 0; i1 < modifiedModelTextures.length; i1++)
				model.setTexture(modifiedModelTextures[i1],
						originalModelTextures[i1]);
		}
		return model;
	}
	
	public static void unpackConfig(byte[] dat, byte[] idx) {
		itembuffer = new Stream(dat);
		totalItems = idx.length / 2;
		streamIndices = new int[totalItems];
		int index = 0;
		Stream indexBuffer = new Stream(idx);
		for (int i = 0; i != totalItems; ++i) {
			int size = indexBuffer.getUnsignedShort();
			streamIndices[i] = size != 0 ? index : -1;
			index += size;
		}

		cache = new ItemDef[50];
		for (int k = 0; k < 50; k++)
			cache[k] = new ItemDef();
	}
	
	public static void unpackConfigOS(byte[] dat, byte[] idx) {
		itembufferOS = new Stream(dat);
		totalItemsOS = idx.length / 2;
		System.out.println("Total Items: "+totalItemsOS);
		streamIndicesOS = new int[totalItems];
		int index = 0;
		Stream indexBuffer = new Stream(idx);
		for (int i = 0; i != totalItemsOS; ++i) {
			int size = indexBuffer.getUnsignedShort();
			streamIndicesOS[i] = size != 0 ? index : -1;
			index += size;
		}
	}

	public static ItemDef forID(int i) {
		for (int j = 0; j < 50; j++)
			if (cache[j].id == i)
				return cache[j];

		cacheIndex = (cacheIndex + 1) % 50;
		ItemDef itemDef = cache[cacheIndex];
		itemDef.id = i;
		itemDef.setDefaults();
		int id = i;
		//22335 is last item
		if (id >= 0 && id < totalItems && streamIndices[id] != -1) {
			itembuffer.currentOffset = streamIndices[id];
			itemDef.readValues(itembuffer);
		}
		/*if(id > 23000 && id < 35810 && streamIndicesOS[id-23000] != -1){
			itembufferOS.currentOffset = streamIndicesOS[id-23000];
			itemDef.readValuesOS(itembufferOS);
		}*/
		
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();

		if (itemDef.lendTemplateID != -1)
			itemDef.toLend();

		if (!isMembers && itemDef.membersObject) {
			itemDef.name = "Members Object";
			itemDef.description = Stream
					.toBytes("Login to a members' server to use this object.");
			itemDef.groundActions = null;
			itemDef.actions = null;
			itemDef.team = 0;
		}
		/**
		 * Start Hardcoding
		 */
		switch (id) {
		case 732:
			itemDef.stackable = false;
			break;
		case 9666:
		case 11814:
		case 11816:
		case 11818:
		case 11820:
		case 11822:
		case 11824:
		case 11826:
		case 11828:
		case 11830:
		case 11832:
		case 11834:
		case 11836:
		case 11838:
		case 11840:
		case 11842:
		case 11844:
		case 11846:
		case 11848:
		case 11850:
		case 11852:
		case 11854:
		case 11856:
		case 11858:
		case 11860:
		case 11862:
		case 11864:
		case 11866:
		case 11868:
		case 11870:
		case 11874:
		case 11876:
		case 11878:
		case 11882:
		case 11886:
		case 11890:
		case 11894:
		case 11898:
		case 11902:
		case 11904:
		case 11906:
		case 11926:
		case 11928:
		case 11930:
		case 11938:
		case 11942:
		case 11944:
		case 11946:
		case 14525:
		case 14527:
		case 14529:
		case 14531:
		case 19588:
		case 19592:
		case 19596:
		case 11908:
		case 11910:
		case 11912:
		case 11914:
		case 11916:
		case 11618:
		case 11920:
		case 11922:
		case 11924:
		case 11960:
		case 11962:
		case 11967:
		case 11982:
		case 19586:
		case 19584:
		case 19590:
		case 19594:
		case 19598:
			itemDef.actions = new String[5];
			itemDef.actions[0] = "Open";
		}
		if (i == 18347) {
			itemDef.name = "Gloves_of_Malice";
			itemDef.description = Stream
					.toBytes("These gloves give an extraordinary boost all around!");
		}
		if (i == 22157 || i == 22159 || i == 22161 || i == 22163 || i == 22165) {
			itemDef.name = "Restless Boots";
			itemDef.description = Stream
					.toBytes("These will provide you with twice as much run energy!");
			itemDef.actions[2] = "Change Color";
		}
		if (i == 20054) {
			itemDef.name = "XP Boost Ring";
			itemDef.description = Stream
					.toBytes("As you gain more referral points, the provided boost will increase!");
			itemDef.actions[2] = "Check Boost";
		}
		if (i == 1641) {
			itemDef.name = "HP Ring";
			itemDef.description = Stream
					.toBytes("This will heal me during combat!");
			itemDef.actions[1] = "Equip";
		}
		if (i == 18740) {
			itemDef.name = "KDR cape";
			itemDef.description = Stream
					.toBytes("A cape worn by the legends of BR Pking");
		}
		if (i == 19709 || i == 19710) {
			itemDef.name = "Pking cape";
			itemDef.description = Stream.toBytes("A cape worn by the veterans");
		}
		if (i == 14584) {
			itemDef.name = "Max Cash";
		}
		if (i == 20027) {
			itemDef.name = "Complex potion (4)";
		}
		if (i == 20028) {
			itemDef.name = "Complex potion (3)";
		}
		if (i == 20029) {
			itemDef.name = "Complex potion (2)";
		}
		if (i == 20030) {
			itemDef.name = "Complex potion (1)";
		}
		/*
		 * if (i == 13663) { itemDef.name = "Super Donator"; } if (i == 6199) {
		 * itemDef.name = "Extreme Donator"; } if (i == 3062) { itemDef.name =
		 * "Normal Donator"; } if (i == 6852) { itemDef.name =
		 * "1,000 Gear Tokens"; } if (i == 10025) { itemDef.name =
		 * "2,500 Gear Tokens"; } if (i == 15667) { itemDef.name =
		 * "5,000 Gear Tokens"; } if (i == 15668) { itemDef.name =
		 * "10,000 Gear Tokens"; } if (i == 15669) { itemDef.name =
		 * "15,000 Gear Tokens"; } if (i == 689) {
		 * 
		 * itemDef.modelID = 13436; itemDef.name = "Polypore Staff";
		 * itemDef.description = Stream.toBytes("It's a Polypore Staff.");
		 * itemDef.modelZoom = 3250; itemDef.modelRotation1 = 550;
		 * itemDef.modelRotation2 = 1530; itemDef.modelOffset1 = 0;
		 * itemDef.modelOffset2 = 0; itemDef.maleWearModel1 = 13416; if
		 * (forID(22494).name.toLowerCase().contains("polypore")) {
		 * itemDef.modelID = forID(22494).modelID; itemDef.maleWearModel1 =
		 * forID(22494).maleWearModel1; itemDef.modelRotation1 =
		 * forID(22494).modelRotation1; itemDef.modelRotation2 =
		 * forID(22494).modelRotation2; itemDef.modelZoom =
		 * forID(22494).modelZoom; itemDef.modelOffset1 =
		 * forID(22494).modelOffset1; itemDef.modelOffset2 =
		 * forID(22494).modelOffset2; } itemDef.groundActions = new String[5];
		 * itemDef.groundActions[2] = "Take"; itemDef.actions = new String[5];
		 * itemDef.actions[0] = null; itemDef.actions[1] = "Wield";
		 * itemDef.actions[2] = null; itemDef.actions[3] = null;
		 * itemDef.actions[4] = "Drop"; } if (i == 772) {
		 * 
		 * itemDef.modelID = 13426; itemDef.name = "Polypore Staff";
		 * itemDef.description = Stream.toBytes("It's a Polypore Staff.");
		 * itemDef.modelZoom = 3250; itemDef.modelRotation1 = 550;
		 * itemDef.modelRotation2 = 1530; itemDef.modelOffset1 = 0;
		 * itemDef.modelOffset2 = 0; itemDef.maleWearModel1 = 13417; if
		 * (forID(22494).name.toLowerCase().contains("polypore")) {
		 * itemDef.modelID = forID(22494).modelID; itemDef.maleWearModel1 =
		 * forID(22494).maleWearModel1; itemDef.modelRotation1 =
		 * forID(22494).modelRotation1; itemDef.modelRotation2 =
		 * forID(22494).modelRotation2; itemDef.modelZoom =
		 * forID(22494).modelZoom; itemDef.modelOffset1 =
		 * forID(22494).modelOffset1; itemDef.modelOffset2 =
		 * forID(22494).modelOffset2; } itemDef.groundActions = new String[5];
		 * itemDef.groundActions[2] = "Take"; itemDef.actions = new String[5];
		 * itemDef.actions[0] = null; itemDef.actions[1] = "Wield";
		 * itemDef.actions[2] = null; itemDef.actions[3] = null;
		 * itemDef.actions[4] = "Drop"; }
		 * 
		 * if (i == 919) { itemDef.femaleWearModel2 = 5409;
		 * itemDef.femaleWearModel1 = 5409; itemDef.modelID = 5412;
		 * itemDef.aByte154 = -5; itemDef.name = "Abyssal vine whip";
		 * itemDef.description = Stream
		 * .toBytes("An abyssal whip wrapped with a vine."); itemDef.modelZoom =
		 * 848; itemDef.modelRotation1 = 324; itemDef.modelRotation2 = 1808;
		 * itemDef.modelOffset1 = 0; itemDef.modelOffset2 = 9;
		 * itemDef.maleWearModel1 = 8725; itemDef.maleWearModel2 = 8725;
		 * itemDef.groundActions = new String[5]; itemDef.groundActions[0] =
		 * null; itemDef.groundActions[1] = null; itemDef.groundActions[2] =
		 * "Take"; itemDef.groundActions[3] = null; itemDef.groundActions[4] =
		 * null; itemDef.actions = new String[5]; itemDef.actions[0] = null;
		 * itemDef.actions[1] = "Wear"; itemDef.actions[2] = null;
		 * itemDef.actions[3] = "Dismantle"; itemDef.actions[4] = "Drop";
		 * itemDef.originalModelColors = new short[6];
		 * itemDef.modifiedModelColors = new short[6];
		 * itemDef.originalModelColors[0] = 6097; itemDef.originalModelColors[1]
		 * = 9158; itemDef.originalModelColors[2] = 9029;
		 * itemDef.originalModelColors[3] = 9215; itemDef.originalModelColors[4]
		 * = 9255; itemDef.originalModelColors[5] = 9221;
		 * itemDef.modifiedModelColors[0] = (short) 16745704;
		 * itemDef.modifiedModelColors[1] = (short) 31610065;
		 * itemDef.modifiedModelColors[2] = 16745;
		 * itemDef.modifiedModelColors[3] = (short) 34747;
		 * itemDef.modifiedModelColors[4] = (short) 34750;
		 * itemDef.modifiedModelColors[5] = (short) 57320; }
		 */
		switch (id) {
		case 8851:
			itemDef.name = "Gear token";
			break;
		case 11157:
			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			itemDef.name = "Ragefire boots";
			itemDef.modelID = 53897;
			itemDef.modelZoom = 900;
			itemDef.modelRotation1 = 165;
			itemDef.modelRotation2 = 99;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = -7;
			itemDef.maleWearModel1 = 53330;
			itemDef.maleWearModel2 = 53330;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.description = Stream.toBytes("Some Ragefire boots.");

			break;

		case 18786:
			itemDef.name = "Korasi's sword";
			itemDef.description = Stream.toBytes("It's an Korasi's sword");
			itemDef.actions = new String[] { null, "Wield", null, null, "Drop" };
			itemDef.groundActions = new String[] { null, null, "Take", null,
					null };
			itemDef.modelID = 60831;
			itemDef.maleWearModel1 = 57780;
			itemDef.femaleWearModel1 = 57780;
			itemDef.modelZoom = 1744;
			itemDef.modelRotation1 = 330;
			itemDef.modelRotation2 = 1505;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 0;
			itemDef.value = 245000;
			break;

		case 11158:

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			itemDef.name = "Steadfast Boots";
			itemDef.modelID = 53835;
			itemDef.modelZoom = 900;
			itemDef.modelRotation1 = 165;
			itemDef.modelRotation2 = 99;
			itemDef.modelOffset1 = 3;
			itemDef.modelOffset2 = -7;
			itemDef.maleWearModel1 = 53327;
			itemDef.maleWearModel2 = 53327;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.description = Stream.toBytes("Some Steadfast boots.");
			break;
		case 13362:
			itemDef.modelID = 62714;
			itemDef.name = "Torva full helm";
			itemDef.description = Stream.toBytes("Torva full helm.");
			itemDef.modelZoom = 672;
			itemDef.modelRotation1 = 85;
			itemDef.modelRotation2 = 1867;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = -3;
			itemDef.maleWearModel1 = 62738;
			itemDef.maleWearModel2 = 62754;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13360:
			itemDef.modelID = 62701;
			itemDef.name = "Torva platelegs";
			itemDef.description = Stream.toBytes("Torva platelegs.");
			itemDef.modelZoom = 1740;
			itemDef.modelRotation1 = 474;
			itemDef.modelRotation2 = 2045;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = -5;
			itemDef.maleWearModel1 = 62743;
			itemDef.maleWearModel2 = 62760;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13358:
			itemDef.modelID = 62699;
			itemDef.name = "Torva platebody";
			itemDef.description = Stream.toBytes("Torva Platebody.");
			itemDef.modelZoom = 1506;
			itemDef.modelRotation1 = 473;
			itemDef.modelRotation2 = 2042;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 0;
			itemDef.maleWearModel1 = 62746;
			itemDef.maleWearModel2 = 62762;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;
		case 13355:
			itemDef.modelID = 62693;
			itemDef.name = "Pernix cowl";
			itemDef.description = Stream.toBytes("Pernix cowl");
			itemDef.modelZoom = 800;
			itemDef.modelRotation1 = 532;
			itemDef.modelRotation2 = 14;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 1;
			itemDef.maleWearModel1 = 62739;
			itemDef.maleWearModel2 = 62756;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";
			itemDef.anInt175 = 62731;
			itemDef.anInt197 = 62727;

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13354:
			itemDef.modelID = 62709;
			itemDef.name = "Pernix body";
			itemDef.description = Stream.toBytes("Pernix body");
			itemDef.modelZoom = 1378;
			itemDef.modelRotation1 = 485;
			itemDef.modelRotation2 = 2042;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 7;
			itemDef.maleWearModel1 = 62744;
			itemDef.maleWearModel2 = 62765;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13352:
			itemDef.modelID = 62695;
			itemDef.name = "Pernix chaps";
			itemDef.description = Stream.toBytes("Pernix chaps");
			itemDef.modelZoom = 1740;
			itemDef.modelRotation1 = 504;
			itemDef.modelRotation2 = 0;
			itemDef.modelOffset1 = 4;
			itemDef.modelOffset2 = 3;
			itemDef.maleWearModel1 = 62741;
			itemDef.maleWearModel2 = 62757;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13350:
			itemDef.modelID = 62710;
			itemDef.name = "Virtus mask";
			itemDef.description = Stream.toBytes("Virtus mask");
			itemDef.modelZoom = 928;
			itemDef.modelRotation1 = 406;
			itemDef.modelRotation2 = 2041;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -5;
			itemDef.maleWearModel1 = 62736;
			itemDef.maleWearModel2 = 62755;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";
			itemDef.anInt175 = 62728;
			itemDef.anInt197 = 62728;

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		case 13348:
			itemDef.modelID = 62704;
			itemDef.name = "Virtus robe top";
			itemDef.description = Stream.toBytes("Virtus robe top");
			itemDef.modelZoom = 1122;
			itemDef.modelRotation1 = 488;
			itemDef.modelRotation2 = 3;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 0;
			itemDef.maleWearModel1 = 62748;
			itemDef.maleWearModel2 = 62764;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;
		case 13346:
			itemDef.modelID = 62700;
			itemDef.name = "Virtus robe legs";
			itemDef.description = Stream.toBytes("Virtus robe legs");
			itemDef.modelZoom = 1740;
			itemDef.modelRotation1 = 498;
			itemDef.modelRotation2 = 2045;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffset2 = 4;
			itemDef.maleWearModel1 = 62742;
			itemDef.maleWearModel2 = 62758;
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[2] = "Check-charges";
			itemDef.actions[4] = "Drop";

			itemDef.femaleWearModel2 = -1;
			itemDef.femaleWearModel1 = -1;
			break;

		/*case 20075:
			itemDef.modelID = 9001;
			itemDef.name = "Rainbow Party Hat";
			itemDef.modelZoom = 440;
			itemDef.modelRotation1 = 121;
			itemDef.modelRotation2 = 1845;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = 1;
			itemDef.maleWearModel1 = 9000;
			itemDef.maleWearModel2 = 9002;
			itemDef.actions[1] = "Wear";
			break;*/
			
		case 20075:
			itemDef.modelID = 33314;
			itemDef.name = "Top hat";
			itemDef.modelZoom = 659;
			itemDef.modelRotation1 = 80;
			itemDef.modelRotation2 = 1893;
			itemDef.modelOffset1 = -3;
			itemDef.modelOffset2 = -3;
			itemDef.maleWearModel1 = 33336;
			itemDef.maleWearModel2 = 33345;
			itemDef.actions[1] = "Wear";
		break;

		case 15121:
			itemDef.modelID = 65262;
			itemDef.name = "Completionist Cape";
			itemDef.modelZoom = 1385;
			itemDef.modelRotation1 = 279;
			itemDef.modelRotation2 = 948;
			itemDef.modelOffset1 = -5;
			itemDef.modelOffset2 = 24;
			itemDef.maleWearModel1 = 65300;
			itemDef.maleWearModel2 = 65322;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
			break;
			
		case 15150:
			itemDef.modelID = 59888;
			itemDef.name = "Agility Master Cape";
			itemDef.modelZoom = 2128;
			itemDef.modelRotation1 = 504;
			itemDef.modelRotation2 = 0;
			itemDef.modelOffset1 = 0;
			itemDef.modelOffset2 = 1;
			itemDef.maleWearModel1 = 59885;
			itemDef.maleWearModel2 = 59887;
			itemDef.femaleWearModel1 = -1;
			itemDef.femaleWearModel2 = -1;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
			itemDef.colorEquip1 = -1;
			itemDef.colorEquip2 = -1;
			itemDef.originalModelTextures = new short[1];
			itemDef.originalModelTextures[0] = 357;
			itemDef.modifiedModelTextures = new short[1];
			itemDef.modifiedModelTextures[0] = 254;
			break;

		case 15124:
			itemDef.modelID = 65268;
			itemDef.name = "Completionist Hood";
			itemDef.description = Stream.toBytes("It's a Completionist Hood.");
			itemDef.modelZoom = 760;
			itemDef.modelRotation1 = 11;
			itemDef.modelRotation2 = 81;
			itemDef.modelOffset1 = 1;
			itemDef.modelOffset2 = -3;
			itemDef.maleWearModel1 = 65291;
			itemDef.maleWearModel2 = 65313;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
			break;

		
		 case 19709: 
		 System.out.println("itemDef.modelID = "+itemDef.modelID+";");
		 System.out.println("itemDef.name = \""+itemDef.name+"\";");
		 System.out.println("itemDef.modelZoom = "+itemDef.modelZoom+";");
		 System.out.println("itemDef.modelRotation1 = "+itemDef.modelRotation1+";");
		 System.out.println("itemDef.modelRotation2 = "+itemDef.modelRotation2+";");
		 System.out.println("itemDef.modelOffset1 = "+itemDef.modelOffset1+";");
		 System.out.println("itemDef.modelOffset2 = "+itemDef.modelOffset2+";");
		 System.out.println("itemDef.maleWearModel1 = "+itemDef.maleWearModel1+";");
		 System.out.println("itemDef.maleWearModel2 = "+itemDef.maleWearModel2+";");
		 System.out.println("itemDef.femaleWearModel1 = "+itemDef.femaleWearModel1+";");
		 System.out.println("itemDef.femaleWearModel2 = "+itemDef.femaleWearModel2+";");
		 
		 if(itemDef.actions.length > 0)
			 System.out.println("itemDef.actions = new String[" + itemDef.actions.length +"];");
		 for(int z = 0; z < itemDef.actions.length; z++)
			 System.out.println("itemDef.actions["+(z+1)+"] = \""+itemDef.actions[z]+"\";"); 
		 
		 System.out.println("itemDef.colorEquip1 = "+itemDef.colorEquip1+";");
		 System.out.println("itemDef.colorEquip2 = "+itemDef.colorEquip2+";");
		 
		 if(itemDef.originalModelColors != null) {
			 if(itemDef.originalModelColors.length > 0)
				 System.out.println("itemDef.originalModelColors = new short[" + itemDef.originalModelColors.length +"];");
			 for(int z = 0; z < itemDef.originalModelColors.length; z++)
				 System.out.println("itemDef.originalModelColors::items"+z+"] = "+itemDef.originalModelColors[z]+";");
		 }
		 
		 if(itemDef.modifiedModelColors != null) {
			 if(itemDef.modifiedModelColors.length > 0)
				 System.out.println("itemDef.modifiedModelColors = new short[" + itemDef.modifiedModelColors.length +"];");
			 for(int z = 0; z < itemDef.modifiedModelColors.length; z++)
				 System.out.println("itemDef.modifiedModelColors["+z+"] = "+itemDef.modifiedModelColors[z]+";"); 
		 }
		 
		 if(itemDef.originalModelTextures != null) {
			 if(itemDef.originalModelTextures.length > 0)
				 System.out.println("itemDef.originalModelTextures = new short[" + itemDef.originalModelTextures.length +"];");
			 for(int z = 0; z < itemDef.originalModelTextures.length; z++)
				 System.out.println("itemDef.originalModelTextures["+z+"] = "+itemDef.originalModelTextures[z]+";"); 
		 }
		 
		 if(itemDef.modifiedModelTextures != null){
			 if(itemDef.modifiedModelTextures.length > 0)
				 System.out.println("itemDef.modifiedModelTextures = new short[" + itemDef.modifiedModelTextures.length +"];");
			 for(int z = 0; z < itemDef.modifiedModelTextures.length; z++)
				 System.out.println("itemDef.modifiedModelTextures["+z+"] = "+itemDef.modifiedModelTextures[z]+";"); 
		 }
		 break;
		 
		 
		}
		return itemDef;
	}

	private void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotation1 = itemDef.modelRotation1;
		modelRotation2 = itemDef.modelRotation2;
		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		originalModelColors = itemDef.originalModelColors;
		modifiedModelColors = itemDef.modifiedModelColors;
		originalModelTextures = itemDef.originalModelTextures;
		modifiedModelTextures = itemDef.modifiedModelTextures;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String article = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			article = "an";
		}
		description = Stream.toBytes("Swap this note at any bank for "
				+ article + " " + itemDef_1.name + ".");
		stackable = true;
	}

	private static Object clone(int[] object) {
		return object != null ? object.clone() : null;
	}

	private static Object clone(byte[] object) {
		return object != null ? object.clone() : null;
	}

	private static Object clone(short[] object) {
		return object != null ? object.clone() : null;
	}

	private static Object clone(String[] object) {
		return object != null ? object.clone() : null;
	}

	private void toLend() {
		ItemDef itemDef = forID(lendTemplateID);
		modelID = itemDef.modelID;
		modelRotation1 = itemDef.modelRotation1;
		modelRotation2 = itemDef.modelRotation2;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		modelZoom = itemDef.modelZoom;
		anInt204 = itemDef.anInt204;
		itemDef = forID(lendID);
		name = itemDef.name;
		membersObject = itemDef.membersObject;
		value = 0;
		maleWearModel1 = itemDef.maleWearModel1;
		maleWearModel2 = itemDef.maleWearModel2;
		femaleWearModel1 = itemDef.femaleWearModel1;
		femaleWearModel2 = itemDef.femaleWearModel2;
		colorEquip1 = itemDef.colorEquip1;
		colorEquip2 = itemDef.colorEquip2;
		team = itemDef.team;
		actions = (String[]) clone(itemDef.actions);
		groundActions = (String[]) clone(itemDef.groundActions);
		stackable = itemDef.stackable;
		stackAmounts = (int[]) clone(itemDef.stackAmounts);
		stackIDs = (int[]) clone(itemDef.stackIDs);
		originalModelColors = (short[]) clone(itemDef.originalModelColors);
		modifiedModelColors = (short[]) clone(itemDef.modifiedModelColors);
		originalModelTextures = (short[]) clone(itemDef.originalModelTextures);
		modifiedModelTextures = (short[]) clone(itemDef.modifiedModelTextures);
		description = (byte[]) clone(itemDef.description); // TODO: figure out
															// what the examine
															// for these are.
		if (actions == null)
			actions = new String[5];

		actions[4] = "Discard";
	}

	public static Sprite getSprite(int i, int j, int k) {
		ItemDef itemDef = forID(i);
		if (k > 0 && itemDef.certTemplateID != -1)
			k = 0;
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.maxHeight != j
					&& sprite.maxHeight != -1) {
				sprite.remove();
				sprite = null;
			}
			if (sprite != null)
				return sprite;
		}
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1]
						&& itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];

			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.getModelForAmount(j);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		if (itemDef.lendTemplateID != -1) {
			sprite = getSprite(itemDef.lendID, 50, 0);
			if (sprite == null)
				return null;
		}
		Sprite sprite2 = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.lineOffsets;
		int ai1[] = DrawingArea.pixels;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.notTextured = false;
		DrawingArea.initDrawingArea(32, 32, sprite2.myPixels);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.setDefaultBounds();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Rasterizer.SINE[itemDef.modelRotation1] * k3 >> 16;
		int i4 = Rasterizer.COSINE[itemDef.modelRotation1] * k3 >> 16;
		boolean empty = !model.method482(itemDef.modelRotation2,
				itemDef.anInt204, itemDef.modelRotation1, itemDef.modelOffset1,
				l3 + model.modelHeight / 2 + itemDef.modelOffset2, i4
						+ itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (sprite2.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0 && sprite2.myPixels[(i5 - 1) + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0 && sprite2.myPixels[i5 + (j4 - 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31 && sprite2.myPixels[i5 + 1 + j4 * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31
							&& sprite2.myPixels[i5 + (j4 + 1) * 32] > 1)
						sprite2.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (sprite2.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0 && sprite2.myPixels[(j5 - 1) + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0
								&& sprite2.myPixels[j5 + (k4 - 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31
								&& sprite2.myPixels[j5 + 1 + k4 * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31
								&& sprite2.myPixels[j5 + (k4 + 1) * 32] == 1)
							sprite2.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (sprite2.myPixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0
							&& sprite2.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						sprite2.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.maxWidth;
			int j6 = sprite.maxHeight;
			sprite.maxWidth = 32;
			sprite.maxHeight = 32;
			sprite.drawSprite(0, 0);
			sprite.maxWidth = l5;
			sprite.maxHeight = j6;
		}
		if (itemDef.lendTemplateID != -1) {
			int l5 = sprite.maxWidth;
			int j6 = sprite.maxHeight;
			sprite.maxWidth = 32;
			sprite.maxHeight = 32;
			sprite.drawSprite(0, 0);
			sprite.maxWidth = l5;
			sprite.maxHeight = j6;
		}
		if (k == 0 && !empty)
			mruNodes1.removeFromCache(sprite2, i);
		DrawingArea.initDrawingArea(j2, i2, ai1);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.lineOffsets = ai;
		Rasterizer.notTextured = true;
		if (itemDef.stackable)
			sprite2.maxWidth = 33;
		else
			sprite2.maxWidth = 32;
		sprite2.maxHeight = j;
		return sprite2;
	}

	public Model getModelForAmount(int amount) {
		if (stackIDs != null && amount > 1) {
			int stackId = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= stackAmounts[index] && stackAmounts[index] != 0) {
					stackId = stackIDs[index];
				}
			}
			if (stackId != -1) {
				return forID(stackId).getModelForAmount(1);
			}
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if (model != null) {
			return model;
		}
		model = Model.method462(modelID);
		if (model == null)
			return null;
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (modifiedModelColors != null) {
			for (int l = 0; l < originalModelColors.length; l++) {
				model.setColor(originalModelColors[l], modifiedModelColors[l]);
			}
		}
		if (originalModelTextures != null) {
			for (int i1 = 0; i1 < originalModelTextures.length; i1++) {
				model.setTexture(originalModelTextures[i1],
						modifiedModelTextures[i1]);
			}
		}
		model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true,
				true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public Model method202(int amount) {
		if (stackIDs != null && amount > 1) {
			int stackId = -1;
			for (int index = 0; index < 10; index++) {
				if (amount >= stackAmounts[index] && stackAmounts[index] != 0) {
					stackId = stackIDs[index];
				}
			}
			if (stackId != -1) {
				return forID(stackId).method202(1);
			}
		}
		Model model = Model.method462(modelID);
		if (model == null) {
			return null;
		}
		if (modifiedModelColors != null) {
			for (int color = 0; color < originalModelColors.length; color++) {
				model.setColor(originalModelColors[color],
						modifiedModelColors[color]);
			}
		}
		if (originalModelTextures != null) {
			for (int texture = 0; texture < originalModelTextures.length; texture++) {
				model.setTexture(originalModelTextures[texture],
						modifiedModelTextures[texture]);
			}
		}
		return model;
	}

	public int anInt1849;
	public int anInt1851;
	public int lendTemplateID;
	public int maleWearModel1;
	public int certTemplateID;
	public int anInt1859;
	public int anInt1862;
	public int anInt197;
	public int anInt1864;
	public int anInt204;
	public int colorEquip1;
	public int modelRotation2;
	public int modelZoom;
	public int modelOffset2;
	public int anInt196;
	public int anInt1877;
	public int femaleWearModel1;
	public int anInt1879;
	public int maleWearModel2;
	public int femaleWearModel2;
	public int modelRotation1;
	public int anInt184;
	public int certID;
	public int anInt166;
	public int anInt1819;
	public int anInt1890;
	public int anInt1891;
	public boolean stackable;
	public int anInt1893;
	public int anInt1895;
	public int anInt191;
	public int anInt173;
	public int modelID;
	public int team;
	public int anInt1900;
	public int anInt167;
	public int modelOffset1;
	public int anInt1908;
	public int anInt192;
	public int anInt175;
	public int id;
	public int colorEquip2;
	public int anInt1916;
	public int anInt1919;
	public int value;
	public int lendID;
	public int anInt1928;
	public int anInt1930;
	public int anInt1931;
	public String name;
	public boolean membersObject;
	public boolean aBoolean1933;
	public byte[] aByteArray1882;
	public short[] modifiedModelTextures;
	public short[] modifiedModelColors;
	public short[] originalModelColors;
	public short[] originalModelTextures;
	public int[] stackAmounts;
	public int[] stackIDs;
	public int[] anIntArray1926;
	public String[] actions;
	public String[] groundActions;
	public Hashtable<Integer, Object> aHashTable1873;

	public void setDefaults() {
		aByte205 = 0;
		aByte154 = 0;
		description = null;
		aByteArray1882 = null;
		modifiedModelTextures = null;
		modifiedModelColors = null;
		originalModelColors = null;
		originalModelTextures = null;
		stackAmounts = null;
		stackIDs = null;
		anIntArray1926 = null;
		actions = null;
		groundActions = null;
		aHashTable1873 = null;
		modelID = 0;
		anInt1851 = -1;
		anInt1849 = -1;
		maleWearModel1 = -1;
		anInt1864 = -1;
		femaleWearModel1 = -1;
		anInt204 = 0;
		lendTemplateID = -1;
		anInt1862 = -1;
		anInt1891 = -1;
		colorEquip1 = -1;
		anInt196 = 0;
		anInt184 = 0;
		anInt197 = -1;
		modelZoom = 2000;
		anInt1879 = -1;
		team = 0;
		membersObject = false;
		anInt192 = 128;
		modelOffset1 = 0;
		name = "null";
		anInt1859 = -1;
		anInt167 = 128;
		anInt166 = -1;
		anInt173 = -1;
		anInt1908 = -1;
		modelRotation2 = 0;
		anInt1895 = 0;
		anInt1819 = -1;
		anInt1900 = -1;
		anInt1893 = 0;
		femaleWearModel2 = -1;
		modelOffset2 = 0;
		anInt1890 = 0;
		anInt175 = -1;
		anInt1919 = 0;
		stackable = false;
		anInt191 = 128;
		colorEquip2 = -1;
		certTemplateID = -1;
		certID = -1;
		value = 1;
		anInt1877 = 0;
		anInt1928 = -1;
		modelRotation1 = 0;
		lendID = -1;
		maleWearModel2 = -1;
		anInt1930 = 0;
		anInt1916 = 0;
		anInt1931 = 0;
		aBoolean1933 = false;
	}
	
	private void readValuesOS(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1)
				modelID = stream.readUnsignedWord();
			else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 4)
				modelZoom = stream.readUnsignedWord();
			else if (i == 5)
				modelRotation1 = stream.readUnsignedWord();
			else if (i == 6)
				modelRotation2 = stream.readUnsignedWord();
			else if (i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if (modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if (i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if (modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if (i == 10)
				stream.readUnsignedWord();
			else if (i == 11)
				stackable = true;
			else if (i == 12)
				value = stream.readDWord();
			else if (i == 16)
				membersObject = true;
			else if (i == 23) {
				maleWearModel1 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if (i == 24)
				femaleWearModel1 = stream.readUnsignedWord();
			else if (i == 25) {
				maleWearModel2 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if (i == 26)
				femaleWearModel2 = stream.readUnsignedWord();
			else if (i >= 30 && i < 35) {
				if (groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
				if (groundActions[i - 30].equalsIgnoreCase("hidden"))
					groundActions[i - 30] = null;
			} else if (i >= 35 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 35] = stream.readString();
			} else if (i == 40) {
				int j = stream.readUnsignedByte();
				modifiedModelColors = new short[j];
				originalModelColors = new short[j];
				for (int k = 0; k < j; k++) {
					modifiedModelColors[k] = (short) stream.readUnsignedWord();
					originalModelColors[k] = (short) stream.readUnsignedWord();
				}

			} else if (i == 78)
				colorEquip1 = stream.readUnsignedWord();
			else if (i == 79)
				colorEquip2 = stream.readUnsignedWord();
			else if (i == 90)
				anInt175 = stream.readUnsignedWord();
			else if (i == 91)
				anInt197 = stream.readUnsignedWord();
			else if (i == 92)
				anInt166 = stream.readUnsignedWord();
			else if (i == 93)
				anInt173 = stream.readUnsignedWord();
			else if (i == 95)
				anInt204 = stream.readUnsignedWord();
			else if (i == 97)
				certID = stream.readUnsignedWord();
			else if (i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if (i == 100) {
				int length = stream.readUnsignedByte();
				stackIDs = new int [length];
				stackAmounts = new int[length];
				for (int i2 = 0; i2< length; i2++) {
					stackIDs[i2] = stream.readUnsignedWord();
					stackAmounts[i2] = stream.readUnsignedWord();
				}
			} else if (i == 110)
				anInt167 = stream.readUnsignedWord();
			else if (i == 111)
				anInt192 = stream.readUnsignedWord();
			else if (i == 112)
				anInt191 = stream.readUnsignedWord();
			else if (i == 113)
				anInt196 = stream.readSignedByte();
			else if (i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if (i == 115)
				team = stream.readUnsignedByte();
		} while (true);
	}


	public void readValues(Stream buffer) {
		while (true) {
			int opcode = buffer.getUnsigned();
			if (opcode == 0)
				break;

			if (opcode == 1)
				modelID = buffer.getUnsignedShort();
			else if (opcode == 2)
				name = buffer.getString();
			else if (opcode == 3)
				description = buffer.readBytes();
			else if (opcode == 4)
				modelZoom = buffer.getUnsignedShort();
			else if (opcode == 5)
				modelRotation1 = buffer.getUnsignedShort();
			else if (opcode == 6)
				modelRotation2 = buffer.getUnsignedShort();
			else if (opcode == 7)
				modelOffset1 = buffer.getSignedShort();
			else if (opcode == 8)
				modelOffset2 = buffer.getSignedShort();
			else if (opcode == 11)
				stackable = true;
			else if (opcode == 12)
				value = buffer.getInt();
			else if (opcode == 16)
				membersObject = true;
			else if (opcode == 18)
				anInt1879 = buffer.getUnsignedShort();
			else if (opcode == 23)
				maleWearModel1 = buffer.getUnsignedShort();
			else if (opcode == 24)
				femaleWearModel1 = buffer.getUnsignedShort();
			else if (opcode == 25)
				maleWearModel2 = buffer.getUnsignedShort();
			else if (opcode == 26)
				femaleWearModel2 = buffer.getUnsignedShort();

			else if (opcode >= 30 && opcode < 35) {
				if (groundActions == null)
					groundActions = new String[5];

				groundActions[opcode - 30] = buffer.getString();
			} else if (opcode >= 35 && opcode < 40) {
				if (actions == null)
					actions = new String[5];

				actions[opcode - 35] = buffer.getString();
			} else if (opcode == 40) {
				int count = buffer.getUnsigned();
				originalModelColors = new short[count];
				modifiedModelColors = new short[count];
				for (int i = 0; i != count; ++i) {
					originalModelColors[i] = (short) buffer.getUnsignedShort();
					modifiedModelColors[i] = (short) buffer.getUnsignedShort();
				}
			} else if (opcode == 41) {
				int count = buffer.getUnsigned();
				originalModelTextures = new short[count];
				modifiedModelTextures = new short[count];
				for (int i = 0; i != count; ++i) {
					originalModelTextures[i] = (short) buffer
							.getUnsignedShort();
					modifiedModelTextures[i] = (short) buffer
							.getUnsignedShort();
				}

			} else if (opcode == 42) {
				int count = buffer.getUnsigned();
				aByteArray1882 = new byte[count];
				for (int i = 0; i != count; ++i)
					aByteArray1882[i] = buffer.get();

			} else if (opcode == 65)
				aBoolean1933 = true;
			else if (opcode == 78)
				colorEquip1 = buffer.getUnsignedShort();
			else if (opcode == 79)
				colorEquip2 = buffer.getUnsignedShort();
			else if (opcode == 90)
				anInt175 = buffer.getUnsignedShort();
			else if (opcode == 91)
				anInt197 = buffer.getUnsignedShort();
			else if (opcode == 92)
				anInt166 = buffer.getUnsignedShort();
			else if (opcode == 93)
				anInt173 = buffer.getUnsignedShort();
			else if (opcode == 95)
				anInt204 = buffer.getUnsignedShort();
			else if (opcode == 96)
				anInt1877 = buffer.getUnsigned();
			else if (opcode == 97)
				certID = buffer.getUnsignedShort();
			else if (opcode == 98)
				certTemplateID = buffer.getUnsignedShort();

			else if (opcode >= 100 && opcode < 110) {
				if (stackIDs == null) {
					stackIDs = new int[10];
					stackAmounts = new int[10];
				}
				stackIDs[opcode - 100] = buffer.getUnsignedShort();
				stackAmounts[opcode - 100] = buffer.getUnsignedShort();
			} else if (opcode == 110)
				anInt167 = buffer.getUnsignedShort();
			else if (opcode == 111)
				anInt192 = buffer.getUnsignedShort();
			else if (opcode == 112)
				anInt191 = buffer.getUnsignedShort();
			else if (opcode == 113)
				anInt196 = buffer.get();
			else if (opcode == 114)
				anInt184 = buffer.get() * 5;
			else if (opcode == 115)
				team = buffer.getUnsigned();
			else if (opcode == 121)
				lendID = buffer.getUnsignedShort();
			else if (opcode == 122)
				lendTemplateID = buffer.getUnsignedShort();

			else if (opcode == 125) {
				anInt1931 = buffer.get();
				anInt1930 = buffer.get();
				anInt1895 = buffer.get();
			} else if (opcode == 126) {
				anInt1890 = buffer.get();
				anInt1893 = buffer.get();
				anInt1916 = buffer.get();
			} else if (opcode == 127) {
				anInt1908 = buffer.getUnsigned();
				anInt1819 = buffer.getUnsignedShort();
			} else if (opcode == 128) {
				anInt1849 = buffer.getUnsigned();
				anInt1851 = buffer.getUnsignedShort();
			} else if (opcode == 129) {
				anInt1900 = buffer.getUnsigned();
				anInt1859 = buffer.getUnsignedShort();
			} else if (opcode == 130) {
				anInt1864 = buffer.getUnsigned();
				anInt1862 = buffer.getUnsignedShort();
			} else if (opcode == 132) {
				int count = buffer.getUnsigned();
				anIntArray1926 = new int[count];
				for (int i = 0; i != count; ++i)
					anIntArray1926[i] = buffer.getUnsignedShort();

			} else if (opcode == 134)
				anInt1919 = buffer.getUnsigned();
			else if (opcode == 139)
				anInt1891 = buffer.getUnsignedShort();
			else if (opcode == 140)
				anInt1928 = buffer.getUnsignedShort();

			else if (opcode == 249) {
				int count = buffer.getUnsigned();
				if (aHashTable1873 == null)
					aHashTable1873 = new Hashtable<Integer, Object>();

				for (int i = 0; i != count; ++i) {
					boolean string = buffer.getUnsigned() == 1;
					int key = buffer.getMedium();
					Object value = string ? buffer.getString() : Integer
							.valueOf(buffer.getInt());
					aHashTable1873.put(Integer.valueOf(key), value);
				}

			} else {
				System.out.println("[ItemDef] Unknown opcode: " + opcode);
				break;
			}
		}
	}

	private byte aByte154;
	static Cache mruNodes1 = new Cache(100);
	public static Cache mruNodes2 = new Cache(50);
	private static ItemDef[] cache;
	public byte description[];
	private static int cacheIndex;
	public static boolean isMembers = true;
	private static Stream itembuffer;
	private static Stream itembufferOS;
	private static int[] streamIndices;
	private static int[] streamIndicesOS;
	public static int totalItems;
	public static int totalItemsOS;
	private byte aByte205;
}