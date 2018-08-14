import java.net.URL;

public final class RSInterface {
	public int transAmount;
	public String popupString;
	public String hoverText;
	public static StreamLoader aClass44;
	public boolean drawsTransparent;
	public Sprite disabledSprite;
	public int anInt208;
	public Sprite sprites[];
	public static RSInterface interfaceCache[];
	public int requiredValues[];
	public int contentType;
	public int spritesX[];

	public int anInt216;
	public int atActionType;
	public String spellName;
	public int anInt219;
	public int width;
	public String tooltip;
	public String selectedActionName;
	public boolean centerText;
	public int scrollPosition;
	public String actions[];
	public boolean hasExamine = true;
	public int valueIndexArray[][];
	public boolean filled;
	public String aString228;
	public int mOverInterToTrigger;
	public int invSpritePadX;
	public int textColor;
	public int anInt233;
	public int mediaID;
	public boolean dragDeletes;
	public int parentID;
	public int spellUsableOn;
	private static Cache aMRUNodes_238;
	public int anInt239;
	public Sprite savedSprite[] = new Sprite[10];
	public int children[];
	public int childX[];
	public boolean usableItemInterface;
	public TextDrawingArea textDrawingAreas;
	public int invSpritePadY;
	public int valueCompareType[];
	public int anInt246;
	public int spritesY[];
	public String message;
	public boolean isInventoryInterface;
	public int id;
	public int invStackSizes[];
	public int inv[];
	public byte opacity;
	private int anInt255;
	private int anInt256;
	public int anInt257;
	public int anInt258;
	public boolean aBoolean259;
	public Sprite enabledSprite;
	public int scrollMax;
	public int type;
	public int anInt263;
	private static final Cache aMRUNodes_264 = new Cache(30);
	public int anInt265;
	public boolean isMouseoverTriggered;
	public int height;
	public boolean textShadow;
	public int modelZoom;
	public int modelRotation1;
	public int modelRotation2;
	public int childY[];

	public static void setBoundry(int frame, int ID, int X, int Y,
			RSInterface RSInterface) {
		RSInterface.children[frame] = ID;
		RSInterface.childX[frame] = X;
		RSInterface.childY[frame] = Y;
	}

	public static void addPrayerWithTooltip(int i, int configId,
			int configFrame, int requiredValues, int prayerSpriteID, int Hover,
			String tooltip) {
		RSInterface Interface = addTabInterface(i);
		Interface.id = i;
		Interface.parentID = 5608;
		Interface.type = 5;
		Interface.atActionType = 4;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.mOverInterToTrigger = Hover;
		Interface.disabledSprite = imageLoader(0,
				"Interfaces/PrayerTab/PRAYERGLOW");
		Interface.enabledSprite = imageLoader(1,
				"Interfaces/PrayerTab/PRAYERGLOW");
		Interface.width = 34;
		Interface.height = 34;
		Interface.valueCompareType = new int[1];
		Interface.requiredValues = new int[1];
		Interface.valueCompareType[0] = 1;
		Interface.requiredValues[0] = configId;
		Interface.valueIndexArray = new int[1][3];
		Interface.valueIndexArray[0][0] = 5;
		Interface.valueIndexArray[0][1] = configFrame;
		Interface.valueIndexArray[0][2] = 0;
		Interface.tooltip = tooltip;
		Interface = addTabInterface(i + 1);
		Interface.id = i + 1;
		Interface.parentID = 5608;
		Interface.type = 5;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.disabledSprite = imageLoader(prayerSpriteID,
				"Interfaces/PrayerTab/PRAYERON");
		Interface.enabledSprite = imageLoader(prayerSpriteID,
				"Interfaces/PrayerTab/PRAYEROFF");
		Interface.width = 34;
		Interface.height = 34;
		Interface.valueCompareType = new int[1];
		Interface.requiredValues = new int[1];
		Interface.valueCompareType[0] = 2;
		Interface.requiredValues[0] = requiredValues + 1;
		Interface.valueIndexArray = new int[1][3];
		Interface.valueIndexArray[0][0] = 2;
		Interface.valueIndexArray[0][1] = 5;
		Interface.valueIndexArray[0][2] = 0;
	}

	public static void prayerMenu(TextDrawingArea[] TDA) {
		RSInterface prayerMenu = addInterface(5608);
		int index = 0;
		int prayIndex = 0;
		int firstRowXPos = 10;
		int firstRowYPos = 50;
		int secondRowXPos = 10;
		int secondRowYPos = 86;
		int thirdRowXPos = 10;
		int thirdRowYPos = 122;
		int fourthRowXPos = 10;
		int fourthRowYPos = 159;
		int fifthRowXPos = 10;
		int fifthRowYPos = 86;
		int sixthRowXPos = 1;
		int sixthRowYPos = 52;
		addText(687, "", 0xff981f, false, true, -1, TDA, 1);
		addSprite(25105, 0, "Interfaces/PrayerTab/PRAYERICON");
		addPrayerWithTooltip(25000, 0, 83, 0, prayIndex, 25052,
				"Activate @lre@Thick Skin");
		prayIndex++;
		addPrayerWithTooltip(25002, 0, 84, 3, prayIndex, 25054,
				"Activate @lre@Burst of Strength");
		prayIndex++;
		addPrayerWithTooltip(25004, 0, 85, 6, prayIndex, 25056,
				"Activate @lre@Clarity of Thought");
		prayIndex++;
		addPrayerWithTooltip(25006, 0, 101, 7, prayIndex, 25058,
				"Activate @lre@Sharp Eye");
		prayIndex++;
		addPrayerWithTooltip(25008, 0, 102, 8, prayIndex, 25060,
				"Activate @lre@Mystic Will");
		prayIndex++;
		addPrayerWithTooltip(25010, 0, 86, 9, prayIndex, 25062,
				"Activate @lre@Rock Skin");
		prayIndex++;
		addPrayerWithTooltip(25012, 0, 87, 12, prayIndex, 25064,
				"Activate @lre@Superhuman Strength");
		prayIndex++;
		addPrayerWithTooltip(25014, 0, 88, 15, prayIndex, 25066,
				"Activate @lre@Improved Reflexes");
		prayIndex++;
		addPrayerWithTooltip(25016, 0, 89, 18, prayIndex, 25068,
				"Activate @lre@Rapid Restore");
		prayIndex++;
		addPrayerWithTooltip(25018, 0, 90, 21, prayIndex, 25070,
				"Activate @lre@Rapid Heal");
		prayIndex++;
		addPrayerWithTooltip(25020, 0, 91, 24, prayIndex, 25072,
				"Activate @lre@Protect Item");
		prayIndex++;
		addPrayerWithTooltip(25022, 0, 103, 25, prayIndex, 25074,
				"Activate @lre@Hawk Eye");
		prayIndex++;
		addPrayerWithTooltip(25024, 0, 104, 26, prayIndex, 25076,
				"Activate @lre@Mystic Lore");
		prayIndex++;
		addPrayerWithTooltip(25026, 0, 92, 27, prayIndex, 25078,
				"Activate @lre@Steel Skin");
		prayIndex++;
		addPrayerWithTooltip(25028, 0, 93, 30, prayIndex, 25080,
				"Activate @lre@Ultimate Strength");
		prayIndex++;
		addPrayerWithTooltip(25030, 0, 94, 33, prayIndex, 25082,
				"Activate @lre@Incredible Reflexes");
		prayIndex++;
		addPrayerWithTooltip(25032, 0, 95, 36, prayIndex, 25084,
				"Activate @lre@Protect from Magic");
		prayIndex++;
		addPrayerWithTooltip(25034, 0, 96, 39, prayIndex, 25086,
				"Activate @lre@Protect from Missles");
		prayIndex++;
		addPrayerWithTooltip(25036, 0, 97, 42, prayIndex, 25088,
				"Activate @lre@Protect from Melee");
		prayIndex++;
		addPrayerWithTooltip(25038, 0, 105, 43, prayIndex, 25090,
				"Activate @lre@Eagle Eye");
		prayIndex++;
		addPrayerWithTooltip(25040, 0, 106, 44, prayIndex, 25092,
				"Activate @lre@Mystic Might");
		prayIndex++;
		addPrayerWithTooltip(25042, 0, 98, 45, prayIndex, 25094,
				"Activate @lre@Retribution");
		prayIndex++;
		addPrayerWithTooltip(25044, 0, 99, 48, prayIndex, 25096,
				"Activate @lre@Redemption");
		prayIndex++;
		addPrayerWithTooltip(25046, 0, 100, 51, prayIndex, 25098,
				"Activate @lre@Smite");
		prayIndex++;
		addPrayerWithTooltip(25048, 0, 107, 59, prayIndex, 25100,
				"Activate @lre@Chivalry");
		prayIndex++;
		addPrayerWithTooltip(25050, 0, 108, 69, prayIndex, 25102,
				"Activate @lre@Piety");
		prayIndex++;
		addTooltip(25052, "Level 01\nThick Skin\nIncreases your Defence by 5%");
		addTooltip(25054,
				"Level 04\nBurst of Strength\nIncreases your Strength by 5%");
		addTooltip(25056,
				"Level 07\nClarity of Thought\nIncreases your Attack by 5%");
		addTooltip(25058, "Level 08\nSharp Eye\nIncreases your Ranged by 5%");
		addTooltip(25060, "Level 09\nMystic Will\nIncreases your Magic by 5%");
		addTooltip(25062, "Level 10\nRock Skin\nIncreases your Defence by 10%");
		addTooltip(25064,
				"Level 13\nSuperhuman Strength\nIncreases your Strength by 10%");
		addTooltip(25066,
				"Level 16\nImproved Reflexes\nIncreases your Attack by 10%");
		addTooltip(
				25068,
				"Level 19\nRapid Restore\n2x restore rate for all stats\nexcept Hitpoints, Summoning\nand Prayer");
		addTooltip(25070,
				"Level 22\nRapid Heal\n2x restore rate for the\nHitpoints stat");
		addTooltip(25072,
				"Level 25\nProtect Item\nKeep 1 extra item if you die");
		addTooltip(25074, "Level 26\nHawk Eye\nIncreases your Ranged by 10%");
		addTooltip(25076, "Level 27\nMystic Lore\nIncreases your Magic by 10%");
		addTooltip(25078, "Level 28\nSteel Skin\nIncreases your Defence by 15%");
		addTooltip(25080,
				"Level 31\nUltimate Strength\nIncreases your Strength by 15%");
		addTooltip(25082,
				"Level 34\nIncredible Reflexes\nIncreases your Attack by 15%");
		addTooltip(25084,
				"Level 37\nProtect from Magic\nProtection from magical attacks");
		addTooltip(25086,
				"Level 40\nProtect from Missles\nProtection from ranged attacks");
		addTooltip(25088,
				"Level 43\nProtect from Melee\nProtection from melee attacks");
		addTooltip(25090, "Level 44\nEagle Eye\nIncreases your Ranged by 15%");
		addTooltip(25092, "Level 45\nMystic Might\nIncreases your Magic by 15%");
		addTooltip(25094,
				"Level 46\nRetribution\nInflicts damage to nearby\ntargets if you die");
		addTooltip(25096,
				"Level 49\nRedemption\nHeals you when damaged\nand Hitpoints falls\nbelow 10%");
		addTooltip(25098,
				"Level 52\nSmite\n1/4 of damage dealt is\nalso removed from\nopponent's Prayer");
		addTooltip(
				25100,
				"Level 60\nChivalry\nIncreases your Defence by 20%,\nStrength by 18%, and Attack by\n15%");
		addTooltip(
				25102,
				"Level 70\nPiety\nIncreases your Defence by 25%,\nStrength by 23%, and Attack by\n20%");
		setChildren(80, prayerMenu);
		setBounds(687, 85, 241, index, prayerMenu);
		index++;
		setBounds(25105, 65, 241, index, prayerMenu);
		index++;
		setBounds(25000, 2, 5, index, prayerMenu);
		index++;
		setBounds(25001, 5, 8, index, prayerMenu);
		index++;
		setBounds(25002, 40, 5, index, prayerMenu);
		index++;
		setBounds(25003, 44, 8, index, prayerMenu);
		index++;
		setBounds(25004, 76, 5, index, prayerMenu);
		index++;
		setBounds(25005, 79, 11, index, prayerMenu);
		index++;
		setBounds(25006, 113, 5, index, prayerMenu);
		index++;
		setBounds(25007, 116, 10, index, prayerMenu);
		index++;
		setBounds(25008, 150, 5, index, prayerMenu);
		index++;
		setBounds(25009, 153, 9, index, prayerMenu);
		index++;
		setBounds(25010, 2, 45, index, prayerMenu);
		index++;
		setBounds(25011, 5, 48, index, prayerMenu);
		index++;
		setBounds(25012, 39, 45, index, prayerMenu);
		index++;
		setBounds(25013, 44, 47, index, prayerMenu);
		index++;
		setBounds(25014, 76, 45, index, prayerMenu);
		index++;
		setBounds(25015, 79, 49, index, prayerMenu);
		index++;
		setBounds(25016, 113, 45, index, prayerMenu);
		index++;
		setBounds(25017, 116, 50, index, prayerMenu);
		index++;
		setBounds(25018, 151, 45, index, prayerMenu);
		index++;
		setBounds(25019, 154, 50, index, prayerMenu);
		index++;
		setBounds(25020, 2, 82, index, prayerMenu);
		index++;
		setBounds(25021, 4, 84, index, prayerMenu);
		index++;
		setBounds(25022, 40, 82, index, prayerMenu);
		index++;
		setBounds(25023, 44, 87, index, prayerMenu);
		index++;
		setBounds(25024, 77, 82, index, prayerMenu);
		index++;
		setBounds(25025, 81, 85, index, prayerMenu);
		index++;
		setBounds(25026, 114, 83, index, prayerMenu);
		index++;
		setBounds(25027, 117, 85, index, prayerMenu);
		index++;
		setBounds(25028, 153, 83, index, prayerMenu);
		index++;
		setBounds(25029, 156, 87, index, prayerMenu);
		index++;
		setBounds(25030, 2, 120, index, prayerMenu);
		index++;
		setBounds(25031, 5, 125, index, prayerMenu);
		index++;
		setBounds(25032, 40, 120, index, prayerMenu);
		index++;
		setBounds(25033, 43, 124, index, prayerMenu);
		index++;
		setBounds(25034, 78, 120, index, prayerMenu);
		index++;
		setBounds(25035, 83, 124, index, prayerMenu);
		index++;
		setBounds(25036, 114, 120, index, prayerMenu);
		index++;
		setBounds(25037, 115, 121, index, prayerMenu);
		index++;
		setBounds(25038, 151, 120, index, prayerMenu);
		index++;
		setBounds(25039, 154, 124, index, prayerMenu);
		index++;
		setBounds(25040, 2, 158, index, prayerMenu);
		index++;
		setBounds(25041, 5, 160, index, prayerMenu);
		index++;
		setBounds(25042, 39, 158, index, prayerMenu);
		index++;
		setBounds(25043, 41, 158, index, prayerMenu);
		index++;
		setBounds(25044, 76, 158, index, prayerMenu);
		index++;
		setBounds(25045, 79, 163, index, prayerMenu);
		index++;
		setBounds(25046, 114, 158, index, prayerMenu);
		index++;
		setBounds(25047, 116, 158, index, prayerMenu);
		index++;
		setBounds(25048, 153, 158, index, prayerMenu);
		index++;
		setBounds(25049, 161, 160, index, prayerMenu);
		index++;
		setBounds(25050, 2, 196, index, prayerMenu);
		index++;
		setBounds(25051, 4, 207, index, prayerMenu);
		index++;
		// Tooltips
		/* Row one *//**
		 * Thick Skin, Burst of Strength, Clarity of Thought, Sharp
		 * eye, Mystic Will
		 */
		setBoundry(index, 25052, firstRowXPos - 2, firstRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25054, firstRowXPos - 5, firstRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25056, firstRowXPos, firstRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25058, firstRowXPos, firstRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25060, firstRowXPos, firstRowYPos, prayerMenu);
		index++;
		/* Row two *//**
		 * Rock Skin, Superhuman Strength, Improved Reflexes, Rapid
		 * Restore, Rapid Heal
		 */
		setBoundry(index, 25062, secondRowXPos - 9, secondRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25064, secondRowXPos - 11, secondRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25066, secondRowXPos, secondRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25068, secondRowXPos, secondRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25070, secondRowXPos + 25, secondRowYPos, prayerMenu);
		index++;
		/* Row three *//**
		 * Protect Item, Hawk Eye, Mystic Lore, Steel Skin,
		 * Ultimate Strength
		 */
		setBoundry(index, 25072, thirdRowXPos, thirdRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25074, thirdRowXPos - 2, thirdRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25076, thirdRowXPos, thirdRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25078, thirdRowXPos - 7, thirdRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25080, thirdRowXPos - 10, thirdRowYPos, prayerMenu);
		index++;
		/* Row four *//**
		 * Incredible Reflexes, Protect from Magic, Protect from
		 * Missles, Protect from Melee, Eagle Eye
		 */
		setBoundry(index, 25082, fourthRowXPos, fourthRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25084, fourthRowXPos - 8, fourthRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25086, fourthRowXPos - 7, fourthRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25088, fourthRowXPos - 2, fourthRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25090, fourthRowXPos - 2, fourthRowYPos, prayerMenu);
		index++;
		/* Row five *//** Mystic Might, Redemption, Retribution, Smite, Chivalry */
		setBoundry(index, 25092, fifthRowXPos, fifthRowYPos, prayerMenu);
		index++;
		setBoundry(index, 25094, fifthRowXPos, fifthRowYPos - 20, prayerMenu);
		index++;
		setBoundry(index, 25096, fifthRowXPos, fifthRowYPos - 25, prayerMenu);
		index++;
		setBoundry(index, 25098, fifthRowXPos + 15, fifthRowYPos - 25,
				prayerMenu);
		index++;
		setBoundry(index, 25100, fifthRowXPos - 12, fifthRowYPos - 20,
				prayerMenu);
		index++;
		/* Row six *//** Piety */
		setBoundry(index, 25102, sixthRowXPos - 2, sixthRowYPos, prayerMenu);
		index++;
	}

	public static void quickCurses(TextDrawingArea[] TDA) {
		int frame = 0;
		RSInterface tab = addTabInterface(17234);
		addSprite(17201, 3, "/Interfaces/QuickPrayer/Sprite");
		addText(17235, "Select your quick curses:", TDA, 0, 0xFF981F, false,
				true);
		addTransparentSprite(17229, 0, "/Interfaces/QuickPrayer/Sprite", 50);
		for (int i = 17202, j = 630; i <= 17222 || j <= 656; i++, j++) {
			addConfigButton(i, 17200, 2, 1, "/Interfaces/QuickPrayer/Sprite",
					14, 15, "Select", 0, 1, j);
		}
		addHoverButton(17231, "/Interfaces/QuickPrayer/Sprite", 4, 190, 24,
				"Confirm Selection", -1, 17232, 1);
		addHoveredButton(17232, "/Interfaces/QuickPrayer/Sprite", 5, 190, 24,
				17233);

		setChildren(46, tab);
		setBounds(22504, 5, 8 + 20, frame++, tab);
		setBounds(22506, 44, 8 + 20, frame++, tab);
		setBounds(22508, 79, 11 + 20, frame++, tab);
		setBounds(22510, 116, 10 + 20, frame++, tab);
		setBounds(22512, 153, 9 + 20, frame++, tab);
		setBounds(22514, 5, 48 + 20, frame++, tab);
		setBounds(22516, 44, 47 + 20, frame++, tab);
		setBounds(22518, 79, 49 + 20, frame++, tab);
		setBounds(22520, 116, 50 + 20, frame++, tab);
		setBounds(22522, 154, 50 + 20, frame++, tab);
		setBounds(22524, 4, 84 + 20, frame++, tab);
		setBounds(22526, 44, 87 + 20, frame++, tab);
		setBounds(22528, 81, 85 + 20, frame++, tab);
		setBounds(22530, 117, 85 + 20, frame++, tab);
		setBounds(22532, 156, 87 + 20, frame++, tab);
		setBounds(22534, 5, 125 + 20, frame++, tab);
		setBounds(22536, 43, 124 + 20, frame++, tab);
		setBounds(22538, 83, 124 + 20, frame++, tab);
		setBounds(22540, 115, 121 + 20, frame++, tab);
		setBounds(22542, 154, 124 + 20, frame++, tab);
		setBounds(17229, 0, 25, frame++, tab);// Faded backing
		setBounds(17201, 0, 22, frame++, tab);// Split
		setBounds(17201, 0, 237, frame++, tab);// Split
		setBounds(17202, 5 - 3, 8 + 17, frame++, tab);
		setBounds(17203, 44 - 3, 8 + 17, frame++, tab);
		setBounds(17204, 79 - 3, 8 + 17, frame++, tab);
		setBounds(17205, 116 - 3, 8 + 17, frame++, tab);
		setBounds(17206, 153 - 3, 8 + 17, frame++, tab);
		setBounds(17207, 5 - 3, 48 + 17, frame++, tab);
		setBounds(17208, 44 - 3, 48 + 17, frame++, tab);
		setBounds(17209, 79 - 3, 48 + 17, frame++, tab);
		setBounds(17210, 116 - 3, 48 + 17, frame++, tab);
		setBounds(17211, 153 - 3, 48 + 17, frame++, tab);
		setBounds(17212, 5 - 3, 85 + 17, frame++, tab);
		setBounds(17213, 44 - 3, 85 + 17, frame++, tab);
		setBounds(17214, 79 - 3, 85 + 17, frame++, tab);
		setBounds(17215, 116 - 3, 85 + 17, frame++, tab);
		setBounds(17216, 153 - 3, 85 + 17, frame++, tab);
		setBounds(17217, 5 - 3, 124 + 17, frame++, tab);
		setBounds(17218, 44 - 3, 124 + 17, frame++, tab);
		setBounds(17219, 79 - 3, 124 + 17, frame++, tab);
		setBounds(17220, 116 - 3, 124 + 17, frame++, tab);
		setBounds(17221, 153 - 3, 124 + 17, frame++, tab);
		setBounds(17235, 5, 5, frame++, tab);// text
		setBounds(17231, 0, 237, frame++, tab);// confirm
		setBounds(17232, 0, 237, frame++, tab);// Confirm hover
	}

	public static void addTransparentSprite(int id, int spriteId,
			String spriteName, int opacity) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 10;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) opacity;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(spriteId, spriteName);
		tab.enabledSprite = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
		tab.drawsTransparent = true;
	}

	public static void editClan(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(40172);
		addSprite(47251, 1, "/Clan Chat/CLAN");
		addHoverButton(47252, "/Clan Chat/BUTTON", 1, 150, 35, "Set name",
				22222, 47253, 1);
		addHoveredButton(47253, "/Clan Chat/BUTTON", 2, 150, 35, 47254);
		addHoverButton(47255, "/Clan Chat/BUTTON", 1, 150, 35, "Anyone", -1,
				47256, 1);
		addHoveredButton(47256, "/Clan Chat/BUTTON", 2, 150, 35, 47257);

		addHoverButton(48000, "b", 1, 150, 35, "Only me", -1, 47999, 1);
		addHoverButton(48001, "b", 1, 150, 35, "General+", -1, 47999, 1);
		addHoverButton(48002, "b", 1, 150, 35, "Captain+", -1, 47999, 1);
		addHoverButton(48003, "b", 1, 150, 35, "Lieutenant+", -1, 47999, 1);
		addHoverButton(48004, "b", 1, 150, 35, "Sergeant+", -1, 47999, 1);
		addHoverButton(48005, "b", 1, 150, 35, "Corporal+", -1, 47999, 1);
		addHoverButton(48006, "b", 1, 150, 35, "Recruit+", -1, 47999, 1);
		addHoverButton(48007, "b", 1, 150, 35, "Any friends", -1, 47999, 1);

		addHoverButton(47258, "/Clan Chat/BUTTON", 1, 150, 35, "Anyone", -1,
				47259, 1);
		addHoveredButton(47259, "/Clan Chat/BUTTON", 2, 150, 35, 17260);

		addHoverButton(48010, "b", 1, 150, 35, "Only me", -1, 47999, 1);
		addHoverButton(48011, "b", 1, 150, 35, "General+", -1, 47999, 1);
		addHoverButton(48012, "b", 1, 150, 35, "Captain+", -1, 47999, 1);
		addHoverButton(48013, "b", 1, 150, 35, "Lieutenant+", -1, 47999, 1);
		addHoverButton(48014, "b", 1, 150, 35, "Sergeant+", -1, 47999, 1);
		addHoverButton(48015, "b", 1, 150, 35, "Corporal+", -1, 47999, 1);
		addHoverButton(48016, "b", 1, 150, 35, "Recruit+", -1, 47999, 1);
		addHoverButton(48017, "b", 1, 150, 35, "Any friends", -1, 47999, 1);

		addHoverButton(47261, "/Clan Chat/BUTTON", 1, 150, 35, "Only me", -1,
				47262, 1);
		addHoveredButton(47262, "/Clan Chat/BUTTON", 2, 150, 35, 47263);

		// addHoverButton(48020, "b", 1, 150, 35, "Only me", -1, 47999, 1);
		addHoverButton(48021, "b", 1, 150, 35, "General+", -1, 47999, 1);
		addHoverButton(48022, "b", 1, 150, 35, "Captain+", -1, 47999, 1);
		addHoverButton(48023, "b", 1, 150, 35, "Lieutenant+", -1, 47999, 1);
		addHoverButton(48024, "b", 1, 150, 35, "Sergeant+", -1, 47999, 1);
		addHoverButton(48025, "b", 1, 150, 35, "Corporal+", -1, 47999, 1);
		addHoverButton(48026, "b", 1, 150, 35, "Recruit+", -1, 47999, 1);

		addHoverButton(47267, "/Clan Chat/CLOSE", 3, 16, 16, "Close", -1,
				47268, 1);
		addHoveredButton(47268, "/Clan Chat/CLOSE", 4, 16, 16, 47269);

		addText(47800, "Clan name:", tda, 0, 0xff981f, false, true);
		addText(47801, "Who can enter chat?", tda, 0, 0xff981f, false, true);
		addText(47812, "Who can talk on chat?", tda, 0, 0xff981f, false, true);
		addText(47813, "Who can kick on chat?", tda, 0, 0xff981f, false, true);
		addText(47814, "Alex", tda, 0, 0xffffff, true, true);
		addText(47815, "Anyone", tda, 0, 0xffffff, true, true);
		addText(47816, "Anyone", tda, 0, 0xffffff, true, true);
		addText(47817, "Only me", tda, 0, 0xffffff, true, true);
		tab.totalChildren(42);
		tab.child(0, 47251, 15, 15);
		tab.child(1, 47252, 25, 47 + 20);
		tab.child(2, 47253, 25, 47 + 20);
		tab.child(3, 47267, 476, 23);
		tab.child(4, 47268, 476, 23);
		tab.child(5, 48000, 25, 87 + 25);
		tab.child(6, 48001, 25, 87 + 25);
		tab.child(7, 48002, 25, 87 + 25);
		tab.child(8, 48003, 25, 87 + 25);
		tab.child(9, 48004, 25, 87 + 25);
		tab.child(10, 48005, 25, 87 + 25);
		tab.child(11, 48006, 25, 87 + 25);
		tab.child(12, 48007, 25, 87 + 25);
		tab.child(13, 47255, 25, 87 + 25);
		tab.child(14, 47256, 25, 87 + 25);
		tab.child(15, 48010, 25, 128 + 30);
		tab.child(16, 48011, 25, 128 + 30);
		tab.child(17, 48012, 25, 128 + 30);
		tab.child(18, 48013, 25, 128 + 30);
		tab.child(19, 48014, 25, 128 + 30);
		tab.child(20, 48015, 25, 128 + 30);
		tab.child(21, 48016, 25, 128 + 30);
		tab.child(22, 48017, 25, 128 + 30);
		tab.child(23, 47258, 25, 128 + 30);
		tab.child(24, 47259, 25, 128 + 30);
		// tab.child(25, 48020, 25, 168+35);
		tab.child(25, 48021, 25, 168 + 35);
		tab.child(26, 48022, 25, 168 + 35);
		tab.child(27, 48023, 25, 168 + 35);
		tab.child(28, 48024, 25, 168 + 35);
		tab.child(29, 48025, 25, 168 + 35);
		tab.child(30, 48026, 25, 168 + 35);
		tab.child(31, 47261, 25, 168 + 35);
		tab.child(32, 47262, 25, 168 + 35);
		tab.child(33, 47800, 73, 54 + 20);
		tab.child(34, 47801, 53, 95 + 25);
		tab.child(35, 47812, 53, 136 + 30);
		tab.child(36, 47813, 53, 177 + 35);
		tab.child(37, 47814, 100, 54 + 20 + 12);
		tab.child(38, 47815, 100, 95 + 25 + 12);
		tab.child(39, 47816, 100, 136 + 30 + 12);
		tab.child(40, 47817, 100, 177 + 35 + 12);
		tab.child(41, 44000, 0, 94);

		tab = addTabInterface(44000);
		tab.width = 474;
		tab.height = 213;
		tab.scrollMax = 2030;
		for (int i = 44001; i <= 44200; i++) {
			addText(i, "", tda, 1, 0xffff64, false, true, true);
		}
		for (int i = 44801; i <= 45000; i++) {
			// addText(i, "Not in clan", tda, 1, 0xffffff, false, true);
			addHoverText(i, "Not ranked", "[CC]", tda, 1, 0xffffff, false,
					false, 150);
		}
		tab.totalChildren(400);
		int Child = 0;
		int Y = 3;
		for (int i = 44001; i <= 44200; i++) {
			tab.child(Child, i, 204, Y);
			Child++;
			Y += 13;
		}
		Y = 3;
		for (int i = 44801; i <= 45000; i++) {
			tab.child(Child, i, 343, Y);
			Child++;
			Y += 13;
		}
	}

	public static void addText(int id, String text, TextDrawingArea tda[],
			int idx, int color, boolean center, boolean shadow, boolean cc) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 4;
		tab.atActionType = 0;
		tab.width = 0;
		tab.height = 11;
		tab.contentType = 0;
		tab.opacity = 0;
		// tab.hoverType = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = tda[idx];
		tab.message = text;
		tab.aString228 = "";
		tab.textColor = color;
		tab.anInt219 = 0;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
	}

	public static void clanChatTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(18128);
		addHoverButton(18129, "/Clan Chat/SPRITE", 6, 72, 32,
				"Join/Leave a Clan", 550, 18130, 1);
		addHoveredButton(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
		addHoverButton(18132, "/Clan Chat/SPRITE", 6, 72, 32,
				"Open Clan Setup", -1, 18133, 5);
		addHoveredButton(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
		addButton(18250, 0, "/Clan Chat/Lootshare", "Toggle lootshare");
		addText(18135, "Join Chat", tda, 0, 0xff9b00, true, true);
		addText(18136, "Clan Setup", tda, 0, 0xff9b00, true, true);
		addSprite(18137, 37, "/Clan Chat/SPRITE");
		addText(18138, "Clan Chat", tda, 1, 0xff9b00, true, true);
		addText(18139, "Talking in: Not in chat", tda, 0, 0xff9b00, false, true);
		addText(18140, "Owner: None", tda, 0, 0xff9b00, false, true);
		addHoverButton(18343, "/Clan Chat/kick", 0, 23, 23, "Kick", 677, 18344,
				1);
		addHoveredButton(18344, "/Clan Chat/kick", 1, 23, 23, 18345);
		tab.totalChildren(14);
		tab.child(0, 18137, 0, 62);
		tab.child(1, 18143, 0, 62);
		tab.child(2, 18129, 15, 226);
		tab.child(3, 18130, 15, 226);
		tab.child(4, 18132, 103, 226);
		tab.child(5, 18133, 103, 226);
		tab.child(6, 18135, 51, 237);
		tab.child(7, 18136, 139, 237);
		tab.child(8, 18138, 95, 1);
		tab.child(9, 18139, 10, 23);
		tab.child(10, 18140, 25, 38);
		tab.child(11, 18250, 145, 5);
		tab.child(12, 18343, 147, 35);
		tab.child(13, 18344, 147, 35);
		/* Text area */
		RSInterface list = addTabInterface(18143);
		list.totalChildren(200);

		for (int i = 38144; i <= 38244; i++) {
			addSprite(i, 0, 0, "/Clan Chat/CC");
		}
		for (int i = 18144; i <= 18244; i++) {
			addText(i, "", tda, 0, 0xffffff, false, true);
		}
		for (int id = 38144, i = 100; id <= 38243 && i <= 199; id++, i++) {
			list.children[i] = id;
			list.childX[i] = 5;
			for (int id2 = 38144, i2 = 101; id2 <= 38243 && i2 <= 199; id2++, i2++) {
				list.childY[0] = 2;
				list.childY[i2] = list.childY[i2 - 1] + 14;
			}
		}

		for (int id = 18144, i = 0; id <= 18243 && i <= 99; id++, i++) {
			list.children[i] = id;
			list.childX[i] = 12;
			for (int id2 = 18144, i2 = 1; id2 <= 18243 && i2 <= 99; id2++, i2++) {
				list.childY[0] = 2;
				list.childY[i2] = list.childY[i2 - 1] + 14;
			}
		}
		list.height = 158;
		list.width = 174;
		list.scrollMax = 1405;
	}

	public static void addSprite(int id, int spriteId1, int spriteId2,
			String spriteName) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		// tab.hoverType = 52;
		tab.disabledSprite = imageLoader(spriteId1, spriteName);
		tab.enabledSprite = imageLoader(spriteId2, spriteName);
		for (int i = 0; i < 10; i++) {
			tab.savedSprite[i] = imageLoader(i, spriteName);
		}
		tab.width = 512;
		tab.height = 334;
	}

	public static void quickPrayers(TextDrawingArea[] TDA) {
		int frame = 0;
		RSInterface tab = addTabInterface(17200);
		addSprite(17201, 3, "/Interfaces/QuickPrayer/Sprite");
		addText(17230, "Select your quick prayers:", TDA, 0, 0xFF981F, false,
				true);
		addTransparentSprite(17229, 0, "/Interfaces/QuickPrayer/Sprite", 50);
		for (int i = 17202, j = 630; i <= 17228 || j <= 656; i++, j++) {
			addConfigButton(i, 17200, 2, 1, "/Interfaces/QuickPrayer/Sprite",
					14, 15, "Select", 0, 1, j);
		}
		addHoverButton(17231, "/Interfaces/QuickPrayer/Sprite", 4, 190, 24,
				"Confirm Selection", -1, 17232, 1);
		addHoveredButton(17232, "/Interfaces/QuickPrayer/Sprite", 5, 190, 24,
				17233);

		setChildren(58, tab);//
		/*
		 * addPrayer(22503, 0, 83, 49, 7, "Protect Item", 22582);
		 * setBounds(22503, 2, 5, index, Interface);index++;//Glow
		 * setBounds(22504, 8, 8, index, Interface);index++;//Icon
		 */
		setBounds(25001, 5, 8 + 20, frame++, tab);
		setBounds(25003, 44, 8 + 20, frame++, tab);
		setBounds(25005, 79, 11 + 20, frame++, tab);
		setBounds(25007, 116, 10 + 20, frame++, tab);
		setBounds(25009, 153, 9 + 20, frame++, tab);
		setBounds(25011, 5, 48 + 20, frame++, tab);
		setBounds(25013, 44, 47 + 20, frame++, tab);
		setBounds(25015, 79, 49 + 20, frame++, tab);
		setBounds(25017, 116, 50 + 20, frame++, tab);
		setBounds(25019, 154, 50 + 20, frame++, tab);
		setBounds(25021, 4, 84 + 20, frame++, tab);
		setBounds(25023, 44, 87 + 20, frame++, tab);
		setBounds(25025, 81, 85 + 20, frame++, tab);
		setBounds(25027, 117, 85 + 20, frame++, tab);
		setBounds(25029, 156, 87 + 20, frame++, tab);
		setBounds(25031, 5, 125 + 20, frame++, tab);
		setBounds(25033, 43, 124 + 20, frame++, tab);
		setBounds(25035, 83, 124 + 20, frame++, tab);
		setBounds(25037, 115, 121 + 20, frame++, tab);
		setBounds(25039, 154, 124 + 20, frame++, tab);
		setBounds(25041, 5, 160 + 20, frame++, tab);
		setBounds(25043, 41, 158 + 20, frame++, tab);
		setBounds(25045, 79, 163 + 20, frame++, tab);
		setBounds(25047, 116, 158 + 20, frame++, tab);
		setBounds(25049, 161, 160 + 20, frame++, tab);
		setBounds(25051, 4, 207 + 12, frame++, tab);

		setBounds(17229, 0, 25, frame++, tab);// Faded backing
		setBounds(17201, 0, 22, frame++, tab);// Split
		setBounds(17201, 0, 237, frame++, tab);// Split

		setBounds(17202, 5 - 3, 8 + 17, frame++, tab);
		setBounds(17203, 44 - 3, 8 + 17, frame++, tab);
		setBounds(17204, 79 - 3, 8 + 17, frame++, tab);
		setBounds(17205, 116 - 3, 8 + 17, frame++, tab);
		setBounds(17206, 153 - 3, 8 + 17, frame++, tab);
		setBounds(17207, 5 - 3, 48 + 17, frame++, tab);
		setBounds(17208, 44 - 3, 48 + 17, frame++, tab);
		setBounds(17209, 79 - 3, 48 + 17, frame++, tab);
		setBounds(17210, 116 - 3, 48 + 17, frame++, tab);
		setBounds(17211, 153 - 3, 48 + 17, frame++, tab);
		setBounds(17212, 5 - 3, 85 + 17, frame++, tab);
		setBounds(17213, 44 - 3, 85 + 17, frame++, tab);
		setBounds(17214, 79 - 3, 85 + 17, frame++, tab);
		setBounds(17215, 116 - 3, 85 + 17, frame++, tab);
		setBounds(17216, 153 - 3, 85 + 17, frame++, tab);
		setBounds(17217, 5 - 3, 124 + 17, frame++, tab);
		setBounds(17218, 44 - 3, 124 + 17, frame++, tab);
		setBounds(17219, 79 - 3, 124 + 17, frame++, tab);
		setBounds(17220, 116 - 3, 124 + 17, frame++, tab);
		setBounds(17221, 153 - 3, 124 + 17, frame++, tab);
		setBounds(17222, 5 - 3, 160 + 17, frame++, tab);
		setBounds(17223, 44 - 3, 160 + 17, frame++, tab);
		setBounds(17224, 79 - 3, 160 + 17, frame++, tab);
		setBounds(17225, 116 - 3, 160 + 17, frame++, tab);
		setBounds(17226, 153 - 3, 160 + 17, frame++, tab);
		setBounds(17227, 4 - 3, 207 + 4, frame++, tab);

		setBounds(17230, 5, 5, frame++, tab);// text
		setBounds(17231, 0, 237, frame++, tab);// confirm
		setBounds(17232, 0, 237, frame++, tab);// Confirm hover
	}

	public static void addHoverText(int id, String text, String tooltip,
			TextDrawingArea tda[], int idx, int color, boolean center,
			boolean textShadow, int width) {
		RSInterface rsinterface = addInterface(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = width;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = center;
		rsinterface.textShadow = textShadow;
		rsinterface.textDrawingAreas = tda[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.anInt219 = 0;
		rsinterface.anInt216 = 0xffffff;
		rsinterface.anInt239 = 0;
		rsinterface.tooltip = tooltip;
	}

	public static void Welcome(TextDrawingArea[] TDA) {
		RSInterface rsinterface = addInterface(450);
		addSprite2(21300, "Welcome/Welcome");
		addHoverButton(21301, "Enter Server Normal", 0, 202, 67,
				"Enter Server", -1, 21302, 1);
		addHoveredButton(21302, "Welcome/Enter Server Hover", 0, 202, 67, 21303);
		addHoverButton(21304, "SpawnPK Normal", 0, 202, 67, "Enter SpawnPK",
				-1, 21305, 1);
		addHoveredButton(21305, "Welcome/SpawnPK Hover", 0, 202, 67, 21306);
		addHoverButton(21307, "Lunar Island Normal", 0, 106, 9,
				"Change Home Location", -1, 21308, 1);
		addHoveredButton(21308, "Welcome/Lunar Island Hover", 0, 106, 9, 21309);
		addHoverButton(21310, "Edgeville Normal", 0, 74, 10,
				"Change Home Location", -1, 21311, 1);
		addHoveredButton(21311, "Welcome/Edgeville Hover", 0, 74, 10, 21312);
		addHoverButton(21313, "Get More Normal", 0, 75, 10, "Donate to Zarpor",
				-1, 21314, 1);
		addHoveredButton(21314, "Welcome/Get More Hover", 0, 75, 10, 21315);
		addHoverButton(21316, "Rules Normal", 0, 61, 15, "Rules", -1, 21317, 1);
		addHoveredButton(21317, "Welcome/Rules Hover", 0, 61, 15, 21318);
		addHoverButton(21319, "Forum Normal", 0, 76, 14, "Visit the Forums",
				-1, 21320, 1);
		addHoveredButton(21320, "Welcome/Forum Hover", 0, 76, 14, 21321);
		addText(21322, "Welcome to Zarpor!", 0x0099CC, true, false, 52, TDA, 1);
		addText(21323, "0", 0x0099CC, true, false, 52, TDA, 1);
		addText(21324, "Normal Player", 0x0099CC, true, false, 52, TDA, 1);
		addText(21325, "Not a Donator", 0x0099CC, true, false, 52, TDA, 1);
		addText(21326, "*", 0x0099CC, true, false, 52, TDA, 1);
		addText(21327, "*", 0x0099CC, true, false, 52, TDA, 1);
		rsinterface.totalChildren(21);
		rsinterface.child(0, 21300, 0, 0);
		rsinterface.child(1, 21301, 130, 386);
		rsinterface.child(2, 21302, 130, 386);

		rsinterface.child(3, 21304, 431, 386);
		rsinterface.child(4, 21305, 431, 386);

		rsinterface.child(5, 21310, 191, 198);// edge
		rsinterface.child(6, 21311, 191, 198);

		rsinterface.child(7, 21307, 180, 232);// lunar
		rsinterface.child(8, 21308, 180, 232);

		rsinterface.child(9, 21313, 503, 231);
		rsinterface.child(10, 21314, 503, 231);

		rsinterface.child(11, 21316, 123, 337);
		rsinterface.child(12, 21317, 123, 337);

		rsinterface.child(13, 21319, 252, 338);
		rsinterface.child(14, 21320, 252, 338);

		rsinterface.child(15, 21322, 225, 293);
		rsinterface.child(16, 21323, 540, 195);
		rsinterface.child(17, 21324, 540, 295);
		rsinterface.child(18, 21325, 540, 325);
		rsinterface.child(19, 21326, 120, 230);
		rsinterface.child(20, 21327, 120, 197);// edge

	}

	public static void QuestTab(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(39154);
		setChildren(3, Interface);
		addText(39155, "Quest Journal", 0xFF981F, false, true, 52, TDA, 2);
		addSprite(39157, 0, "Interfaces/QuestTab/QUEST");
		setBounds(39155, 10, 5, 0, Interface);
		setBounds(39157, 3, 24, 1, Interface);
		setBounds(39160, 5, 29, 2, Interface);
		Interface = addInterface(39160);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 1000;
		setChildren(104, Interface);
		int Ypos = 4;
		int frameID = 0;
		for (int iD = 39161; iD <= 39264; iD++) {
			addHoverText(iD, "", "View Quest Journal", TDA, 0, 0xff0000, false,
					true, 150);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += 15;
			Ypos++;
		}
	}
	
	public static void infoTab(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(638);
		setChildren(3, Interface);
		addText(29155, "Account Information", 0xFF981F, false, true, 52, TDA, 2);
		addSprite(29157, 0, "Interfaces/QuestTab/QUEST");
		setBounds(29155, 10, 5, 0, Interface);
		setBounds(29157, 3, 24, 1, Interface);
		setBounds(29160, 5, 29, 2, Interface);
		Interface = addInterface(29160);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 350;
		setChildren(102, Interface);
		addText(29161, "@or1@Players online: @gre@", 0xFF981F, false, true, 52,
				TDA, 2);
		addText(29162, "@or1@Staff online: @gre@", 0xFF981F, false, true, 52,
				TDA, 2);
		setBounds(29161, 5, 4, 0, Interface);
		setBounds(29162, 8, 22, 1, Interface);
		int Ypos = 40;
		int frameID = 2;
		for (int iD = 29165; iD <= 29264; iD++) {
			addHoverText(iD, "", "Continue", TDA, 0, 0xff0000, false,
					true, 150);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += 15;
			Ypos++;
		}
		Client.sendFrame126("@red@- - Character Info - -", 29165);
		Client.sendFrame126("@red@- - Player Controls - -", 29175);
		Client.sendFrame126("@cya@Friday Fun Night", 29176);
		Client.sendFrame126("@gre@Donator Options", 29177);
		Client.sendFrame126("@gre@Price Checker", 29178);
		Client.sendFrame126("@gre@Community Center", 29179);
		Client.sendFrame126("", 29317);
		Client.sendFrame126("", 29318);
		Client.sendFrame126("Equipment Lock", 669);// duel
		for (int i = 0; i <= 4; i++)
			addText(19200+i, "", 0xFF981F, false, true, -1, TDA, 2);
	}

	public static void achievementTab(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(32265);
		setChildren(3, Interface);
		addText(32266, "Achievements", 0xFF981F, false, true, -1, TDA, 2);
		addSprite(32269, 0, "Interfaces/QuestTab/QUEST");
		setBounds(32266, 10, 5, 0, Interface);
		setBounds(32269, 3, 24, 1, Interface);
		setBounds(32268, 5, 29, 2, Interface);
		Interface = addInterface(32268);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 560;
		setChildren(100, Interface);
		int Ypos = 4;
		int frameID = 0;
		for (int iD = 32165; iD <= 32264; iD++) {
			addHoverText(iD, "", "View Tasks", TDA, 0, 0xff0000, false, true,
					150);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += 15;
			Ypos++;
		}
	}

	public static void actionTab(TextDrawingArea[] TDA, int index) {
		RSInterface Interface = addInterface(29265);
		setChildren(3, Interface);
		addText(29266, "Teleportation Menu", 0xFF981F, false, true, -1, TDA, 2);
		addSprite(29269, 0, "Interfaces/QuestTab/QUEST");
		setBounds(29266, 10, 5, 0, Interface);
		setBounds(29269, 3, 24, 1, Interface);
		setBounds(29268, 5, 29, 2, Interface);
		Interface = addInterface(29268);
		Interface.height = 214;
		Interface.width = 165;
		Interface.scrollMax = 210;
		int max = Configuration.teleportOptions[index].length;
		setChildren(max, Interface);
		int Ypos = 4;
		int frameID = 0;
		for (int iD = 29295; iD <= 29294 + max; iD++) {
			String s = Configuration.teleportOptions[index][frameID];
			Boolean cat = s.indexOf("Teleports") > 0;
			addHoverText(iD, (cat && frameID > 0 ? "- " + s : s),
					(s.length() > 0 && frameID != 0) ? (cat ? "View"
							: "Teleport")
							: (index > 0 && frameID == 0) ? "Back" : "", TDA,
					0, frameID == 0 ? 0x0FFFF : (index > 0 ? 0xFFA500
							: (cat ? 0x00FF00 : 0x2E9AFE)),
					(index > 0 || frameID == 0) ? true : false, true, 145);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += cat ? 20 : 15;
			Ypos++;
		}
	}

	private static void addHead2(int i, int j, int k, int l) {
		RSInterface rsinterface = addTab(i);
		rsinterface.type = 6;
		rsinterface.modelZoom = l;
		rsinterface.modelRotation2 = 40;
		rsinterface.modelRotation1 = 1900;
		rsinterface.height = k;
		rsinterface.width = j;
	}

	public void swapInventoryItems(int i, int j) {
		int k = inv[i];
		inv[i] = inv[j];
		inv[j] = k;
		k = invStackSizes[i];
		invStackSizes[i] = invStackSizes[j];
		invStackSizes[j] = k;
	}

	public static void ColorChanger(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(31000);
		addSprite(31001, "PrivateChat/Private");
		addSprite(31057, "sample 0");
		addHoverButton(31002, "PrivateChat/Color 0", 16, 16, "Use", -1, 31003,
				1);
		addHoveredButton(31003, "PrivateChat/GoldBox", 19, 20, 31004);
		addHoverButton(31005, "PrivateChat/Color 1", 16, 16, "Use", -1, 31006,
				1);
		addHoveredButton(31006, "PrivateChat/GoldBox", 19, 20, 31007);
		addHoverButton(31008, "PrivateChat/Color 2", 16, 16, "Use", -1, 31009,
				1);
		addHoveredButton(31009, "PrivateChat/GoldBox", 19, 20, 31010);
		addHoverButton(31011, "PrivateChat/Color 3", 16, 16, "Use", -1, 31012,
				1);
		addHoveredButton(31012, "PrivateChat/GoldBox", 19, 20, 31013);
		addHoverButton(31014, "PrivateChat/Color 4", 16, 16, "Use", -1, 31015,
				1);
		addHoveredButton(31015, "PrivateChat/GoldBox", 19, 20, 31016);
		addHoverButton(31017, "PrivateChat/Color 5", 16, 16, "Use", -1, 31018,
				1);
		addHoveredButton(31018, "PrivateChat/GoldBox", 19, 20, 31019);
		addHoverButton(31020, "PrivateChat/Color 6", 16, 16, "Use", -1, 31021,
				1);
		addHoveredButton(31021, "PrivateChat/GoldBox", 19, 20, 31022);
		addHoverButton(31023, "PrivateChat/Color 7", 16, 16, "Use", -1, 31024,
				1);
		addHoveredButton(31024, "PrivateChat/GoldBox", 19, 20, 31025);
		addHoverButton(31026, "PrivateChat/Color 8", 16, 16, "Use", -1, 31027,
				1);
		addHoveredButton(31027, "PrivateChat/GoldBox", 19, 20, 31028);
		addHoverButton(31029, "PrivateChat/Color 9", 16, 16, "Use", -1, 31030,
				1);
		addHoveredButton(31030, "PrivateChat/GoldBox", 19, 20, 31031);
		addHoverButton(31032, "PrivateChat/Color 10", 16, 16, "Use", -1, 31033,
				1);
		addHoveredButton(31033, "PrivateChat/GoldBox", 19, 20, 31034);
		addHoverButton(31035, "PrivateChat/Color 11", 16, 16, "Use", -1, 31036,
				1);
		addHoveredButton(31036, "PrivateChat/GoldBox", 19, 20, 31037);
		addHoverButton(31038, "PrivateChat/Color 12", 16, 16, "Use", -1, 31039,
				1);
		addHoveredButton(31039, "PrivateChat/GoldBox", 19, 20, 31040);
		addHoverButton(31041, "PrivateChat/Color 13", 16, 16, "Use", -1, 31042,
				1);
		addHoveredButton(31042, "PrivateChat/GoldBox", 19, 20, 31043);
		addHoverButton(31044, "PrivateChat/Color 14", 16, 16, "Use", -1, 31045,
				1);
		addHoveredButton(31045, "PrivateChat/GoldBox", 19, 20, 31046);
		addHoverButton(31047, "PrivateChat/X", 16, 15, "Close", -1, 31048, 1);
		addHoveredButton(31048, "PrivateChat/HX", 16, 15, 31049);
		addToggleButton(31050, 0, 2, "PrivateChat/CHECK", "Toggle", 1, 4, 500);
		addHoverButton(31054, "PrivateChat/Close", 0, 200, 30, "Back", -1, 31055, 1);
		addHoveredButton(31055, "PrivateChat/Close", 1, 200, 30, 31056);
		addText(31059, "Sample Text", Client.getChatColor(), false, true, -1,
				tda, 0);
		tab.totalChildren(38);
		tab.child(0, 31001, 0, 2);
		tab.child(1, 31002, 26, 119);
		tab.child(2, 31003, 25, 117);
		tab.child(3, 31005, 56, 119);
		tab.child(4, 31006, 55, 117);
		tab.child(5, 31008, 86, 119);
		tab.child(6, 31009, 85, 117);
		tab.child(7, 31011, 116, 119);
		tab.child(8, 31012, 115, 117);
		tab.child(9, 31014, 146, 119);
		tab.child(10, 31015, 145, 117);
		tab.child(11, 31017, 26, 149);
		tab.child(12, 31018, 25, 147);
		tab.child(13, 31020, 56, 149);
		tab.child(14, 31021, 55, 147);
		tab.child(15, 31023, 86, 149);
		tab.child(16, 31024, 85, 147);
		tab.child(17, 31026, 116, 149);
		tab.child(18, 31027, 115, 147);
		tab.child(19, 31029, 146, 149);
		tab.child(20, 31030, 145, 147);
		tab.child(21, 31032, 26, 179);
		tab.child(22, 31033, 25, 177);
		tab.child(23, 31035, 56, 179);
		tab.child(24, 31036, 55, 177);
		tab.child(25, 31038, 86, 179);
		tab.child(26, 31039, 85, 177);
		tab.child(27, 31041, 116, 179);
		tab.child(28, 31042, 115, 177);
		tab.child(29, 31044, 146, 179);
		tab.child(30, 31045, 145, 177);
		tab.child(31, 31047, 167, 10);
		tab.child(32, 31048, 167, 10);
		tab.child(33, 31050, 167, 50);
		tab.child(34, 31054, 170, 5);
		tab.child(35, 31055, 170, 5);
		tab.child(36, 31057, 20, 220);
		tab.child(37, 31059, 64, 225);
	}

	private static Sprite imageLoader(String s) {
		long l = (TextClass.method585(s) << 8);
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null)
			return sprite;
		try {
			sprite = new Sprite(s);
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public static void addHoveredButton(int i, String imageName, int w, int h,
			int IMAGEID) {
		RSInterface tab = addTabInterface(i);
		tab.parentID = i;
		tab.id = i;
		tab.type = 0;
		tab.atActionType = 0;
		tab.width = w;
		tab.height = h;
		tab.isMouseoverTriggered = true;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.scrollMax = 0;
		addHoverImage(IMAGEID, imageName);
		tab.totalChildren(1);
		tab.child(0, IMAGEID, 0, 0);
	}

	public static void addHoverImage(int i, String name) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.width = 512;
		tab.height = 334;
		tab.opacity = 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(name);
		tab.enabledSprite = imageLoader(name);
	}

	public static void resetRunesAndLevels(int id) {
		RSInterface rsInterface = interfaceCache[id];
		rsInterface.valueCompareType = new int[4];
		rsInterface.requiredValues = new int[4];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = 565;
		rsInterface.valueCompareType[1] = 3;
		rsInterface.requiredValues[1] = 560;
		rsInterface.valueCompareType[2] = 3;
		rsInterface.requiredValues[2] = 555;
		rsInterface.valueCompareType[3] = 3;
		rsInterface.requiredValues[3] = 1;

		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = 0;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = 0;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = 0;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;

	}

	public static void addToggleButton(int id, int bID, int bID2, String bName,
			String tT, int configID, int aT, int configFrame) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = 0;// anInt214
		tab.opacity = 0;
		tab.mOverInterToTrigger = 52;
		tab.requiredValues = new int[1];
		tab.valueCompareType = new int[1];
		tab.requiredValues[0] = 1;
		tab.valueCompareType[0] = configID;
		tab.valueIndexArray = new int[1][3];
		tab.valueIndexArray[0][0] = 5;
		tab.valueIndexArray[0][1] = configFrame;
		tab.valueIndexArray[0][2] = 0;
		tab.disabledSprite = imageLoader(bID, bName);
		tab.enabledSprite = imageLoader(bID2, bName);
		tab.width = tab.disabledSprite.myWidth;
		tab.height = tab.disabledSprite.myHeight;
		tab.tooltip = tT;
	}

	public static void addSprite(int id, String spriteName) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5; // 5
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(spriteName);
		tab.enabledSprite = imageLoader(spriteName);
		tab.width = 512;
		tab.height = 334;
	}

	public static void addSprite2(int id, String spriteName) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5; // 5
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(spriteName);
		tab.enabledSprite = imageLoader(spriteName);
		tab.width = 512;
		tab.height = 334;
	}

	public static void addHoverButton(int i, String imageName, int width,
			int height, String text, int contentType, int hoverOver, int aT) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = contentType;
		tab.opacity = 0;
		tab.mOverInterToTrigger = hoverOver;
		tab.disabledSprite = imageLoader(imageName);
		tab.enabledSprite = imageLoader(imageName);
		tab.width = width;
		tab.height = height;
		tab.tooltip = text;
	}

	public static void ConOptionsTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(6300);
		addText(16301, "House Options", 0xFF981F, false, true, -1, tda, 2);
		addConfigButton(16302, 6300, 30, 31, "/Options/SPRITE", 40, 40,
				"Building Mode On", 0, 5, 289);
		addConfigButton(16303, 6300, 30, 31, "/Options/SPRITE", 40, 40,
				"Building Mode Off", 1, 5, 289);
		addHoverButton(16304, "Abuse/EXIT", 1, 16, 16, "Back", -1, 16305, 1);
		addHoveredButton(16305, "Abuse/EXIT", 2, 16, 16, 16314);
		addText(16306, "Building Mode", tda, 1, 0xff9b00, true, true);
		addText(16307, "Number of rooms: 0", tda, 1, 0xff9b00, true, true);
		addConfigButton(16308, 6300, 37, 37, "/Options/SPRITE", 160, 40,
				"Expel Guests", 0, 5, 390);
		addConfigButton(16309, 6300, 37, 37, "/Options/SPRITE", 160, 40,
				"Leave House", 0, 5, 390);
		addText(16310, "On", tda, 1, 0xff9b00, true, true);
		addText(16311, "Off", tda, 1, 0xff9b00, true, true);
		addText(16312, "Expel Guests", tda, 1, 0xff9b00, true, true);
		addText(16313, "Leave House", tda, 1, 0xff9b00, true, true);
		tab.totalChildren(13);
		tab.child(0, 16301, 46, 6);
		tab.child(1, 16302, 42, 60);
		tab.child(2, 16303, 112, 60);
		tab.child(3, 16304, 165, 20);
		tab.child(4, 16305, 165, 20);
		tab.child(5, 16306, 100, 40);
		tab.child(6, 16307, 96, 230);
		tab.child(7, 16308, 16, 120);
		tab.child(8, 16309, 16, 170);
		tab.child(9, 16310, 61, 72);
		tab.child(10, 16311, 131, 72);
		tab.child(11, 16312, 100, 132);
		tab.child(12, 16313, 100, 182);

	}

	public static void SettingsTab(TextDrawingArea[] tda) {
		RSInterface Interface = addInterface(6299);
		setChildren(20, Interface);
		addText(37000, "Client Settings", 0xFF981F, false, true, 52, tda, 2);
		addSprite(37001, 1, "Switcher/halfBack");
		addText(37003, "Custom Themes", 0xFF981F, false, true, 52, tda, 2);
		addSprite(37004, 1, "Switcher/halfBack");
		
		addHoverButton(37005, "Switcher/MediumButton", 0, 54, 30,
				"Apply Theme", -1, 37006, 1);
		addHoveredButton(37006, "Switcher/MediumButton", 1, 54, 30, 37007);
		addHoverButton(37008, "Switcher/MediumButton", 0, 54, 30,
				"Delete Theme", -1, 37009, 1);
		addHoveredButton(37009, "Switcher/MediumButton", 1, 54, 30, 37010);
		addHoverButton(37011, "Switcher/MediumButton", 0, 54, 30,
				"Import Theme", 42012, 37012, 1);
		addHoveredButton(37012, "Switcher/MediumButton", 1, 54, 30, 37013);
		
		addHoverButton(37014, "Switcher/MediumButton", 0, 54, 30,
				"Browse Custom Themes", -1, 37015, 1);
		addHoveredButton(37015, "Switcher/MediumButton", 1, 54, 30, 37016);
		
		addText(37017, "Browse", tda, 0, 0xFFFFFF, false, true);
		addText(37018, "Apply", tda, 0, 0xFFFFFF, false, true);
		addText(37019, "Delete", tda, 0, 0xFFFFFF, false, true);
		addText(37020, "Import", tda, 0, 0xFFFFFF, false, true);
		
		addHoverButton(36997, "PrivateChat/Close", 0, 200, 30, "Back", -1, 36998, 1);
		addHoveredButton(36998, "PrivateChat/Close", 1, 200, 30, 36999);
		
		setBounds(37000, 10, 5, 0, Interface);
		setBounds(37001, 3, 24, 1, Interface);
		setBounds(37002, 5, 29, 2, Interface);
		setBounds(37003, 10, 126, 3, Interface);
		setBounds(37004, 3, 145, 4, Interface);
		
		setBounds(37005, 3, 235, 5, Interface);
		setBounds(37006, 3, 235, 6, Interface);
		setBounds(37008, 66, 235, 7, Interface);
		setBounds(37009, 66, 235, 8, Interface);
		setBounds(37011, 129, 235, 9, Interface);
		setBounds(37012, 129, 235, 10, Interface);
		setBounds(37014, 129, 118, 11, Interface);
		setBounds(37015, 129, 118, 12, Interface);
		
		setBounds(37017, 137, 121, 13, Interface);
		setBounds(37018, 14, 238, 14, Interface);
		setBounds(37019, 77, 238, 15, Interface);
		setBounds(37020, 141, 238, 16, Interface);
		setBounds(37021, 5, 150, 17, Interface);
		
		setBounds(36997, 170, 5, 18, Interface);
		setBounds(36998, 170, 5, 19, Interface);
		int oldScroll = 0;
		if(interfaceCache[37002] != null)
			oldScroll = interfaceCache[37002].scrollPosition;
		int settingsTotal = Configuration.clientSettings.length;
		Interface = addInterface(37002);
		Interface.height = 75;
		Interface.width = 165;
		Interface.scrollPosition = oldScroll;
		Interface.scrollMax = 17*settingsTotal;
		setChildren(settingsTotal, Interface);
		int Ypos = 4;
		int frameID = 0;
		int max = 37022+settingsTotal-1;
		for (int iD = 37022; iD <= max; iD++) {
			addHoverText(iD, Configuration.clientSettings[frameID], "Toggle", tda, 0, Configuration.clientSettingsOn[frameID] ? 0x00FF00 : 0xff0000, false,
					true, 150);
			setBounds(iD, 8, Ypos, frameID, Interface);
			frameID++;
			Ypos += 15;
			Ypos++;
		}
		
		int oldScroll2 = 0;
		if(interfaceCache[37021] != null)
			oldScroll2 = interfaceCache[37021].scrollPosition;
		int themeTotal = Configuration.customThemes.length;
		Interface = addInterface(37021);
		Interface.height = 75;
		Interface.width = 165;
		Interface.scrollPosition = oldScroll2;
		Interface.scrollMax = 17*themeTotal;
		setChildren(themeTotal, Interface);
		int Ypos2 = 4;
		int frameID2 = 0;
		for (int iD = max+1; iD <= max+themeTotal; iD++) {
			addHoverText(iD, Configuration.customThemes[frameID2], "Select Theme", tda, 0, frameID2 == Configuration.themeIndex ? 0x00FF00 : 0xff0000, false,
					true, 150);
			setBounds(iD, 8, Ypos2, frameID2, Interface);
			frameID2++;
			Ypos2 += 15;
			Ypos2++;
		}
	}

	public static void newTrade(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(3323);
		setChildren(19, Interface);
		addSprite(3324, 6, "Interfaces/TradeTab/TRADE");
		addHover(3442, 3, 0, 3325, 1, "Interfaces/Bank/BANK", 17, 17,
				"Close Window");
		addHovered(3325, 2, "Interfaces/Bank/BANK", 17, 17, 3326);
		addText(3417, "Trading With:", 0xFF981F, true, true, 52, TDA, 2);
		addText(3418, "Trader's Offer", 0xFF981F, false, true, 52, TDA, 1);
		addText(3419, "Your Offer", 0xFF981F, false, true, 52, TDA, 1);
		addText(3421, "Accept", 0x00C000, true, true, 52, TDA, 1);
		addText(3423, "Decline", 0xC00000, true, true, 52, TDA, 1);

		addText(3431, "Waiting For Other Player", 0xFFFFFF, true, true, 52,
				TDA, 1);
		addText(23504,
				"Wealth transfer: 2147,000,000 coins' worth to Zezimablud12",
				0xB9B855, true, true, -1, TDA, 0);
		addText(23505, "1 has\\n 28 free\\n inventory slots.", 0xFF981F, true,
				true, -1, TDA, 0);

		addText(23506,
				"Wealth transfer: 2147,000,000 coins' worth to Zezimablud12",
				0xB9B855, false, true, -1, TDA, 0);
		addText(23507, "Wealth transfer: 2147,000,000 coins' worth to me",
				0xB9B855, false, true, -1, TDA, 0);

		addHover(3420, 1, 0, 3327, 5, "Interfaces/TradeTab/TRADE", 65, 32,
				"Accept");
		addHovered(3327, 2, "Interfaces/TradeTab/TRADE", 65, 32, 3328);
		addHover(3422, 3, 0, 3329, 5, "Interfaces//TradeTab/TRADE", 65, 32,
				"Decline");
		addHovered(3329, 2, "Interfaces/TradeTab/TRADE", 65, 32, 3330);
		setBounds(3324, 0, 16, 0, Interface);
		setBounds(3442, 485, 24, 1, Interface);
		setBounds(3325, 485, 24, 2, Interface);
		setBounds(3417, 258, 25, 3, Interface);
		setBounds(3418, 355, 51, 4, Interface);
		setBounds(3419, 68, 51, 5, Interface);
		setBounds(3420, 223, 120, 6, Interface);
		setBounds(3327, 223, 120, 7, Interface);
		setBounds(3422, 223, 160, 8, Interface);
		setBounds(3329, 223, 160, 9, Interface);
		setBounds(3421, 256, 127, 10, Interface);
		setBounds(3423, 256, 167, 11, Interface);
		setBounds(3431, 256, 272, 12, Interface);
		setBounds(3415, 12, 64, 13, Interface);
		setBounds(3416, 321, 67, 14, Interface);

		setBounds(23505, 256, 67, 16, Interface);

		setBounds(23504, 255, 310, 15, Interface);
		setBounds(23506, 20, 310, 17, Interface);
		setBounds(23507, 380, 310, 18, Interface);

		Interface = addInterface(3443);
		setChildren(15, Interface);
		addSprite(3444, 3, "Interfaces/TradeTab/TRADE");
		addButton(3546, 2, "Interfaces/ShopTab/SHOP", 63, 24, "Accept", 1);
		addButton(3548, 2, "Interfaces/ShopTab/SHOP", 63, 24, "Decline", 3);
		addText(3547, "Accept", 0x00C000, true, true, 52, TDA, 1);
		addText(3549, "Decline", 0xC00000, true, true, 52, TDA, 1);
		addText(3450, "Trading With:", 0x00FFFF, true, true, 52, TDA, 2);
		addText(3451, "Yourself", 0x00FFFF, true, true, 52, TDA, 2);
		setBounds(3444, 12, 20, 0, Interface);
		setBounds(3442, 470, 32, 1, Interface);
		setBounds(3325, 470, 32, 2, Interface);
		setBounds(3535, 130, 28, 3, Interface);
		setBounds(3536, 105, 47, 4, Interface);
		setBounds(3546, 189, 295, 5, Interface);
		setBounds(3548, 258, 295, 6, Interface);
		setBounds(3547, 220, 299, 7, Interface);
		setBounds(3549, 288, 299, 8, Interface);
		setBounds(3557, 71, 87, 9, Interface);
		setBounds(3558, 315, 87, 10, Interface);
		setBounds(3533, 64, 70, 11, Interface);
		setBounds(3534, 297, 70, 12, Interface);
		setBounds(3450, 95, 289, 13, Interface);
		setBounds(3451, 95, 304, 14, Interface);
	}

	public static void reportAbuse1(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(5875);
		addSprite(20071, 1, "Abuse/PAGE");
		addHoverButton(20072, "Abuse/BUTTON", 5, 51, 18, "Next", -1, 20073, 1);
		addHoveredButton(20073, "Abuse/BUTTON", 6, 51, 18, 20074);
		addHoverButton(20008, "Abuse/EXIT", 1, 16, 16, "Exit", -1, 20048, 1);
		addHoveredButton(20048, "Abuse/EXIT", 2, 16, 16, 20049);
		addText(20075, "Next", tda, 0, 0xDEEBDC, false, true);
		tab.totalChildren(6);
		tab.child(0, 20071, 59, 109);
		tab.child(1, 20072, 375, 177);
		tab.child(2, 20073, 375, 177);
		tab.child(3, 20008, 433, 112);
		tab.child(4, 20048, 433, 112);
		tab.child(5, 20075, 388, 180);
	}

	public static void reportAbuse2(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(20070);
		addSprite(5985, 0, "Abuse/PAGE");
		addHoverButton(5976, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20010, 1);
		addHoveredButton(20010, "Abuse/BUTTON", 2, 153, 28, 20011);
		addText(20052, "Buying or selling an account", tda, 0, 0xDEEBDC, false,
				true);
		addHoverButton(5979, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20012, 1);
		addHoveredButton(20012, "Abuse/BUTTON", 2, 153, 28, 20013);
		addText(20053, "Encouraging rule breaking", tda, 0, 0xDEEBDC, false,
				true);
		addHoverButton(5975, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20014, 1);
		addHoveredButton(20014, "Abuse/BUTTON", 2, 153, 28, 20015);
		addText(20054, "Staff impersonation", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5977, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20016, 1);
		addHoveredButton(20016, "Abuse/BUTTON", 2, 153, 28, 20017);
		addText(20055, "Macroing or use of bots", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5972, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20018, 1);
		addHoveredButton(20018, "Abuse/BUTTON", 2, 153, 28, 20019);
		addText(20056, "Scamming", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5974, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20020, 1);
		addHoveredButton(20020, "Abuse/BUTTON", 2, 153, 28, 20021);
		addText(20057, "Exploiting a bug", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5971, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20022, 1);
		addHoveredButton(20022, "Abuse/BUTTON", 2, 153, 28, 20023);
		addText(20058, "Seriously offensive", tda, 0, 0xDEEBDC, false, true);
		addText(20081, "language", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5978, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20024, 1);
		addHoveredButton(20024, "Abuse/BUTTON", 2, 153, 28, 20025);
		addText(20059, "Solicitation", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(5980, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20026, 1);
		addHoveredButton(20026, "Abuse/BUTTON", 2, 153, 28, 20027);
		addText(20060, "Disruptive Behavior", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(20000, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20028, 1);
		addHoveredButton(20028, "Abuse/BUTTON", 2, 153, 28, 20029);
		addText(20061, "Offensive account name", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(25982, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20030, 1);
		addHoveredButton(20030, "Abuse/BUTTON", 2, 153, 28, 20031);
		addText(20062, "Real-life threats", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(20001, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20032, 1);
		addHoveredButton(20032, "Abuse/BUTTON", 2, 153, 28, 20033);
		addText(20063, "Asking or providing", tda, 0, 0xDEEBDC, false, true);
		addText(20082, "contact information", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(20002, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20034, 1);
		addHoveredButton(20034, "Abuse/BUTTON", 2, 153, 28, 20035);
		addText(20064, "Breaking real-world laws", tda, 0, 0xDEEBDC, false,
				true);
		addHoverButton(5981, "Abuse/BUTTON", 1, 153, 28, "Send-report", -1,
				20036, 1);
		addHoveredButton(20036, "Abuse/BUTTON", 2, 153, 28, 20037);
		addText(20065, "Advertising websites", tda, 0, 0xDEEBDC, false, true);
		addHoverButton(20003, "Abuse/QUESTION", 1, 25, 25, "View-advice", -1,
				20038, 1);
		addHoveredButton(20038, "Abuse/QUESTION", 2, 25, 25, 20039);
		addHoverButton(20004, "Abuse/QUESTION", 1, 25, 25, "View-advice", -1,
				20040, 1);
		addHoveredButton(20040, "Abuse/QUESTION", 2, 25, 25, 20041);
		addHoverButton(20005, "Abuse/QUESTION", 1, 25, 25, "View-advice", -1,
				20042, 1);
		addHoveredButton(20042, "Abuse/QUESTION", 2, 25, 25, 20043);
		addHoverButton(20006, "Abuse/BUTTON", 3, 105, 18, "Select-player", -1,
				20044, 1);
		addHoveredButton(20044, "Abuse/BUTTON", 4, 105, 18, 20045);
		addHoverButton(20007, "Abuse/BUTTON", 3, 105, 18, "Cancel-report", -1,
				20046, 1);
		addHoveredButton(20046, "Abuse/BUTTON", 4, 105, 18, 20047);
		addHoverButton(20008, "Abuse/EXIT", 1, 16, 16, "Exit", -1, 20048, 1);
		addHoveredButton(20048, "Abuse/EXIT", 2, 16, 16, 20049);
		addHoverButton(20009, "Abuse/HELP", 1, 16, 16, "Help", -1, 20050, 1);
		addHoveredButton(20050, "Abuse/HELP", 2, 16, 16, 20051);
		addText(20066, "Change player", tda, 0, 0xDEEBDC, false, true);
		addText(20067, "Cancel report", tda, 0, 0xDEEBDC, false, true);
		addText(20068,
				"Click on the most suitable option from the Rules of Zarpor.",
				tda, 0, 0xDEEBDC, false, true);
		addText(20069,
				"This will send a report to our Player Support team for investigation.",
				tda, 0, 0xDEEBDC, false, true);
		tab.totalChildren(63);
		tab.child(0, 5985, 11, 14);
		tab.child(1, 5976, 20, 134);
		tab.child(2, 5979, 20, 163);
		tab.child(3, 5975, 20, 192);
		tab.child(4, 5977, 20, 221);
		tab.child(5, 5972, 20, 250);
		tab.child(6, 5974, 20, 279);
		tab.child(7, 5971, 177, 134);
		tab.child(8, 5978, 177, 163);
		tab.child(9, 5980, 177, 192);
		tab.child(10, 20000, 177, 221);
		tab.child(11, 25982, 177, 250);
		tab.child(12, 20001, 337, 134);
		tab.child(13, 20002, 337, 163);
		tab.child(14, 5981, 337, 192);
		tab.child(15, 20003, 146, 106);
		tab.child(16, 20004, 304, 106);
		tab.child(17, 20005, 463, 106);
		tab.child(18, 20006, 382, 45);
		tab.child(19, 20007, 382, 69);
		tab.child(20, 20008, 475, 17);
		tab.child(21, 20009, 457, 17);
		tab.child(22, 20010, 20, 134);
		tab.child(23, 20012, 20, 163);
		tab.child(24, 20014, 20, 192);
		tab.child(25, 20016, 20, 221);
		tab.child(26, 20018, 20, 250);
		tab.child(27, 20020, 20, 279);
		tab.child(28, 20022, 177, 134);
		tab.child(29, 20024, 177, 163);
		tab.child(30, 20026, 177, 192);
		tab.child(31, 20028, 177, 221);
		tab.child(32, 20030, 177, 250);
		tab.child(33, 20032, 337, 134);
		tab.child(34, 20034, 337, 163);
		tab.child(35, 20036, 337, 192);
		tab.child(36, 20038, 146, 106);
		tab.child(37, 20040, 304, 106);
		tab.child(38, 20042, 463, 106);
		tab.child(39, 20044, 382, 45);
		tab.child(40, 20046, 382, 69);
		tab.child(41, 20048, 475, 17);
		tab.child(42, 20050, 457, 17);
		tab.child(43, 20052, 27, 142);
		tab.child(44, 20053, 32, 171);
		tab.child(45, 20054, 50, 200);
		tab.child(46, 20055, 36, 229);
		tab.child(47, 20056, 70, 258);
		tab.child(48, 20057, 50, 287);
		tab.child(49, 20058, 205, 137);
		tab.child(50, 20059, 225, 171);
		tab.child(51, 20060, 200, 200);
		tab.child(52, 20061, 194, 229);
		tab.child(53, 20062, 210, 258);
		tab.child(54, 20063, 365, 137);
		tab.child(55, 20064, 350, 171);
		tab.child(56, 20065, 360, 200);
		tab.child(57, 20081, 234, 147);
		tab.child(58, 20082, 365, 147);
		tab.child(59, 20066, 398, 49);
		tab.child(60, 20067, 400, 73);
		tab.child(61, 20068, 23, 42);
		tab.child(62, 20069, 23, 56);
		// add 20081 20082
	}

	public static void addPrayer(int i, int configId, int configFrame,
			int requiredValues, int prayerSpriteID, String PrayerName, int Hover) {
		RSInterface Interface = addTabInterface(i);
		Interface.id = i;
		Interface.parentID = 22500;
		Interface.type = 5;
		Interface.atActionType = 4;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.mOverInterToTrigger = -1;
		Interface.disabledSprite = imageLoader(0, "CurseTab/GLOW");
		Interface.enabledSprite = imageLoader(1, "CurseTab/GLOW");
		Interface.width = 34;
		Interface.height = 34;
		Interface.valueCompareType = new int[1];
		Interface.requiredValues = new int[1];
		Interface.valueCompareType[0] = 1;
		Interface.requiredValues[0] = configId;
		Interface.valueIndexArray = new int[1][3];
		Interface.valueIndexArray[0][0] = 5;
		Interface.valueIndexArray[0][1] = configFrame;
		Interface.valueIndexArray[0][2] = 0;
		Interface.tooltip = "Activate@or1@ " + PrayerName;
		Interface = addTabInterface(i + 1);
		Interface.id = i + 1;
		Interface.parentID = 22500;
		Interface.type = 5;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.disabledSprite = imageLoader(prayerSpriteID,
				"CurseTab/PRAYON");
		Interface.enabledSprite = imageLoader(prayerSpriteID,
				"CurseTab/PRAYOFF");
		Interface.width = 34;
		Interface.height = 34;
		Interface.valueCompareType = new int[1];
		Interface.requiredValues = new int[1];
		Interface.valueCompareType[0] = 2;
		Interface.requiredValues[0] = requiredValues + 1;
		Interface.valueIndexArray = new int[1][3];
		Interface.valueIndexArray[0][0] = 2;
		Interface.valueIndexArray[0][1] = 5;
		Interface.valueIndexArray[0][2] = 0;
	}

	public static void addSpriteWithHover(int id, int spriteId,
			String spriteName, int hover) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 1; // hver
		tab.disabledSprite = imageLoader(spriteId, spriteName);
		tab.enabledSprite = imageLoader(spriteId, spriteName);
		tab.width = 190;
		tab.height = 47;
	}

	public static void Curses(TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addTabInterface(22500);
		int i = 0;
		setChildren(70, rsinterface);
		addSpriteWithHover(688, 11, "CurseTab/SPRITE", 19021);
		addButton(689, 12, "CurseTab/SPRITE", "", 190, 17);
		addText(24765, "Hide stat adjustments.", 0xFFCC00, false, true, -1,
				atextdrawingarea, 0, 0xFFFFFF);
		addText(690, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(691, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(692, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(693, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(694, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(687, "99/99", 0xFF981F, false, false, -1, atextdrawingarea, 1);

		addPrayer(22503, 0, 83, 49, 7, "Protect Item", 22543);
		setBounds(22503, 2, 5, i, rsinterface);
		i++;
		setBounds(22504, 8, 8, i, rsinterface);
		i++;

		addPrayer(22505, 0, 84, 49, 4, "Sap Warrior", 22544);
		setBounds(22505, 40, 5, i, rsinterface);
		i++;
		setBounds(22506, 47, 12, i, rsinterface);
		i++;

		addPrayer(22507, 0, 85, 51, 5, "Sap Ranger", 22546);
		setBounds(22507, 76, 5, i, rsinterface);
		i++;
		setBounds(22508, 82, 11, i, rsinterface);
		i++;

		addPrayer(22509, 0, 101, 53, 3, "Sap Mage", 22548);
		setBounds(22509, 113, 5, i, rsinterface);
		i++;
		setBounds(22510, 116, 8, i, rsinterface);
		i++;

		addPrayer(22511, 0, 102, 55, 2, "Sap Spirit", 22550);
		setBounds(22511, 150, 5, i, rsinterface);
		i++;
		setBounds(22512, 155, 10, i, rsinterface);
		i++;

		addPrayer(22513, 0, 86, 58, 18, "Berserker", 22552);
		setBounds(22513, 2, 45, i, rsinterface);
		i++;
		setBounds(22514, 9, 48, i, rsinterface);
		i++;

		addPrayer(22515, 0, 87, 61, 15, "Deflect Summoning", 22554);
		setBounds(22515, 39, 45, i, rsinterface);
		i++;
		setBounds(22516, 42, 47, i, rsinterface);
		i++;

		addPrayer(22517, 0, 88, 64, 17, "Deflect Magic", 22556);
		setBounds(22517, 76, 45, i, rsinterface);
		i++;
		setBounds(22518, 79, 48, i, rsinterface);
		i++;

		addPrayer(22519, 0, 89, 67, 16, "Deflect Missiles", 22558);
		setBounds(22519, 113, 45, i, rsinterface);
		i++;
		setBounds(22520, 116, 48, i, rsinterface);
		i++;

		addPrayer(22521, 0, 90, 70, 6, "Deflect Melee", 22560);
		setBounds(22521, 151, 45, i, rsinterface);
		i++;
		setBounds(22522, 154, 48, i, rsinterface);
		i++;

		addPrayer(22523, 0, 91, 73, 9, "Leech Attack", 22562);
		setBounds(22523, 2, 82, i, rsinterface);
		i++;
		setBounds(22524, 6, 86, i, rsinterface);
		i++;

		addPrayer(22525, 0, 103, 75, 10, "Leech Ranged", 22564);
		setBounds(22525, 40, 82, i, rsinterface);
		i++;
		setBounds(22526, 42, 86, i, rsinterface);
		i++;

		addPrayer(22527, 0, 104, 77, 11, "Leech Magic", 22566);
		setBounds(22527, 77, 82, i, rsinterface);
		i++;
		setBounds(22528, 79, 86, i, rsinterface);
		i++;

		addPrayer(22529, 0, 92, 79, 12, "Leech Defence", 22568);
		setBounds(22529, 114, 83, i, rsinterface);
		i++;
		setBounds(22530, 119, 87, i, rsinterface);
		i++;

		addPrayer(22531, 0, 93, 81, 13, "Leech Strength", 22570);
		setBounds(22531, 153, 83, i, rsinterface);
		i++;
		setBounds(22532, 156, 86, i, rsinterface);
		i++;

		addPrayer(22533, 0, 94, 83, 14, "Leech Energy", 22572);
		setBounds(22533, 2, 120, i, rsinterface);
		i++;
		setBounds(22534, 7, 125, i, rsinterface);
		i++;

		addPrayer(22535, 0, 95, 85, 19, "Leech Special Attack", 22574);
		setBounds(22535, 40, 120, i, rsinterface);
		i++;
		setBounds(22536, 45, 124, i, rsinterface);
		i++;

		addPrayer(22537, 0, 96, 88, 1, "Wrath", 22576);
		setBounds(22537, 78, 120, i, rsinterface);
		i++;
		setBounds(22538, 86, 124, i, rsinterface);
		i++;

		addPrayer(22539, 0, 97, 91, 8, "Soul Split", 22578);
		setBounds(22539, 114, 120, i, rsinterface);
		i++;
		setBounds(22540, 120, 125, i, rsinterface);
		i++;

		addPrayer(22541, 0, 105, 94, 20, "Turmoil", 22580);
		setBounds(22541, 151, 120, i, rsinterface);
		i++;
		setBounds(22542, 153, 127, i, rsinterface);
		i++;

		addSprite(22502, 0, "Interfaces/Curses/ICON");
		setBounds(687, 85, 241, i, rsinterface);
		i++;
		setBounds(22502, 65, 241, i, rsinterface);
		i++;
		addTooltip(22550,
				"Level 56\nSap Spirit\nDrains enenmy special attack\nenergy",
				100, 175);
		addTooltip(22543,
				"Level 50\nProtect Item\nKeep 1 extra item if you die", 100,
				150);
		addTooltip(
				22544,
				"Level 50\nSap Warrior\nDrains 10% of enemy Attack,\nStrength and Defence,\nincre"
						+ "asing to 20% over time", 100, 150);
		addTooltip(
				22546,
				"Level 52\nSap Ranger\nDrains 10% of enemy Ranged\nand Defence, increasing to 20%"
						+ "\nover time", 100, 175);
		addTooltip(
				22548,
				"Level 54\nSap Mage\nDrains 10% of enemy Magic\nand Defence, increasing to 20%\no"
						+ "ver time", 100, 175);
		addTooltip(22550,
				"Level 56\nSap Spirit\nDrains enenmy special attack\nenergy",
				100, 175);
		addTooltip(22552, "Level 59\nBerserker\nBoosted stats last 15% longer",
				100, 175);
		addTooltip(
				22554,
				"Level 62\nDeflect Summoning\nReduces damage dealt from\nSummoning scrolls, preve"
						+ "nts the\nuse of a familiar's special\nattack, and can deflect some of\ndamage ba"
						+ "ck to the attacker", 125, 175);
		addTooltip(
				22556,
				"Level 65\nDeflect Magic\nProtects against magical attacks\nand can deflect some "
						+ "of the\ndamage back to the attacker", 100, 175);
		addTooltip(
				22558,
				"Level 68\nDeflect Missiles\nProtects against ranged attacks\nand can deflect som"
						+ "e of the\ndamage back to the attacker", 100, 175);
		addTooltip(
				22560,
				"Level 71\nDeflect Melee\nProtects against melee attacks\nand can deflect some of"
						+ " the\ndamage back to the attacker", 100, 175);
		addTooltip(
				22562,
				"Level 74\nLeech Attack\nBoosts Attack by 5%, increasing\nto 10% over time, while"
						+ " draining\nenemy Attack by 10%,\nincreasing to 25% over time",
				100, 175);
		addTooltip(
				22564,
				"Level 76\nLeech Ranged\nBoosts Ranged by 5%, increasing\nto 10% over time,\nwhil"
						+ "e draining enemy Ranged by\n10%, increasing to 25% over\ntime",
				113, 175);
		addTooltip(
				22566,
				"Level 78\nLeech Magic\nBoosts Magic by 5%, increasing\nto 10% over time, while d"
						+ "raining\nenemy Magic by 10%, increasing\nto 25% over time",
				100, 175);
		addTooltip(
				22568,
				"Level 80\nLeech Defence\nBoosts Defence by 5%, increasing\nto 10% over time,\nwh"
						+ "ile draining enemy Defence by\n10%, increasing to 25% over\ntime",
				113, 180);
		addTooltip(
				22570,
				"Level 82\nLeech Strength\nBoosts Strength by 5%, increasing\nto 10% over time,\n"
						+ "while draining enemy Strength by\n10%, increasing to 25% over\ntime",
				113, 180);
		addTooltip(
				22572,
				"Level 84\nLeech Energy\nDrains enemy run energy, while\nincreasing your own",
				113, 180);
		addTooltip(
				22574,
				"Level 86\nLeech Special Attack\nDrains enemy special attack\nenergy, while incre"
						+ "asing your\nown", 113, 180);
		addTooltip(
				22576,
				"Level 89\nWrath\nInflicts damage to nearby\ntargets if you die",
				113, 180);
		addTooltip(
				22578,
				"Level 92\nSoul Split\n1/4 of damage dealt is\nalso removed from\nopponent's Pray"
						+ "er and added to\nyour Hitpoints", 113, 180);
		addTooltip(
				22580,
				"Level 95\nTurmoil\nIncreases Attack and Defence\nby 15%, plus 15% of enemy's\nle"
						+ "vel, and Strength by 23% plus\n10% of enemy's level",
				113, 180);
		setBounds(22543, 10, 40, i, rsinterface);
		i++;
		setBounds(22544, 20, 40, i, rsinterface);
		i++;
		setBounds(22546, 20, 40, i, rsinterface);
		i++;
		setBounds(22548, 20, 40, i, rsinterface);
		i++;
		setBounds(22550, 20, 40, i, rsinterface);
		i++;
		setBounds(22552, 10, 80, i, rsinterface);
		i++;
		setBounds(22554, 10, 80, i, rsinterface);
		i++;
		setBounds(22556, 10, 80, i, rsinterface);
		i++;
		setBounds(22558, 10, 80, i, rsinterface);
		i++;
		setBounds(22560, 10, 80, i, rsinterface);
		i++;
		setBounds(22562, 10, 120, i, rsinterface);
		i++;
		setBounds(22564, 10, 120, i, rsinterface);
		i++;
		setBounds(22566, 10, 120, i, rsinterface);
		i++;
		setBounds(22568, 5, 120, i, rsinterface);
		i++;
		setBounds(22570, 5, 120, i, rsinterface);
		i++;
		setBounds(22572, 10, 160, i, rsinterface);
		i++;
		setBounds(22574, 10, 160, i, rsinterface);
		i++;
		setBounds(22576, 10, 160, i, rsinterface);
		i++;
		setBounds(22578, 10, 160, i, rsinterface);
		i++;
		setBounds(22580, 10, 160, i, rsinterface);
		i++;
		setBounds(689, 0, 217, i, rsinterface);
		i++;
		setBounds(688, 0, 170, i, rsinterface);
		i++;
		setBounds(690, 89, 200, i, rsinterface);
		i++;
		setBounds(691, 10, 200, i, rsinterface);
		i++;
		setBounds(692, 50, 200, i, rsinterface);
		i++;
		setBounds(693, 130, 200, i, rsinterface);
		i++;
		setBounds(694, 170, 200, i, rsinterface);
		i++;

		setBounds(24765, 47, 218, i, rsinterface);
		i++;
	}

	private static String[] scrollNames = { "Howl", "Dreadfowl Strike",
			"Egg Spawn", "Slime Spray", "Stony Shell", "Pester",
			"Electric Lash", "Venom Shot", "Fireball Assault", "Cheese Feast",
			"Sandstorm", "Generate Compost", "Explode", "Vampire Touch",
			"Insane Ferocity", "Multichop", "Call of Arms", "Call of Arms",
			"Call of Arms", "Call of Arms", "Bronze Bull Rush", "Unburden",
			"Herbcall", "Evil Flames", "Petrifying gaze", "Petrifying gaze",
			"Petrifying gaze", "Petrifying gaze", "Petrifying gaze",
			"Petrifying gaze", "Petrifying gaze", "Iron Bull Rush",
			"Immense Heat", "Thieving Fingers", "Blood Drain", "Tireless Run",
			"Abyssal Drain", "Dissolve", "Steel Bull Rush", "Fish Rain",
			"Goad", "Ambush", "Rending", "Doomsphere Device", "Dust Cloud",
			"Abyssal Stealth", "Ophidian Incubation", "Poisonous Blast",
			"Mithril Bull Rush", "Toad Bark", "Testudo", "Swallow Whole",
			"Fruitfall", "Famine", "Arctic Blast", "Rise from the Ashes",
			"Volcanic Strength", "Crushing Claw", "Mantis Strike",
			"Adamant Bull Rush", "Inferno", "Deadly Claw", "Acorn Missile",
			"Titan's Consitution", "Titan's Consitution", "Titan's onsitution",
			"Regrowth", "Spike Shot", "Ebon Thunder", "Swamp Plague",
			"Rune Bull Rush", "Healing Aura", "Boil", "Magic Focus",
			"Essence Shipment", "Iron Within", "Winter Storage",
			"Steel of Legends", };
	private static String[] pouchNames = { "Spirit Wolf", "Dreadfowl",
			"Spirit Spider", "Thorny Snail", "Granite Crab", "Spirit Mosquito",
			"Desert Wyrm", "Spirit Scorpian", "Spirit Tz-Kih", "Albino rat",
			"Spirit Kalphite", "Compost mound", "Giant Chinchompa",
			"Vampire Bat", "Honey badger", "Beaver", "Void Ravager",
			"Void Spinner", "Void Torcher", "Void Shifter", "Bronze minotaur",
			"Bull ant", "Macaw", "Evil Turnip", "Spirit Cockatrice",
			"Spirit Guthatrice", "Spirit Saratrice", "Spirit Zamatrice",
			"Spirit Pengatrice", "Spirit Coraxatrice", "Spirit Vulatrice",
			"Iron minotaur", "Pyrelord", "Magpie", "Bloated Leech",
			"Spirit terrorbird", "Abyssal Parasite", "Spirit Jelly",
			"Steel Minotaur", "Ibis", "Spirit kyatt", "Spirit laurpia",
			"Spirit graahk", "Karamthulhu overlord", "Smoke Devil",
			"Abyssal Lurker", "Spirit cobra", "Stranger Plant",
			"Mithril minotaur", "Barker Toad", "War tortoise", "Bunyip",
			"Fruit bat", "Ravenous Locust", "Artic Bear", "Pheonix",
			"Obsidian Golem", "Granite Lobster", "Praying mantis",
			"Forge regent", "Adamant minotaur", "Talon Beast", "Giant ent",
			"Fire titan", "Moss titan", "Ice titan", "Hydra",
			"Spirit daggannoth", "Lava titan", "Swamp titan", "Rune minotaur",
			"Unicorn Stallion", "Geyser titan", "Wolpertinger",
			"Abyssal Titan", "Iron titan", "Pack Yack", "Steel titan" };

	public static void scrolls(TextDrawingArea[] TDA) {
		RSInterface rsinterface = addInterface(38700);
		addButton(38701, 0, "Interfaces/Scrolls/SPRITE", "Pouches", 27640, 1,
				116, 20);
		addButton(38702, 1, "Interfaces/Scrolls/SPRITE", "Scrolls", 27640, 1,
				116, 20);

		RSInterface scroll = addTabInterface(38710);
		scroll.width = 430;
		scroll.height = 230;
		scroll.scrollMax = 550;
		// scroll.newScroller = true;
		int lastId = 38710;
		int lastImage = 5;
		for (int i = 0; i < 78; i++) {
			addHover(lastId + 1, 1, 0, lastId + 2, lastImage + 1,
					"Interfaces/Scrolls/Sprite", 46, 50, "Select "
							+ scrollNames[i] + " scroll");
			addHovered(lastId + 2, lastImage + 2, "Interfaces/Scrolls/Sprite",
					46, 50, lastId + 3);
			lastId += 3;
			lastImage += 2;
		}

		rsinterface.children = new int[7];
		rsinterface.childX = new int[7];
		rsinterface.childY = new int[7];

		rsinterface.children[0] = 39701;
		rsinterface.childX[0] = 14;
		rsinterface.childY[0] = 17;
		rsinterface.children[1] = 39702;
		rsinterface.childX[1] = 475;
		rsinterface.childY[1] = 30;
		rsinterface.children[2] = 39703;
		rsinterface.childX[2] = 475;
		rsinterface.childY[2] = 30;
		rsinterface.children[3] = 38701;
		rsinterface.childX[3] = 25;
		rsinterface.childY[3] = 30;
		rsinterface.children[4] = 38702;
		rsinterface.childX[4] = 128;
		rsinterface.childY[4] = 30;
		rsinterface.children[5] = 39707;
		rsinterface.childX[5] = 268;
		rsinterface.childY[5] = 30;
		rsinterface.children[6] = 38710;
		rsinterface.childX[6] = 35;
		rsinterface.childY[6] = 65;

		scroll.children = new int[156];
		scroll.childX = new int[156];
		scroll.childY = new int[156];

		int lastNumber = -1;
		int lastId2 = 38710;
		int lastX = -52;
		int lastY = 0;
		for (int i = 0; i < 78; i++) {
			scroll.children[lastNumber += 1] = lastId2 += 1;
			scroll.childX[lastNumber] = lastX += 52;
			scroll.childY[lastNumber] = lastY;
			scroll.children[lastNumber += 1] = lastId2 += 1;
			scroll.childX[lastNumber] = lastX;
			scroll.childY[lastNumber] = lastY;
			lastId2 += 1;
			if (lastX == 364) {
				lastX = -52;
				lastY += 55;
			}
		}
	}

	public static void pouches(TextDrawingArea[] TDA) {
		RSInterface rsinterface = addInterface(39700);
		addSprite(39701, 0, "Interfaces/Pouches/SPRITE");
		addHover(39702, 3, 0, 39703, 1, "Interfaces/Pouches/SPRITE", 17, 17,
				"Close Window");
		addHovered(39703, 2, "Interfaces/Pouches/SPRITE", 17, 17, 39704);
		addButton(39705, 3, "Interfaces/Pouches/SPRITE", "Pouches", 27640, 1,
				116, 20);
		addButton(39706, 4, "Interfaces/Pouches/SPRITE", "Scrolls", 27640, 1,
				116, 20);
		addText(39707, "Summoning Pouch Creation", TDA, 2, 0xff981f, false,
				true);

		RSInterface scroll = addTabInterface(39710);
		scroll.width = 430;
		scroll.height = 230;
		scroll.scrollMax = 550;
		// scroll.newScroller = true;
		int lastId = 39710;
		int lastImage = 5;
		for (int i = 0; i < 78; i++) {
			addHover(lastId + 1, 1, 0, lastId + 2, lastImage + 1,
					"Interfaces/Pouches/Sprite", 46, 50, "Infuse "
							+ pouchNames[i] + " pouch");
			addHovered(lastId + 2, lastImage + 2, "Interfaces/Pouches/Sprite",
					46, 50, lastId + 3);
			lastId += 3;
			lastImage += 2;
		}

		rsinterface.children = new int[7];
		rsinterface.childX = new int[7];
		rsinterface.childY = new int[7];

		rsinterface.children[0] = 39701;
		rsinterface.childX[0] = 14;
		rsinterface.childY[0] = 17;
		rsinterface.children[1] = 39702;
		rsinterface.childX[1] = 475;
		rsinterface.childY[1] = 30;
		rsinterface.children[2] = 39703;
		rsinterface.childX[2] = 475;
		rsinterface.childY[2] = 30;
		rsinterface.children[3] = 39705;
		rsinterface.childX[3] = 25;
		rsinterface.childY[3] = 30;
		rsinterface.children[4] = 39706;
		rsinterface.childX[4] = 128;
		rsinterface.childY[4] = 30;
		rsinterface.children[5] = 39707;
		rsinterface.childX[5] = 268;
		rsinterface.childY[5] = 30;
		rsinterface.children[6] = 39710;
		rsinterface.childX[6] = 35;
		rsinterface.childY[6] = 65;

		scroll.children = new int[156];
		scroll.childX = new int[156];
		scroll.childY = new int[156];

		int lastNumber = -1;
		int lastId2 = 39710;
		int lastX = -52;
		int lastY = 0;
		for (int i = 0; i < 78; i++) {
			scroll.children[lastNumber += 1] = lastId2 += 1;
			scroll.childX[lastNumber] = lastX += 52;
			scroll.childY[lastNumber] = lastY;
			scroll.children[lastNumber += 1] = lastId2 += 1;
			scroll.childX[lastNumber] = lastX;
			scroll.childY[lastNumber] = lastY;
			lastId2 += 1;
			if (lastX == 364) {
				lastX = -52;
				lastY += 55;
			}
		}
	}

	public static void addBobStorage(int index) {
		RSInterface rsi = interfaceCache[index] = new RSInterface();
		rsi.actions = new String[5];
		rsi.spritesX = new int[20];
		rsi.invStackSizes = new int[30];
		rsi.inv = new int[30];
		rsi.spritesY = new int[20];

		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];

		rsi.actions[0] = "Take 1";
		rsi.actions[1] = "Take 5";
		rsi.actions[2] = "Take 10";
		rsi.actions[3] = "Take All";
		rsi.centerText = false;
		rsi.filled = false;
		rsi.dragDeletes = false;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		// rsi.aBoolean251 = false;
		rsi.aBoolean259 = true;
		// rsi.interfaceShown = false;
		rsi.textShadow = false;
		// rsi.hoverType = -1;
		rsi.invSpritePadX = 24;
		rsi.invSpritePadY = 24;
		rsi.height = 5;
		rsi.width = 6;
		rsi.parentID = 2702;
		rsi.id = 2700;
		rsi.type = 2;
	}

	public static void classSelect2(TextDrawingArea[] TDA) {
		RSInterface mon = addInterface(34100);
		addSprite(34101, 0, "Interfaces/Class/SPRITE");
		addChar(34102);
		addText(34103, "Select a Class", TDA, 2, 0xff9933, true, true);
		addText(34104, "Warrior", TDA, 2, 0xff9933, true, true);
		addText(34105, "Starting Items", TDA, 2, 0xff9933, true, true);
		addText(34106, "Starting Stats", TDA, 2, 0xff9933, true, true);
		addText(34107, "Description", TDA, 2, 0xff9933, true, true);
		// Items
		addHover(34108, 1, 0, 34109, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34109, 3, "Interfaces/Class/SPRITE", 16, 16, 34124);// left
		addHover(34110, 1, 0, 34111, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34111, 4, "Interfaces/Class/SPRITE", 16, 16, 34125);// right
		addHover(34112, 1, 0, 34113, 5, "Interfaces/Class/SPRITE", 82, 47,
				"Select");
		addHovered(34113, 6, "Interfaces/Class/SPRITE", 80, 47, 34126);// accept
		// Stats
		addText(34114, "1", TDA, 1, 0xff9933, true, true);
		addText(34115, "1", TDA, 1, 0xff9933, true, true);
		addText(34116, "1", TDA, 1, 0xff9933, true, true);
		addText(34117, "1", TDA, 1, 0xff9933, true, true);
		addText(34118, "1", TDA, 1, 0xff9933, true, true);
		addText(34119, "1", TDA, 1, 0xff9933, true, true);
		// Description
		addText(34120, "The warrior prefers close combat warfare.", TDA, 0,
				0xff9933, false, true);
		addText(34121, "With a stronger physical build and overall", TDA, 0,
				0xff9933, false, true);
		addText(34122, "strength, the warrior is able to dominate", TDA, 0,
				0xff9933, false, true);
		addText(34123, "in melee combat.", TDA, 0, 0xff9933, false, true);
		mon.totalChildren(23);
		int c = 0;
		mon.child(c, 34101, 5, 9);
		c++;
		mon.child(c, 34102, 27, 180);
		c++;
		mon.child(c, 34103, 255, 13);
		c++;
		mon.child(c, 34104, 94, 36);
		c++;
		mon.child(c, 34105, 337, 39);
		c++;
		mon.child(c, 34106, 337, 127);
		c++;
		mon.child(c, 34107, 288, 226);
		c++;
		// Arrows
		mon.child(c, 34108, 69, 281);
		c++;
		mon.child(c, 34109, 69, 281);
		c++;
		mon.child(c, 34110, 103, 281);
		c++;
		mon.child(c, 34111, 103, 281);
		c++;
		// Select Button
		mon.child(c, 34112, 405, 254);
		c++;
		mon.child(c, 34113, 405, 254);
		c++;
		// Stats
		mon.child(c, 34114, 247, 161);
		c++;
		mon.child(c, 34115, 348, 161);
		c++;
		mon.child(c, 34116, 449, 161);
		c++;
		mon.child(c, 34117, 247, 192);
		c++;
		mon.child(c, 34118, 348, 192);
		c++;
		mon.child(c, 34119, 449, 192);
		c++;
		// Description
		mon.child(c, 34120, 187, 253);
		c++;
		mon.child(c, 34121, 187, 266);
		c++;
		mon.child(c, 34122, 187, 279);
		c++;
		mon.child(c, 34123, 187, 292);
		c++;

	}

	public static void classSelect3(TextDrawingArea[] TDA) {
		RSInterface mon = addInterface(34200);
		addSprite(34201, 1, "Interfaces/Class/SPRITE");
		addChar(34202);
		addText(34203, "Select a Class", TDA, 2, 0xff9933, true, true);
		addText(34204, "Ranger", TDA, 2, 0xff9933, true, true);
		addText(34205, "Starting Items", TDA, 2, 0xff9933, true, true);
		addText(34206, "Starting Stats", TDA, 2, 0xff9933, true, true);
		addText(34207, "Description", TDA, 2, 0xff9933, true, true);
		// Items
		addHover(34208, 1, 0, 34209, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34209, 3, "Interfaces/Class/SPRITE", 16, 16, 34224);// left
		addHover(34210, 1, 0, 34211, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34211, 4, "Interfaces/Class/SPRITE", 16, 16, 34225);// right
		addHover(34212, 1, 0, 34213, 5, "Interfaces/Class/SPRITE", 82, 47,
				"Select");
		addHovered(34213, 6, "Interfaces/Class/SPRITE", 80, 47, 34226);// accept
		// Stats
		addText(34214, "1", TDA, 1, 0xff9933, true, true);
		addText(34215, "1", TDA, 1, 0xff9933, true, true);
		addText(34216, "1", TDA, 1, 0xff9933, true, true);
		addText(34217, "1", TDA, 1, 0xff9933, true, true);
		addText(34218, "1", TDA, 1, 0xff9933, true, true);
		addText(34219, "1", TDA, 1, 0xff9933, true, true);
		// Description
		addText(34220, "The ranger prefers longrange warfare.", TDA, 0,
				0xff9933, false, true);
		addText(34221, "Thanks to incredible eyesight and", TDA, 0, 0xff9933,
				false, true);
		addText(34222, "steadiness, the ranger is able to make", TDA, 0,
				0xff9933, false, true);
		addText(34223, "even the hardest of shots.", TDA, 0, 0xff9933, false,
				true);
		mon.totalChildren(23);
		int c = 0;
		mon.child(c, 34201, 5, 9);
		c++;
		mon.child(c, 34202, 27, 180);
		c++;
		mon.child(c, 34203, 255, 13);
		c++;
		mon.child(c, 34204, 94, 36);
		c++;
		mon.child(c, 34205, 337, 39);
		c++;
		mon.child(c, 34206, 337, 127);
		c++;
		mon.child(c, 34207, 288, 226);
		c++;
		// Arrows
		mon.child(c, 34208, 69, 281);
		c++;
		mon.child(c, 34209, 69, 281);
		c++;
		mon.child(c, 34210, 103, 281);
		c++;
		mon.child(c, 34211, 103, 281);
		c++;
		// Select Button
		mon.child(c, 34212, 405, 254);
		c++;
		mon.child(c, 34213, 405, 254);
		c++;
		// Stats
		mon.child(c, 34214, 247, 161);
		c++;
		mon.child(c, 34215, 348, 161);
		c++;
		mon.child(c, 34216, 449, 161);
		c++;
		mon.child(c, 34217, 247, 192);
		c++;
		mon.child(c, 34218, 348, 192);
		c++;
		mon.child(c, 34219, 449, 192);
		c++;
		// Description
		mon.child(c, 34220, 187, 253);
		c++;
		mon.child(c, 34221, 187, 266);
		c++;
		mon.child(c, 34222, 187, 279);
		c++;
		mon.child(c, 34223, 187, 292);
		c++;
	}

	public static void classSelect4(TextDrawingArea[] TDA) {
		RSInterface mon = addInterface(34300);
		addSprite(34301, 2, "Interfaces/Class/SPRITE");
		addChar(34302);
		addText(34303, "Select a Class", TDA, 2, 0xff9933, true, true);
		addText(34304, "Mage", TDA, 2, 0xff9933, true, true);
		addText(34305, "Starting Items", TDA, 2, 0xff9933, true, true);
		addText(34306, "Starting Stats", TDA, 2, 0xff9933, true, true);
		addText(34307, "Description", TDA, 2, 0xff9933, true, true);
		// Items
		addHover(34308, 1, 0, 34309, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34309, 3, "Interfaces/Class/SPRITE", 16, 16, 34324);// left
		addHover(34310, 1, 0, 34311, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(34311, 4, "Interfaces/Class/SPRITE", 16, 16, 34325);// right
		addHover(34312, 1, 0, 34313, 5, "Interfaces/Class/SPRITE", 82, 47,
				"Select");
		addHovered(34313, 6, "Interfaces/Class/SPRITE", 80, 47, 34326);// accept
		// Stats
		addText(34314, "1", TDA, 1, 0xff9933, true, true);
		addText(34315, "1", TDA, 1, 0xff9933, true, true);
		addText(34316, "1", TDA, 1, 0xff9933, true, true);
		addText(34317, "1", TDA, 1, 0xff9933, true, true);
		addText(34318, "1", TDA, 1, 0xff9933, true, true);
		addText(34319, "1", TDA, 1, 0xff9933, true, true);
		// Description
		addText(34320, "The mage prefers longrange warfare.", TDA, 0, 0xff9933,
				false, true);
		addText(34321, "The energy flowing through the mage", TDA, 0, 0xff9933,
				false, true);
		addText(34322, "allows for a variety of spells both", TDA, 0, 0xff9933,
				false, true);
		addText(34323, "useful and deadly.", TDA, 0, 0xff9933, false, true);
		mon.totalChildren(23);
		int c = 0;
		mon.child(c, 34301, 5, 9);
		c++;
		mon.child(c, 34302, 27, 180);
		c++;
		mon.child(c, 34303, 255, 13);
		c++;
		mon.child(c, 34304, 94, 36);
		c++;
		mon.child(c, 34305, 337, 39);
		c++;
		mon.child(c, 34306, 337, 127);
		c++;
		mon.child(c, 34307, 288, 226);
		c++;
		// Arrows
		mon.child(c, 34308, 69, 281);
		c++;
		mon.child(c, 34309, 69, 281);
		c++;
		mon.child(c, 34310, 103, 281);
		c++;
		mon.child(c, 34311, 103, 281);
		c++;
		// Select Button
		mon.child(c, 34312, 405, 254);
		c++;
		mon.child(c, 34313, 405, 254);
		c++;
		// Stats
		mon.child(c, 34314, 247, 161);
		c++;
		mon.child(c, 34315, 348, 161);
		c++;
		mon.child(c, 34316, 449, 161);
		c++;
		mon.child(c, 34317, 247, 192);
		c++;
		mon.child(c, 34318, 348, 192);
		c++;
		mon.child(c, 34319, 449, 192);
		c++;
		// Description
		mon.child(c, 34320, 187, 253);
		c++;
		mon.child(c, 34321, 187, 266);
		c++;
		mon.child(c, 34322, 187, 279);
		c++;
		mon.child(c, 34323, 187, 292);
		c++;
	}

	public static void classSelect5(TextDrawingArea[] TDA) {
		RSInterface mon = addInterface(35300);
		addSprite(35301, 8, "Interfaces/Class/SPRITE");
		addChar(35302);
		addText(35303, "Select a Class", TDA, 2, 0xff9933, true, true);
		addText(35304, "Adventurer", TDA, 2, 0xff9933, true, true);
		addText(35305, "Starting Items", TDA, 2, 0xff9933, true, true);
		addText(35306, "Starting Stats", TDA, 2, 0xff9933, true, true);
		addText(35307, "Description", TDA, 2, 0xff9933, true, true);
		// Items
		addHover(35308, 1, 0, 35309, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(35309, 3, "Interfaces/Class/SPRITE", 16, 16, 35324);// left
		addHover(35310, 1, 0, 35311, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(35311, 4, "Interfaces/Class/SPRITE", 16, 16, 35325);// right
		addHover(35312, 1, 0, 35313, 5, "Interfaces/Class/SPRITE", 82, 47,
				"Select");
		addHovered(35313, 6, "Interfaces/Class/SPRITE", 80, 47, 35326);// accept
		// Stats
		addText(35314, "1", TDA, 1, 0xff9933, true, true);
		addText(35315, "1", TDA, 1, 0xff9933, true, true);
		addText(35316, "1", TDA, 1, 0xff9933, true, true);
		addText(35317, "1", TDA, 1, 0xff9933, true, true);
		addText(35318, "1", TDA, 1, 0xff9933, true, true);
		addText(35319, "1", TDA, 1, 0xff9933, true, true);
		// Description
		addText(35320, "The adventurer is well rounded.", TDA, 0, 0xff9933,
				false, true);
		addText(35321, "He likes to explore, fight, and", TDA, 0, 0xff9933,
				false, true);
		addText(35322, "paticipate in minigames and skilling.", TDA, 0,
				0xff9933, false, true);
		addText(35323, "He is best described as a 'main'", TDA, 0, 0xff9933,
				false, true);
		mon.totalChildren(23);
		int c = 0;
		mon.child(c, 35301, 5, 9);
		c++;
		mon.child(c, 35302, 27, 180);
		c++;
		mon.child(c, 35303, 255, 13);
		c++;
		mon.child(c, 35304, 94, 36);
		c++;
		mon.child(c, 35305, 337, 39);
		c++;
		mon.child(c, 35306, 337, 127);
		c++;
		mon.child(c, 35307, 288, 226);
		c++;
		// Arrows
		mon.child(c, 35308, 69, 281);
		c++;
		mon.child(c, 35309, 69, 281);
		c++;
		mon.child(c, 35310, 103, 281);
		c++;
		mon.child(c, 35311, 103, 281);
		c++;
		// Select Button
		mon.child(c, 35312, 405, 254);
		c++;
		mon.child(c, 35313, 405, 254);
		c++;
		// Stats
		mon.child(c, 35314, 247, 161);
		c++;
		mon.child(c, 35315, 348, 161);
		c++;
		mon.child(c, 35316, 449, 161);
		c++;
		mon.child(c, 35317, 247, 192);
		c++;
		mon.child(c, 35318, 348, 192);
		c++;
		mon.child(c, 35319, 449, 192);
		c++;
		// Description
		mon.child(c, 35320, 187, 253);
		c++;
		mon.child(c, 35321, 187, 266);
		c++;
		mon.child(c, 35322, 187, 279);
		c++;
		mon.child(c, 35323, 187, 292);
		c++;
	}

	public static void classSelect6(TextDrawingArea[] TDA) {
		RSInterface mon = addInterface(36300);
		addSprite(36301, 9, "Interfaces/Class/SPRITE");
		addChar(36302);
		addText(36303, "Select a Class", TDA, 2, 0xff9933, true, true);
		addText(36304, "Skiller", TDA, 2, 0xff9933, true, true);
		addText(36305, "Starting Items", TDA, 2, 0xff9933, true, true);
		addText(36306, "Starting Stats", TDA, 2, 0xff9933, true, true);
		addText(36307, "Description", TDA, 2, 0xff9933, true, true);
		// Items
		addHover(36308, 1, 0, 36309, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(36309, 3, "Interfaces/Class/SPRITE", 16, 16, 36324);// left
		addHover(36310, 1, 0, 36311, 7, "Interfaces/Class/SPRITE", 16, 16,
				"Change Class");
		addHovered(36311, 4, "Interfaces/Class/SPRITE", 16, 16, 36325);// right
		addHover(36312, 1, 0, 36313, 5, "Interfaces/Class/SPRITE", 82, 47,
				"Select");
		addHovered(36313, 6, "Interfaces/Class/SPRITE", 80, 47, 36326);// accept
		// Stats
		addText(36314, "1", TDA, 1, 0xff9933, true, true);
		addText(36315, "1", TDA, 1, 0xff9933, true, true);
		addText(36316, "1", TDA, 1, 0xff9933, true, true);
		addText(36317, "1", TDA, 1, 0xff9933, true, true);
		addText(36318, "1", TDA, 1, 0xff9933, true, true);
		addText(36319, "1", TDA, 1, 0xff9933, true, true);
		// Description
		addText(36320, "The skiller lives a peaceful life.", TDA, 0, 0xff9933,
				false, true);
		addText(36321, "They don't take part in combat,", TDA, 0, 0xff9933,
				false, true);
		addText(36322, "but focus on training skills.", TDA, 0, 0xff9933,
				false, true);
		addText(36323, "", TDA, 0, 0xff9933, false, true);
		mon.totalChildren(23);
		int c = 0;
		mon.child(c, 36301, 5, 9);
		c++;
		mon.child(c, 36302, 27, 180);
		c++;
		mon.child(c, 36303, 255, 13);
		c++;
		mon.child(c, 36304, 94, 36);
		c++;
		mon.child(c, 36305, 337, 39);
		c++;
		mon.child(c, 36306, 337, 127);
		c++;
		mon.child(c, 36307, 288, 226);
		c++;
		// Arrows
		mon.child(c, 36308, 69, 281);
		c++;
		mon.child(c, 36309, 69, 281);
		c++;
		mon.child(c, 36310, 103, 281);
		c++;
		mon.child(c, 36311, 103, 281);
		c++;
		// Select Button
		mon.child(c, 36312, 405, 254);
		c++;
		mon.child(c, 36313, 405, 254);
		c++;
		// Stats
		mon.child(c, 36314, 247, 161);
		c++;
		mon.child(c, 36315, 348, 161);
		c++;
		mon.child(c, 36316, 449, 161);
		c++;
		mon.child(c, 36317, 247, 192);
		c++;
		mon.child(c, 36318, 348, 192);
		c++;
		mon.child(c, 36319, 449, 192);
		c++;
		// Description
		mon.child(c, 36320, 187, 253);
		c++;
		mon.child(c, 36321, 187, 266);
		c++;
		mon.child(c, 36322, 187, 279);
		c++;
		mon.child(c, 36323, 187, 292);
		c++;
	}

	public static void addGrandExchangeItem(int index, Boolean hasOption, int id) {
		RSInterface rsi = interfaceCache[index] = new RSInterface();
		rsi.actions = new String[5];
		rsi.spritesX = new int[20];
		rsi.invStackSizes = new int[30];
		rsi.inv = new int[30];
		rsi.spritesY = new int[20];

		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];
		if (!hasOption) {
			rsi.actions = null;
			rsi.hasExamine = false;
		} else {
			rsi.actions[0] = "Collect";
			rsi.actions[1] = "Collect-Notes";
			rsi.hasExamine = true;
		}
		rsi.centerText = false;
		rsi.filled = false;
		rsi.dragDeletes = false;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		// rsi.aBoolean251 = false;
		rsi.aBoolean259 = true;
		// rsi.interfaceShown = false;
		rsi.textShadow = false;
		// rsi.hoverType = -1;
		rsi.invSpritePadX = 24;
		rsi.invSpritePadY = 24;
		rsi.height = 5;
		rsi.width = 6;
		rsi.parentID = index + id;
		rsi.id = 18000;
		rsi.type = 2;
	}

	public static void addBankItem(int index, Boolean hasOption) {
		RSInterface rsi = interfaceCache[index] = new RSInterface();
		rsi.actions = new String[5];
		rsi.spritesX = new int[20];
		rsi.invStackSizes = new int[30];
		rsi.inv = new int[30];
		rsi.spritesY = new int[20];

		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];

		rsi.hasExamine = false;

		rsi.invSpritePadX = 24;
		rsi.invSpritePadY = 24;
		rsi.height = 5;
		rsi.width = 6;
		rsi.parentID = 5292;
		rsi.id = index;
		rsi.type = 2;
	}

	public static void bobInterface(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(2700);
		addSprite(2701, 20, "SummonTab/SUMMON");
		addBobStorage(2702);
		addHoverButton(2703, "Interfaces/Equipment/SPRITE", 1, 21, 21, "Close",
				250, 2704, 3);
		addHoveredButton(2704, "Interfaces/Equipment/SPRITE", 3, 21, 21, 2705);
		// addButton(2706, 0, "sprite", 30, 30, "Beast of burden inventory", 1);
		rsi.totalChildren(4);
		rsi.child(0, 2701, 90, 14);
		rsi.child(1, 2702, 100, 56);
		rsi.child(2, 2703, 432, 23);
		rsi.child(3, 2704, 432, 23);
		// rsi.child(4, 2706, 427, 290);
	}

	public static void addInvItems(int index) {
		RSInterface rsi = interfaceCache[index] = new RSInterface();
		rsi.actions = new String[5];
		rsi.spritesX = new int[20];
		rsi.invStackSizes = new int[30];
		rsi.inv = new int[30];
		rsi.spritesY = new int[20];

		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];

		rsi.centerText = false;
		rsi.filled = false;
		rsi.dragDeletes = false;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		// rsi.aBoolean251 = false;
		rsi.aBoolean259 = true;
		// rsi.interfaceShown = false;
		rsi.textShadow = false;
		// rsi.hoverType = -1;
		rsi.invSpritePadX = 12;
		rsi.invSpritePadY = 4;
		rsi.height = 7;
		rsi.width = 4;
		rsi.parentID = 2802;
		rsi.id = 2800;
		rsi.type = 2;
	}

	public static void otherInvInterface(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(12800);
		addSprite(12801, 0, "Misc/otherinv");
		addInvItems(12802);
		addHoverButton(12803, "Interfaces/Equipment/SPRITE", 1, 21, 21,
				"Close", 250, 12804, 3);
		addHoveredButton(2804, "Interfaces/Equipment/SPRITE", 3, 21, 21, 12805);
		addText(12806, "Inventory of Matt", tda, 0, 0xFFA500, false, true);
		rsi.totalChildren(5);
		rsi.child(0, 12801, 155, 14);
		rsi.child(1, 12802, 176, 55);
		rsi.child(2, 12803, 334, 23);
		rsi.child(3, 12804, 334, 23);
		rsi.child(4, 12806, 195, 25);
	}

	public static void simpleText(TextDrawingArea[] tda) {
		/* Achievements etc */
		addSprite(8135, 0, "Misc/TEXTB");

		/* Sets */
		addSprite(12813, 6, "Misc/CUSTOM");
	}

	public static void profileInterface(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(12050);
		addSprite(12051, 1, "Misc/profile");
		addInvItems(12052);
		addHoverButton(12048, "Interfaces/Equipment/SPRITE", 1, 21, 21,
				"Close", 250, 12049, 3);
		addHoveredButton(2804, "Interfaces/Equipment/SPRITE", 3, 21, 21, 12055);
		addText(12056, "Character Profile of Matt", tda, 0, 0xFFA500, true,
				true);
		addText(12057, "Player Note 1", tda, 0, 0xFFFFFF, true, true);
		addText(12058, "Player Note 2", tda, 0, 0xFFFFFF, true, true);
		addText(12059, "Player Note 3", tda, 0, 0xFFFFFF, true, true);
		addText(12060, "Player Note 4", tda, 0, 0xFFFFFF, true, true);
		addText(12061, "Player Note 5", tda, 0, 0xFFFFFF, true, true);
		addText(12062, "Player Note 6", tda, 0, 0xFFFFFF, true, true);
		addText(12063, "Player Note 7", tda, 0, 0xFFFFFF, true, true);
		addText(12064, "Player Note 8", tda, 0, 0xFFFFFF, true, true);
		addText(12070, "Player Note 9", tda, 0, 0xFFFFFF, true, true);
		addText(12075, "Player Note 10", tda, 0, 0xFFFFFF, true, true);

		addText(12076, "STATISTIC 1", tda, 0, 0xFFA500, false, true);
		addText(12077, "STATISTIC 2", tda, 0, 0xFFA500, false, true);
		addText(12078, "STATISTIC 3", tda, 0, 0xFFA500, false, true);
		addText(12079, "STATISTIC 4", tda, 0, 0xFFA500, false, true);
		addText(12080, "STATISTIC 5", tda, 0, 0xFFA500, false, true);
		addText(12081, "STATISTIC 6", tda, 0, 0xFFA500, false, true);

		addHoverText(12082, "Option 1", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);
		addHoverText(12083, "Option 2", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);
		addHoverText(12084, "Option 3", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);
		addHoverText(12085, "Option 4", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);
		addHoverText(12086, "Option 5", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);
		addHoverText(12087, "Option 6", "Continue", tda, 0, 0x2E9AFE, false,
				true, 150);

		rsi.totalChildren(27);
		rsi.child(0, 12051, 5, 10);
		rsi.child(1, 12052, 323, 53);
		rsi.child(2, 12048, 480, 19);
		rsi.child(3, 12049, 999, 999);
		rsi.child(4, 12056, 270, 22);
		rsi.child(5, 12057, 160, 50);
		rsi.child(6, 12058, 160, 65);
		rsi.child(7, 12059, 160, 80);
		rsi.child(8, 12060, 160, 95);
		rsi.child(9, 12061, 160, 110);
		rsi.child(10, 12062, 160, 125);
		rsi.child(11, 12063, 160, 140);
		rsi.child(12, 12064, 160, 155);
		rsi.child(13, 12070, 160, 170);
		rsi.child(14, 12075, 160, 185);

		rsi.child(15, 12076, 20, 212);
		rsi.child(16, 12077, 20, 227);
		rsi.child(17, 12078, 20, 242);
		rsi.child(18, 12079, 20, 257);
		rsi.child(19, 12080, 20, 272);
		rsi.child(20, 12081, 20, 287);

		rsi.child(21, 12082, 220, 212);
		rsi.child(22, 12083, 220, 227);
		rsi.child(23, 12084, 220, 242);
		rsi.child(24, 12085, 220, 257);
		rsi.child(25, 12086, 220, 272);
		rsi.child(26, 12087, 220, 287);
	}

	/* Pest Control Interface */
	public static void PestControl(TextDrawingArea[] wid) {
		/* Experience Tab */
		RSInterface tab = addTabInterface(18700);
		addSprite(18702, 0, "Interfaces/PestControl/PC");
		addButton(18703, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18704, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18705, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18706, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18707, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18708, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18709, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18710, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18711, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18712, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18713, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18714, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18715, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18716, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18717, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18718, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18719, 0, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18720, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18721, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18722, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18723, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18724, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18725, 1, "Interfaces/PestControl/B", 48, 14, "Select", 1);
		addButton(18726, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18727, 2, "Interfaces/PestControl/B", 46, 14, "Select", 1);
		addButton(18728, 1, "Interfaces/PestControl/SPRITE", 16, 16,
				"Close Window", 1);
		addText(18729, "10", wid, 0, 0xFFA500, false, true);
		addButton(18774, 0, "Interfaces/PestControl/X", 102, 22, "Equipment", 1);
		addButton(18775, 0, "Interfaces/PestControl/X", 102, 22, "Consumables",
				1);
		addButton(18776, 0, "Interfaces/PestControl/X", 102, 22, "Extra", 1);
		tab.totalChildren(32);
		tab.child(0, 18701, 4, 16);
		tab.child(1, 18702, 4, 16);
		tab.child(2, 18703, 280, 127);
		tab.child(3, 18704, 280, 201);
		tab.child(4, 18705, 280, 274);
		tab.child(5, 18706, 338, 127);
		tab.child(6, 18707, 184, 127);
		tab.child(7, 18708, 386, 127);
		tab.child(8, 18709, 386, 201);
		tab.child(9, 18710, 434, 127);
		tab.child(10, 18711, 434, 201);
		tab.child(11, 18712, 30, 201);
		tab.child(12, 18713, 184, 127);
		tab.child(13, 18714, 338, 201);
		tab.child(14, 18715, 184, 127);
		tab.child(15, 18716, 30, 127);
		tab.child(16, 18717, 184, 127);
		tab.child(17, 18718, 184, 201);
		tab.child(18, 18719, 184, 274);
		tab.child(19, 18720, 78, 127);
		tab.child(20, 18721, 232, 127);
		tab.child(21, 18722, 78, 201);
		tab.child(22, 18723, 232, 127);
		tab.child(23, 18724, 232, 201);
		tab.child(24, 18725, 232, 274);
		tab.child(25, 18726, 126, 127);
		tab.child(26, 18727, 126, 201);
		tab.child(27, 18728, 480, 24);
		tab.child(28, 18729, 460, 288);
		tab.child(29, 18774, 124, 46);
		tab.child(30, 18775, 229, 46);
		tab.child(31, 18776, 334, 46);

		/* Equipment Tab */
		RSInterface tab1 = addTabInterface(18730);
		addSprite(18732, 1, "Interfaces/PestControl/PC");
		addButton(18733, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18734, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18735, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18736, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18737, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18738, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18739, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18740, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18741, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18742, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18743, 5, "Interfaces/PestControl/B", 90, 56, "Select", 1);
		addButton(18728, 1, "Interfaces/PestControl/SPRITE", 16, 16,
				"Close Window", 1);
		addText(18729, "10", wid, 0, 0xFFA500, false, true);
		addButton(18773, 0, "Interfaces/PestControl/X", 102, 22, "Experience",
				1);
		addButton(18775, 0, "Interfaces/PestControl/X", 102, 22, "Consumables",
				1);
		addButton(18776, 0, "Interfaces/PestControl/X", 102, 22, "Extra", 1);
		tab1.totalChildren(18);
		tab1.child(0, 18731, 4, 16);
		tab1.child(1, 18732, 4, 16);
		tab1.child(2, 18733, 30, 127);
		tab1.child(3, 18734, 30, 201);
		tab1.child(4, 18735, 184, 127);
		tab1.child(5, 18736, 338, 127);
		tab1.child(6, 18737, 184, 201);
		tab1.child(7, 18738, 338, 127);
		tab1.child(8, 18739, 338, 201);
		tab1.child(9, 18740, 184, 274);
		tab1.child(10, 18741, 338, 127);
		tab1.child(11, 18742, 338, 201);
		tab1.child(12, 18743, 56, 231);
		tab1.child(13, 18728, 480, 24);
		tab1.child(14, 18729, 460, 288);
		tab1.child(15, 18773, 19, 46);
		tab1.child(16, 18775, 229, 46);
		tab1.child(17, 18776, 334, 46);

		/* Equipment Tab Void */
		RSInterface tab2 = addTabInterface(18746);
		addSprite(18747, 2, "Interfaces/PestControl/PC");
		addButton(18748, 6, "Interfaces/PestControl/B", 90, 56, "Select", 1);
		addButton(18749, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18750, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18728, 1, "Interfaces/PestControl/SPRITE", 16, 16,
				"Close Window", 1);
		addText(18729, "10", wid, 0, 0xFFA500, false, true);
		addButton(18773, 0, "Interfaces/PestControl/X", 102, 22, "Experience",
				1);
		addButton(18775, 0, "Interfaces/PestControl/X", 102, 22, "Consumables",
				1);
		addButton(18776, 0, "Interfaces/PestControl/X", 102, 22, "Extra", 1);
		tab2.totalChildren(9);
		tab2.child(0, 18747, 4, 16);
		tab2.child(1, 18748, 56, 231);
		tab2.child(2, 18749, 30, 127);
		tab2.child(3, 18750, 184, 127);
		tab2.child(4, 18728, 480, 24);
		tab2.child(5, 18729, 460, 288);
		tab2.child(6, 18773, 19, 46);
		tab2.child(7, 18775, 229, 46);
		tab2.child(8, 18776, 334, 46);

		/* Consumables Tab */
		RSInterface tab3 = addTabInterface(18753);
		addSprite(18754, 3, "Interfaces/PestControl/PC");
		addButton(18755, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18756, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18757, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18758, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18759, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18760, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18728, 1, "Interfaces/PestControl/SPRITE", 16, 16,
				"Close Window", 1);
		addText(18729, "10", wid, 0, 0xFFA500, false, true);
		addButton(18773, 0, "Interfaces/PestControl/X", 102, 22, "Experience",
				1);
		addButton(18774, 0, "Interfaces/PestControl/X", 102, 22, "Equipment", 1);
		addButton(18776, 0, "Interfaces/PestControl/X", 102, 22, "Extra", 1);
		tab3.totalChildren(12);
		tab3.child(0, 18754, 4, 16);
		tab3.child(1, 18755, 30, 127);
		tab3.child(2, 18756, 184, 127);
		tab3.child(3, 18757, 338, 127);
		tab3.child(4, 18758, 30, 201);
		tab3.child(5, 18759, 184, 201);
		tab3.child(6, 18760, 338, 201);
		tab3.child(7, 18728, 480, 24);
		tab3.child(8, 18729, 460, 288);
		tab3.child(9, 18773, 19, 46);
		tab3.child(10, 18774, 124, 46);
		tab3.child(11, 18776, 334, 46);

		/* extra Tab */
		RSInterface tab4 = addTabInterface(18763);
		addSprite(18764, 4, "Interfaces/PestControl/PC");
		addButton(18765, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18766, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18767, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18768, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18769, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18770, 3, "Interfaces/PestControl/B", 142, 14, "Select", 1);
		addButton(18728, 1, "Interfaces/PestControl/SPRITE", 16, 16,
				"Close Window", 1);
		addText(18729, "10", wid, 0, 0xFFA500, false, true);
		addButton(18773, 0, "Interfaces/PestControl/X", 102, 22, "Experience",
				1);
		addButton(18774, 0, "Interfaces/PestControl/X", 102, 22, "Equipment", 1);
		addButton(18775, 0, "Interfaces/PestControl/X", 102, 22, "Consumables",
				1);
		tab4.totalChildren(12);
		tab4.child(0, 18764, 4, 16);
		tab4.child(1, 18765, 30, 127);
		tab4.child(2, 18766, 184, 127);
		tab4.child(3, 18767, 338, 127);
		tab4.child(4, 18768, 30, 201);
		tab4.child(5, 18769, 184, 201);
		tab4.child(6, 18770, 338, 201);
		tab4.child(7, 18728, 480, 24);
		tab4.child(8, 18729, 460, 288);
		tab4.child(9, 18773, 19, 46);
		tab4.child(10, 18774, 124, 46);
		tab4.child(11, 18775, 229, 46);
	}

	public static void SummonTab(TextDrawingArea[] wid) {
		RSInterface Tab = addTabInterface(17011);
		addSprite(17012, 6, "SummonTab/SUMMON");
		addButton(17013, 7, "/SummonTab/SUMMON", "Click");
		// addHover(17013, 7,"/SummonTab/SUMMON", "Click");
		addSprite(17014, 6, "SummonTab/SUMMON");
		addConfigButton(17015, 17032, 14, 8, "/SummonTab/SUMMON", 20, 30,
				"Familiar Special", 1, 5, 300);
		addHoverButton(17018, "/SummonTab/SUMMON", 2, 38, 36,
				"Beast of burden Inventory", -1, 17028, 1);
		addHoveredButton(17028, "/SummonTab/SUMMON", 12, 38, 36, 17029);
		addHoverButton(17022, "/SummonTab/SUMMON", 1, 38, 36, "Call Familiar",
				-1, 17030, 1);// addHoverButton(int i, String imageName, int j,
								// int width, int height, String text, int
		addHoveredButton(17030, "/SummonTab/SUMMON", 13, 38, 36, 17031);
		addHoverButton(17023, "/SummonTab/SUMMON", 3, 38, 36,
				"Dismiss Familiar", -1, 17033, 1);// addHoverButton(int i,
													// String imageName, int j,
													// int width, int height,
													// String text, int
		addHoveredButton(17033, "/SummonTab/SUMMON", 15, 38, 36, 17034);
		addSprite(17016, 5, "SummonTab/SUMMON");
		addText(17017, "", wid, 2, 0xDAA520, false, true);
		addSprite(17019, 9, "SummonTab/SUMMON");
		addText(17021, "6.00", wid, 0, 0xFFA500, false, true);
		addSprite(17020, 10, "SummonTab/SUMMON");
		addSprite(17024, 11, "SummonTab/SUMMON");
		addText(17025, "49/50", wid, 0, 0xFFA500, false, true);
		addText(17026, "10", wid, 0, 0xFFA500, false, true);
		addHead2(17027, 75, 55, 800);
		Tab.totalChildren(19);
		Tab.child(0, 17012, 10, 25);
		Tab.child(1, 17013, 24, 7);
		Tab.child(2, 17014, 10, 25);
		Tab.child(3, 17015, 11, 25);
		Tab.child(4, 17016, 15, 140);
		Tab.child(5, 17017, 45, 143);
		Tab.child(6, 17018, 20, 170);
		Tab.child(7, 17019, 115, 167);
		Tab.child(8, 17020, 143, 170);
		Tab.child(9, 17021, 135, 197);
		Tab.child(10, 17022, 20, 213);
		Tab.child(11, 17023, 67, 193);
		Tab.child(12, 17024, 135, 214);
		Tab.child(13, 17025, 135, 240);
		Tab.child(14, 17026, 21, 59);
		Tab.child(15, 17027, 75, 55);
		Tab.child(16, 17028, 20, 170);
		Tab.child(17, 17030, 20, 213);
		Tab.child(18, 17033, 67, 193);
	}

	public static void Shop(TextDrawingArea[] TDA) {
		RSInterface Interface = addTabInterface(3824);
		setChildren(8, Interface);
		addSprite(3825, 0, "Bank/SHOP");
		addHover(3902, 3, 0, 3826, 1, "Bank/BANK", 17, 17, "Close Window");
		addHovered(3826, 2, "Bank/BANK", 17, 17, 3827);
		addText(19679, "Main Stock", 0xFF981F, false, true, 52, TDA, 1);// 3628////19679
		addText(19680, "Store Info", 0xBF751D, false, true, 52, TDA, 1);// 3629//19680
		addButton(19681, 2, "Bank/SHOP", 95, 19, "", 1);// 3630//19681
		setBounds(3825, 12, 12, 0, Interface);
		setBounds(3902, 471, 22, 1, Interface);
		setBounds(3826, 471, 22, 2, Interface);
		setBounds(3900, 60, 85, 3, Interface);
		setBounds(3901, 240, 21, 4, Interface);
		setBounds(19679, 42, 54, 5, Interface);
		setBounds(19680, 150, 54, 6, Interface);
		setBounds(19681, 129, 50, 7, Interface);
		Interface = interfaceCache[3900];
		Interface.invSpritePadX = 8;
		Interface.width = 10;
		Interface.height = 4;
		Interface.invSpritePadY = 19;
		Interface = addTabInterface(19682);
		addSprite(19683, 1, "Bank/SHOP");
		addText(19684, "Main Stock", 0xBF751D, false, true, 52, TDA, 1);
		addText(19685, "Store Info", 0xFF981F, false, true, 52, TDA, 1);
		addButton(19686, 2, "Bank/SHOP", 95, 19, "Main Stock", 1);
		setChildren(7, Interface);
		setBounds(19683, 12, 12, 0, Interface);
		setBounds(3901, 240, 21, 1, Interface);
		setBounds(19684, 42, 54, 2, Interface);
		setBounds(19685, 150, 54, 3, Interface);
		setBounds(19686, 23, 50, 4, Interface);
		setBounds(3902, 471, 22, 5, Interface);
		setBounds(3826, 60, 85, 6, Interface);
	}

	public static void addText(int i, String s, int k, boolean l, boolean m,
			int a, TextDrawingArea[] TDA, int j, int dsc) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = 174;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = a;
		rsinterface.centerText = l;
		rsinterface.textShadow = m;
		rsinterface.textDrawingAreas = TDA[j];
		rsinterface.message = s;
		rsinterface.aString228 = "";
		rsinterface.anInt219 = 0;
		rsinterface.textColor = k;
		rsinterface.anInt216 = dsc;
		rsinterface.tooltip = s;
	}

	public static void graphicsOption(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(18500);
		addSprite(18502, "graphicsOption/Graphics options");
		addButton(18503, "Fixed", 106, 44, "graphicsOption/fixed");
		addButton(18504, "Resizable", 143, 48, "graphicsOption/resize");
		addButton(18505, "FullScreen", 157, 47, "graphicsOption/fullscreen");
		rsinterface.totalChildren(5);
		rsinterface.child(0, 18501, 4, 16);
		rsinterface.child(1, 18502, 4, 16);
		rsinterface.child(2, 18503, 54, 241);
		rsinterface.child(3, 18504, 178, 241);
		rsinterface.child(4, 18505, 329, 241);
	}

	public static void grandExchangeBuy(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(16000);
		addSprite(16702, "Interfaces/GrandExchange/GrandExchangeOffer/buy 0");
		addHoverButton(16703, "Interfaces/GrandExchange/GrandExchangeOffer/1152", 13, 13,
				"Decrease Quantity", -1, 16765, 5);
		addHoveredButton(16765, "Interfaces/GrandExchange/GrandExchangeOffer/mhover", 13, 13, 16766);
		addHoverButton(16704, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 10",
				-1, 16705, 5);
		addHoveredButton(16705, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16706);
		addText(16707, "  +10", tda, 0, 0xFF9800);
		addText(16711, "  +100", tda, 0, 0xFF9800);
		addHoverButton(16708, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 100",
				-1, 16709, 5);
		addHoveredButton(16709, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16710);
		addText(16715, "    +1k", tda, 0, 0xFF9800);
		addHoverButton(16712, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Add 1000", -1, 16713, 5);
		addHoveredButton(16713, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16714);
		addText(16752, "      ...", tda, 0, 0xFF9800);
		addHoverButton(16716, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Edit Quantity", -1, 16750, 5);
		addHoveredButton(16750, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16751);
		addText(16755, "-5%", tda, 0, 0xFF9800);
		addHoverButton(16718, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Decrease Price", -1, 16753, 5);
		addHoveredButton(16753, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16754);
		addText(16763, "+5%", tda, 0, 0xFF9800);
		addHoverButton(16720, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Increase Price", -1, 16761, 5);
		addHoveredButton(16761, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16762);
		addText(16760, "   ...", tda, 0, 0xFF9800);
		addHoverButton(16722, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Edit Price", -1, 16758, 5);
		addHoveredButton(16758, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16759);
		addText(16727, "   +1", tda, 0, 0xFF9800);
		addHoverButton(16724, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 1",
				-1, 16725, 5);
		addHoveredButton(16725, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 16726);
		addHoverButton(16728, "Interfaces/GrandExchange/GrandExchangeOffer/1153", 13, 13,
				"Increase Quantity", -1, 16767, 5);
		addHoveredButton(16767, "Interfaces/GrandExchange/GrandExchangeOffer/phover", 13, 13, 16768);
		addHoverButton(16729, "Interfaces/GrandExchange/GrandExchangeOffer/1152", 13, 13,
				"Decrease Quantity", -1, 16769, 5);
		addHoveredButton(16769, "Interfaces/GrandExchange/GrandExchangeOffer/mhover", 13, 13, 16770);
		addHoverButton(16730, "Interfaces/GrandExchange/GrandExchangeOffer/1153", 13, 13,
				"Increase Price", -1, 16771, 5);
		addHoveredButton(16771, "Interfaces/GrandExchange/GrandExchangeOffer/phover", 13, 13, 16772);
		addHoverButton(16731, "Interfaces/GrandExchange/GrandExchangeOffer/1147", 30, 23, "Back",
				-1, 16732, 5);
		addHoveredButton(16732, "Interfaces/GrandExchange/GrandExchangeOffer/1149", 30, 23, 16733);
		addText(16734, "20,000 gp", tda, 0, 0x808000, false);
		addText(16735, "1", tda, 2, 0xFFA861, true);
		addText(16736, "20,000 gp", tda, 2, 0xFFA861, true);
		addText(16737, "20,000 gp", tda, 2, 0xEBE573, true);
		addText(16738, "Rune longsword", tda, 2, 0xCC9900);
		addText(16739, "A razor sharp longsword.", tda, 0, 0xC1A875);
		addHoverButton(16740, "Interfaces/GrandExchange/GrandExchangeOffer/setprice", 35, 25,
				"Offer Guide Price", -1, 16756, 5);
		addHoveredButton(16756, "Interfaces/GrandExchange/GrandExchangeOffer/setpriceHover", 35, 25,
				16757);
		addHoverButton(16742, "Interfaces/GrandExchange/GrandExchangeOffer/Confirm", 120, 43,
				"Confirm Offer", -1, 16743, 5);
		addHoveredButton(16743, "Interfaces/GrandExchange/GrandExchangeOffer/ConfirmHover", 120, 43,
				16744);
		addHoverButton(16745, "Bank/BANK", 1, 16, 16, "Close Window", -1,
				16746, 5);// Close window top right
		addHoveredButton(16746, "Bank/BANK", 2, 16, 16, 16747);
		addHoverButton(16773, "Interfaces/GrandExchange/GrandExchangeOffer/itembutton", 40, 36,
				"Choose item", -1, 16774, 5);
		addHoveredButton(16774, "Interfaces/GrandExchange/GrandExchangeOffer/itemhover", 40, 36,
				16775);
		addGrandExchangeItem(16001, false, 1);

		addSprite(18074, "Interfaces/GrandExchange/tab 2");
		addText(18075, "You bought a total of @yed@0", tda, 0, 0xC1A875, true);
		addText(18076, "for a total price of @yed@0 @yef@gp.", tda, 0,
				0xC1A875, true);
		addHoverButton(18077, "Interfaces/GrandExchange/btn 0", 20, 20,
				"Abort Offer", -1, 18078, 5);
		addHoveredButton(18078, "Interfaces/GrandExchange/btn 1", 20, 20, 18079);

		addGrandExchangeItem(18080, true, 2);
		addGrandExchangeItem(18081, true, 3);
		addSpriteGE(18082, 0, "Interfaces/GrandExchange/Bbar", 307, 13);

		rsinterface.totalChildren(59);
		rsinterface.child(0, 16701, 4, 20);
		rsinterface.child(1, 16702, 0, 0);
		rsinterface.child(2, 16703, 45, 181); // -button quant
		rsinterface.child(3, 16704, 84, 202); // +10 button
		rsinterface.child(4, 16705, 84, 202); // +10 button hover
		rsinterface.child(5, 16707, 85, 208); // +10
		rsinterface.child(6, 16708, 126, 202); // +100 button
		rsinterface.child(7, 16709, 126, 202); // +100 button hover
		rsinterface.child(8, 16711, 124, 208); // +100
		rsinterface.child(9, 16712, 166, 202); // +1k button
		rsinterface.child(10, 16713, 166, 202); // +1k button
		rsinterface.child(11, 16715, 162, 208); // +1k
		rsinterface.child(12, 16716, 207, 202); // ... for quantity button
		rsinterface.child(13, 16750, 207, 202); // Quantity hover
		rsinterface.child(14, 16718, 261, 202);
		rsinterface.child(15, 16753, 261, 202); //
		rsinterface.child(16, 16720, 415, 202);
		rsinterface.child(17, 16761, 415, 202); // 419, 208
		rsinterface.child(18, 16722, 361, 202);
		rsinterface.child(19, 16758, 361, 202); // 16723, 363, 208
		rsinterface.child(20, 16724, 42, 202); // +1 button
		rsinterface.child(21, 16725, 42, 202); // +1 button hover
		rsinterface.child(22, 16727, 45, 208); // +1
		rsinterface.child(23, 16728, 226, 181);
		rsinterface.child(24, 16729, 261, 181);
		rsinterface.child(25, 16730, 435, 181);

		rsinterface.child(26, 16734, 100, 131);
		rsinterface.child(27, 16735, 145, 180);
		rsinterface.child(28, 16736, 355, 180);
		rsinterface.child(29, 16737, 252, 235);
		rsinterface.child(30, 16738, 200, 66);
		rsinterface.child(31, 16739, 200, 90);
		rsinterface.child(32, 16740, 319, 202);
		rsinterface.child(33, 16756, 319, 202); // 16741, 330, 209
		rsinterface.child(34, 16745, 480, 26);
		rsinterface.child(35, 16746, 480, 26);
		rsinterface.child(36, 16752, 202, 208); // ... for quantity
		rsinterface.child(37, 16755, 266, 208); // +5%
		rsinterface.child(38, 16760, 365, 208); // ... for price
		rsinterface.child(39, 16763, 419, 208);
		rsinterface.child(40, 16765, 45, 181); // -hover quant
		rsinterface.child(41, 16767, 226, 181);
		rsinterface.child(42, 16769, 261, 181); // -hover price
		rsinterface.child(43, 16771, 435, 181); // +hover price
		rsinterface.child(44, 16773, 93, 90);
		rsinterface.child(45, 16774, 93, 90);
		rsinterface.child(46, 16001, 95, 92); // item
		rsinterface.child(47, 18074, 5, 255);
		rsinterface.child(48, 16731, 20, 273);
		rsinterface.child(49, 16732, 20, 273);
		rsinterface.child(50, 18075, 215, 260);
		rsinterface.child(51, 18076, 215, 275);
		rsinterface.child(52, 18077, 350, 265);
		rsinterface.child(53, 18078, 350, 265);
		rsinterface.child(54, 18080, 402, 272);
		rsinterface.child(55, 18081, 452, 272);
		rsinterface.child(56, 18082, 64, 293);
		rsinterface.child(57, 16742, 192, 264);
		rsinterface.child(58, 16743, 192, 264);
	}

	public static void addSpriteGE(int i, int j, String s, int k, int l) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = k;
		rsinterface.height = l;
	}

	public static void grandExchangeSell(TextDrawingArea[] tda) {
		RSInterface rsinterface = addInterface(18000);
		addSprite(18002, "Interfaces/GrandExchange/GrandExchangeOffer/sell 0");
		addHoverButton(18003, "Interfaces/GrandExchange/GrandExchangeOffer/1152", 13, 13,
				"Decrease Quantity", -1, 18065, 5);
		addHoveredButton(18065, "Interfaces/GrandExchange/GrandExchangeOffer/mhover", 13, 13, 18066);
		addHoverButton(18004, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 10",
				-1, 18005, 5);
		addHoveredButton(18005, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18006);
		addText(18007, "   10", tda, 0, 0xFF9800);
		addText(18011, "   100", tda, 0, 0xFF9800);
		addHoverButton(18008, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 100",
				-1, 18009, 5);
		addHoveredButton(18009, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18010);
		addText(18015, "    ALL", tda, 0, 0xFF9800);
		addHoverButton(18012, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add All",
				-1, 18013, 5);
		addHoveredButton(18013, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18014);
		addText(18052, "      ...", tda, 0, 0xFF9800);
		addHoverButton(18016, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Edit Quantity", -1, 18050, 5);
		addHoveredButton(18050, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18051);
		addText(18055, "-5%", tda, 0, 0xFF9800);
		addHoverButton(18018, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Decrease Price", -1, 18053, 5);
		addHoveredButton(18053, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18054);
		addText(18063, "+5%", tda, 0, 0xFF9800);
		addHoverButton(18020, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Increase Price", -1, 18061, 5);
		addHoveredButton(18061, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18062);
		addText(18060, "   ...", tda, 0, 0xFF9800);
		addHoverButton(18022, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25,
				"Edit Price", -1, 18058, 5);
		addHoveredButton(18058, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18059);
		addText(18027, "   1", tda, 0, 0xFF9800);
		addHoverButton(18024, "Interfaces/GrandExchange/GrandExchangeOffer/1146", 35, 25, "Add 1",
				-1, 18025, 5);
		addHoveredButton(18025, "Interfaces/GrandExchange/GrandExchangeOffer/1146b", 35, 25, 18026);
		addHoverButton(18028, "Interfaces/GrandExchange/GrandExchangeOffer/1153", 13, 13,
				"Increase Quantity", -1, 18067, 5);
		addHoveredButton(18067, "Interfaces/GrandExchange/GrandExchangeOffer/phover", 13, 13, 18068);
		addHoverButton(18029, "Interfaces/GrandExchange/GrandExchangeOffer/1152", 13, 13,
				"Decrease Price", -1, 18069, 5);
		addHoveredButton(18069, "Interfaces/GrandExchange/GrandExchangeOffer/mhover", 13, 13, 18070);

		addHoverButton(18030, "Interfaces/GrandExchange/GrandExchangeOffer/1153", 13, 13,
				"Increase Price", -1, 18071, 5);
		addHoveredButton(18071, "Interfaces/GrandExchange/GrandExchangeOffer/phover", 13, 13, 18072);

		addHoverButton(18031, "Interfaces/GrandExchange/GrandExchangeOffer/1147", 30, 23, "Back",
				-1, 18032, 5);
		addHoveredButton(18032, "Interfaces/GrandExchange/GrandExchangeOffer/1149", 30, 23, 18033);
		addText(18034, "20,000 gp", tda, 0, 0x808000, false);
		addText(18035, "1", tda, 2, 0xFFA861, true);
		addText(18036, "20,000 gp", tda, 2, 0xFFA861, true);
		addText(18037, "20,000 gp", tda, 2, 0xEBE573, true);
		addText(18038, "Choose an item to exchange", tda, 2, 0xCC9900);
		addText(18039, "Select an item in your inventory to sell.", tda, 0,
				0xC1A875);
		addHoverButton(18040, "Interfaces/GrandExchange/GrandExchangeOffer/setprice", 35, 25,
				"Offer Guide Price", -1, 18056, 5);
		addHoveredButton(18056, "Interfaces/GrandExchange/GrandExchangeOffer/setpriceHover", 35, 25,
				18057);
		addHoverButton(18042, "Interfaces/GrandExchange/GrandExchangeOffer/Confirm", 120, 43,
				"Confirm Offer", -1, 18043, 5);
		addHoveredButton(18043, "Interfaces/GrandExchange/GrandExchangeOffer/ConfirmHover", 120, 43,
				18044);
		addHoverButton(18045, "Bank/BANK", 1, 16, 16, "Close Window", -1,
				18046, 3);// Close window top right
		addHoveredButton(18046, "Bank/BANK", 2, 16, 16, 18047);

		// addHoverButton(18073, "Interfaces/GrandExchange/GrandExchangeOffer/itembutton", 40, 36,
		// "Choose item", -1, 18074, 5);
		// addHoveredButton(18074, "Interfaces/GrandExchange/GrandExchangeOffer/itemhover", 40, 36,
		// 18075);
		addGrandExchangeItem(18001, false, 1);

		addSprite(18074, "Interfaces/GrandExchange/tab 2");
		addText(18075, "You sold a total of @yed@0", tda, 0, 0xC1A875, true);
		addText(18076, "for a total price of @yed@0 @yef@gp.", tda, 0,
				0xC1A875, true);
		addHoverButton(18077, "Interfaces/GrandExchange/btn 0", 20, 20,
				"Abort Offer", -1, 18078, 5);
		addHoveredButton(18078, "Interfaces/GrandExchange/btn 1", 20, 20, 18079);

		addGrandExchangeItem(18080, true, 2);
		addGrandExchangeItem(18081, true, 3);
		addSpriteGE(18082, 0, "Interfaces/GrandExchange/Bbar", 307, 13);

		rsinterface.totalChildren(57);
		rsinterface.child(0, 18001, 4, 20);
		rsinterface.child(1, 18002, 0, 0);
		rsinterface.child(2, 18003, 45, 181); // -button quant
		rsinterface.child(3, 18004, 84, 202); // +10 button
		rsinterface.child(4, 18005, 84, 202); // +10 button hover
		rsinterface.child(5, 18007, 85, 208); // +10
		rsinterface.child(6, 18008, 126, 202); // +100 button
		rsinterface.child(7, 18009, 126, 202); // +100 button hover
		rsinterface.child(8, 18011, 124, 208); // +100
		rsinterface.child(9, 18012, 166, 202); // +1k button
		rsinterface.child(10, 18013, 166, 202); // +1k button
		rsinterface.child(11, 18015, 162, 208); // +1k
		rsinterface.child(12, 18016, 207, 202); // ... for quantity button
		rsinterface.child(13, 18050, 207, 202); // Quantity hover
		rsinterface.child(14, 18018, 261, 202);
		rsinterface.child(15, 18053, 261, 202); //
		rsinterface.child(16, 18020, 415, 202);
		rsinterface.child(17, 18061, 415, 202); // 419, 208
		rsinterface.child(18, 18022, 361, 202);
		rsinterface.child(19, 18058, 361, 202); // 18023, 363, 208
		rsinterface.child(20, 18024, 42, 202); // +1 button
		rsinterface.child(21, 18025, 42, 202); // +1 button hover
		rsinterface.child(22, 18027, 45, 208); // +1
		rsinterface.child(23, 18028, 226, 181);
		rsinterface.child(24, 18029, 261, 181);
		rsinterface.child(25, 18030, 435, 181);
		rsinterface.child(26, 18034, 100, 131);
		rsinterface.child(27, 18035, 145, 180);
		rsinterface.child(28, 18036, 355, 180);
		rsinterface.child(29, 18037, 252, 235);
		rsinterface.child(30, 18038, 200, 66);
		rsinterface.child(31, 18039, 200, 90);
		rsinterface.child(32, 18040, 319, 202);
		rsinterface.child(33, 18056, 319, 202); // 18041, 330, 209
		rsinterface.child(34, 18045, 480, 26);
		rsinterface.child(35, 18046, 480, 26);
		rsinterface.child(36, 18052, 202, 208); // ... for quantity
		rsinterface.child(37, 18055, 266, 208); // +5%
		rsinterface.child(38, 18060, 365, 208); // ... for price
		rsinterface.child(39, 18063, 419, 208);
		rsinterface.child(40, 18065, 45, 181); // -hover quant
		rsinterface.child(41, 18067, 226, 181);
		rsinterface.child(42, 18069, 261, 181); // -hover price
		rsinterface.child(43, 18071, 435, 181); // +hover price
		// rsinterface.child(48, 18073, 93, 90);
		// rsinterface.child(49, 18074, 93, 90);
		rsinterface.child(44, 18001, 95, 92); // item
		rsinterface.child(45, 18074, 5, 255);
		rsinterface.child(46, 18031, 20, 273);
		rsinterface.child(47, 18032, 20, 273);
		rsinterface.child(48, 18075, 215, 260);
		rsinterface.child(49, 18076, 215, 275);
		rsinterface.child(50, 18077, 350, 265);
		rsinterface.child(51, 18078, 350, 265);
		rsinterface.child(52, 18080, 402, 272);
		rsinterface.child(53, 18081, 452, 272);
		rsinterface.child(54, 18082, 64, 293);
		rsinterface.child(55, 18042, 192, 264);
		rsinterface.child(56, 18043, 192, 264);

	}

	public static void grandExchangeMain(TextDrawingArea[] TDA) {
		int c = 35000;
		RSInterface rsinterface = addInterface(c);
		// items
		addGrandExchangeItem(c + 74, false, 0);
		addGrandExchangeItem(c + 75, false, 0);
		addGrandExchangeItem(c + 76, false, 0);
		addGrandExchangeItem(c + 77, false, 0);
		addGrandExchangeItem(c + 78, false, 0);
		addGrandExchangeItem(c + 79, false, 0);

		// item name and gp
		addText(c + 80, "Dragon boots", TDA, 0, 0xCC9900);
		addText(c + 81, "123,400 gp", TDA, 0, 0xBDBB5B);

		addText(c + 82, "Dragon boots", TDA, 0, 0xCC9900);
		addText(c + 83, "123,400 gp", TDA, 0, 0xBDBB5B);

		addText(c + 84, "Dragon boots", TDA, 0, 0xCC9900);
		addText(c + 85, "123,400 gp", TDA, 0, 0xBDBB5B);

		addText(c + 86, "Dragon boots", TDA, 0, 0xCC9900);
		addText(c + 87, "123,400 gp", TDA, 0, 0xBDBB5B);

		addText(c + 88, "Dragon boots", TDA, 0, 0xCC9900);
		addText(c + 89, "123,400 gp", TDA, 0, 0xBDBB5B);

		addText(c + 90, "Dragon boots", TDA, 0, 0xCC9900); // 689800
		addText(c + 91, "123,400 gp", TDA, 0, 0xBDBB5B);

		addSprite(c + 1, 0, "Interfaces/GrandExchange/new");
		addText(c + 2, "Grand Exchange", TDA, 2, 0xCC9800);
		addHoverButton(c + 3, "Bank/BANK", 1, 16, 16, "Close Window", -1,
				c + 4, 3);// Close window top right
		addHoveredButton(c + 4, "Bank/BANK", 2, 16, 16, c + 5);
		addText(c + 6, "Empty", TDA, 2, 0xCC9800);
		addText(c + 7, "Empty", TDA, 2, 0xCC9800);
		addText(c + 8, "Empty", TDA, 2, 0xCC9800);
		addText(c + 9, "Empty", TDA, 2, 0xCC9800);
		addText(c + 10, "Empty", TDA, 2, 0xCC9800);
		addText(c + 11, "Empty", TDA, 2, 0xCC9800);
		addHoverButton(c + 12, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 13, 5);
		addHoveredButton(c + 13, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 14);
		addHoverButton(c + 15, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 16, 5);
		addHoveredButton(c + 16, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 17);
		addHoverButton(c + 18, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 19, 5);
		addHoveredButton(c + 19, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 20);
		addHoverButton(c + 21, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 22, 5);
		addHoveredButton(c + 22, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 23);
		addHoverButton(c + 24, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 25, 5);
		addHoveredButton(c + 25, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 26);
		addHoverButton(c + 27, "Interfaces/GrandExchange/new", 2, 50, 50,
				"Buy", -1, c + 28, 5);
		addHoveredButton(c + 28, "Interfaces/GrandExchange/new", 4, 50, 50,
				c + 29);
		addHoverButton(c + 30, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 31, 5);
		addHoveredButton(c + 31, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 32);
		addHoverButton(c + 33, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 34, 5);
		addHoveredButton(c + 34, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 35);
		addHoverButton(c + 36, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 37, 5);
		addHoveredButton(c + 37, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 38);
		addHoverButton(c + 39, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 40, 5);
		addHoveredButton(c + 40, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 41);
		addHoverButton(c + 42, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 43, 5);
		addHoveredButton(c + 43, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 44);
		addHoverButton(c + 45, "Interfaces/GrandExchange/new", 3, 50, 50,
				"Sell", -1, c + 46, 5);
		addHoveredButton(c + 46, "Interfaces/GrandExchange/new", 5, 50, 50,
				c + 47);

		addHoverButton(c + 48, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 49, 5);
		addHoveredButton(c + 49, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 50);
		addHoverButton(c + 51, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 52, 5);
		addHoveredButton(c + 52, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 53);
		addHoverButton(c + 54, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 55, 5);
		addHoveredButton(c + 55, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 56);
		addHoverButton(c + 57, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 58, 5);
		addHoveredButton(c + 58, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 59);
		addHoverButton(c + 60, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 61, 5);
		addHoveredButton(c + 61, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 62);
		addHoverButton(c + 63, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 64, 5);
		addHoveredButton(c + 64, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 65);
		addHoverButton(c + 66, "Interfaces/GrandExchange/tab", 0, 140, 110,
				"View Offer", -1, c + 67, 5);
		addHoveredButton(c + 67, "Interfaces/GrandExchange/tab", 1, 140, 110,
				c + 68);

		addSpriteGE(c + 68, 0, "Interfaces/GrandExchange/bar", 124, 13);
		addSpriteGE(c + 69, 0, "Interfaces/GrandExchange/bar", 124, 13);
		addSpriteGE(c + 70, 0, "Interfaces/GrandExchange/bar", 124, 13);
		addSpriteGE(c + 71, 0, "Interfaces/GrandExchange/bar", 124, 13);
		addSpriteGE(c + 72, 0, "Interfaces/GrandExchange/bar", 124, 13);
		addSpriteGE(c + 73, 0, "Interfaces/GrandExchange/bar", 124, 13);

		rsinterface.totalChildren(70);
		rsinterface.child(0, c + 1, 4, 20);
		rsinterface.child(1, c + 2, 200, 27);
		rsinterface.child(2, c + 3, 482, 28);
		rsinterface.child(3, c + 4, 482, 28);

		rsinterface.child(4, c + 12, 45, 115);
		rsinterface.child(5, c + 13, 45, 106);
		rsinterface.child(6, c + 18, 202, 115);
		rsinterface.child(7, c + 19, 202, 106);
		rsinterface.child(8, c + 24, 358, 115);
		rsinterface.child(9, c + 25, 358, 106);
		rsinterface.child(10, c + 15, 45, 234);
		rsinterface.child(11, c + 16, 45, 225);
		rsinterface.child(12, c + 21, 202, 234);
		rsinterface.child(13, c + 22, 202, 225);
		rsinterface.child(14, c + 27, 358, 234);
		rsinterface.child(15, c + 28, 358, 225);
		rsinterface.child(16, c + 30, 105, 115);
		rsinterface.child(17, c + 31, 105, 107);
		rsinterface.child(18, c + 33, 261, 115);
		rsinterface.child(19, c + 34, 261, 107);
		rsinterface.child(20, c + 36, 417, 115);
		rsinterface.child(21, c + 37, 417, 107);
		rsinterface.child(22, c + 39, 105, 234);
		rsinterface.child(23, c + 40, 105, 226);
		rsinterface.child(24, c + 42, 261, 234);
		rsinterface.child(25, c + 43, 261, 226);
		rsinterface.child(26, c + 45, 417, 234);
		rsinterface.child(27, c + 46, 417, 226);

		rsinterface.child(28, c + 48, 29, 69);
		rsinterface.child(29, c + 49, 29, 69);
		rsinterface.child(30, c + 51, 29, 189);
		rsinterface.child(31, c + 52, 29, 189);
		rsinterface.child(32, c + 54, 185, 69);
		rsinterface.child(33, c + 55, 185, 69);
		rsinterface.child(34, c + 57, 185, 189);
		rsinterface.child(35, c + 58, 185, 189);
		rsinterface.child(36, c + 60, 341, 69);
		rsinterface.child(37, c + 61, 341, 69);
		rsinterface.child(38, c + 63, 341, 189);
		rsinterface.child(39, c + 64, 341, 189);
		/*
		 * rsinterface.child(46, c + 66, 37, 147); rsinterface.child(47, c + 67,
		 * 37, 147);
		 */

		// bars
		rsinterface.child(40, c + 69, 37, 270);
		rsinterface.child(41, c + 70, 193, 150);
		rsinterface.child(42, c + 71, 193, 270);
		rsinterface.child(43, c + 72, 349, 150);
		rsinterface.child(44, c + 73, 349, 270);
		rsinterface.child(45, c + 68, 37, 150);

		// text "buy" and "sell"
		rsinterface.child(46, c + 6, 80, 75); // 1
		rsinterface.child(47, c + 7, 80, 195); // 4
		rsinterface.child(48, c + 8, 238, 75); // 2
		rsinterface.child(49, c + 9, 238, 195); // 5
		rsinterface.child(50, c + 10, 389, 75); // 3
		rsinterface.child(51, c + 11, 389, 195); // 6

		// itemoninterface
		rsinterface.child(52, c + 74, 40, 102); // 1
		rsinterface.child(53, c + 75, 40, 220); // 4
		rsinterface.child(54, c + 76, 195, 102); // 2
		rsinterface.child(55, c + 77, 195, 220); // 5
		rsinterface.child(56, c + 78, 350, 102); // 3
		rsinterface.child(57, c + 79, 350, 220); // 6

		// top item name
		rsinterface.child(58, c + 80, 77, 97); // 1
		rsinterface.child(59, c + 82, 77, 218); // 4
		rsinterface.child(60, c + 84, 234, 97); // 2
		// bottom
		rsinterface.child(61, c + 86, 234, 218); // 5
		rsinterface.child(62, c + 88, 389, 97); // 3
		rsinterface.child(63, c + 90, 389, 218); // 6

		// top item gp
		rsinterface.child(64, c + 81, 77, 121);// 1
		rsinterface.child(65, c + 83, 77, 242);// 4
		rsinterface.child(66, c + 85, 234, 121);// 2
		// bottom name and gp
		rsinterface.child(67, c + 87, 234, 242);// 5
		rsinterface.child(68, c + 89, 387, 121);// 3
		rsinterface.child(69, c + 91, 387, 242);// 6
	}

	public static void castleWars() {
		RSInterface tab = addTabInterface(27955);
		int i = 0;
		String s = "CastleWars/";
		addSprite(29525, s + "Main");
		addHoverButton(29526, s + "basichelmnormal", 0, 37, 75,
				"Buy Basic Decorative helm", 615, 29527, 1);
		addHoveredButton(29527, s + "basichelmhov", 1, 37, 75, 29528);
		addHoverButton(29529, s + "basicplatenormal", 0, 37, 75,
				"Buy Basic Decorative platebody", 615, 29530, 1);
		addHoveredButton(29530, s + "basicplatehov", 1, 37, 75, 29531);
		addHoverButton(29532, s + "basiclegsnormal", 0, 37, 75,
				"Buy Basic Decorative platelegs", 615, 29533, 1);
		addHoveredButton(29533, s + "basiclegshov", 1, 37, 75, 29534);
		addHoverButton(29535, s + "basicshieldnormal", 0, 37, 75,
				"Buy Basic Decorative shield", 615, 29536, 1);
		addHoveredButton(29536, s + "basicshieldhov", 1, 37, 75, 29537);
		addHoverButton(29538, s + "basicswordnormal", 0, 37, 75,
				"Buy Basic Decorative sword", 615, 29539, 1);
		addHoveredButton(29539, s + "basicswordhov", 1, 37, 75, 29540);
		addHoverButton(29541, s + "medhelmnormal", 0, 37, 75,
				"Buy Detailed Decorative helm", 615, 29542, 1);
		addHoveredButton(29542, s + "medhelmhov", 1, 37, 75, 29543);
		addHoverButton(29544, s + "medplatenormal", 0, 37, 75,
				"Buy Detailed Decorative platebody", 615, 29545, 1);
		addHoveredButton(29545, s + "medplatehov", 1, 37, 75, 29546);
		addHoverButton(29547, s + "medlegsnormal", 0, 37, 75,
				"Buy Detailed Decorative platelegs", 615, 29548, 1);
		addHoveredButton(29548, s + "medlegshov", 1, 37, 75, 29549);
		addHoverButton(29550, s + "medshieldnormal", 0, 37, 75,
				"Buy Detailed Decorative shield", 615, 29551, 1);
		addHoveredButton(29551, s + "medshieldhov", 1, 37, 75, 29552);
		addHoverButton(29553, s + "medswordnormal", 0, 37, 75,
				"Buy Detailed Decorative sword", 615, 29554, 1);
		addHoveredButton(29554, s + "medswordhov", 1, 37, 75, 29555);
		addHoverButton(29556, s + "hardhelmnormal", 0, 37, 75,
				"Buy Intricate Decorative helm", 615, 29557, 1);
		addHoveredButton(29557, s + "hardhelmhov", 1, 37, 75, 29558);
		addHoverButton(29559, s + "hardplatenormal", 0, 37, 75,
				"Buy Intricate Decorative platebody", 615, 29560, 1);
		addHoveredButton(29560, s + "hardplatehov", 1, 37, 75, 29561);
		addHoverButton(29562, s + "hardlegsnormal", 0, 37, 75,
				"Buy Intricate Decorative platelegs", 615, 29563, 1);
		addHoveredButton(29563, s + "hardlegshov", 1, 37, 75, 29564);
		addHoverButton(29565, s + "hardshieldnormal", 0, 37, 75,
				"Buy Intricate Decorative shield", 615, 29566, 1);
		addHoveredButton(29566, s + "hardshieldhov", 1, 37, 75, 29567);
		addHoverButton(29568, s + "hardswordnormal", 0, 37, 75,
				"Buy Intricate Decorative sword", 615, 29569, 1);
		addHoveredButton(29569, s + "hardswordhov", 1, 37, 75, 29570);
		addHoverButton(29571, s + "extremehelmnormal", 0, 37, 75,
				"Buy Profround Decorative helm", 615, 29572, 1);
		addHoveredButton(29572, s + "extremehelmhov", 1, 37, 75, 29573);
		addHoverButton(29574, s + "extremeplatenormal", 0, 37, 75,
				"Buy Profround Decorative platebody", 615, 29575, 1);
		addHoveredButton(29575, s + "extremeplatehov", 1, 37, 75, 29576);
		addHoverButton(29577, s + "extremelegsnormal", 0, 37, 75,
				"Buy Profround Decorative platelegs", 615, 29578, 1);
		addHoveredButton(29578, s + "extremelegshov", 1, 37, 75, 29579);
		addHoverButton(29580, s + "extremeshieldnormal", 0, 37, 75,
				"Buy Profround Decorative shield", 615, 29581, 1);
		addHoveredButton(29581, s + "extremeshieldhov", 1, 37, 75, 29582);
		addHoverButton(29583, s + "extremeswordnormal", 0, 37, 75,
				"Buy Profround Decorative sword", 615, 29584, 1);
		addHoveredButton(29584, s + "extremeswordhov", 1, 37, 75, 29585);
		addHoverButton(29586, s + "decbuttonnormal", 0, 144, 30,
				"Decorative Armour", 615, 29587, 1);
		addHoveredButton(29587, s + "decbuttonhover", 1, 144, 30, 29588);
		addHoverButton(29589, s + "consumebuttonnormal", 0, 144, 30,
				"Consumables", 615, 29590, 1);
		addHoveredButton(29590, s + "consumebuttonhover", 1, 144, 30, 29501);
		addHoverButton(29592, s + "miscbuttonnormal", 0, 144, 30,
				"Miscellaneous", 615, 29593, 1);
		addHoveredButton(29593, s + "miscbuttonhover", 1, 144, 30, 29594);
		addHoverButton(29595, s + "close", 0, 16, 16, "Close", 615, 29596, 1);
		addHoveredButton(29596, s + "close", 1, 16, 16, 29597);
		setChildren(49, tab);
		setBounds(29525, 2, 19, i, tab);
		i++;
		setBounds(29526, 77, 90, i, tab);
		i++;
		setBounds(29527, 77, 90, i, tab);
		i++;
		setBounds(29529, 119, 90, i, tab);
		i++;
		setBounds(29530, 119, 90, i, tab);
		i++;
		setBounds(29532, 161, 90, i, tab);
		i++;
		setBounds(29533, 161, 90, i, tab);
		i++;
		setBounds(29535, 203, 90, i, tab);
		i++;
		setBounds(29536, 203, 90, i, tab);
		i++;
		setBounds(29538, 245, 90, i, tab);
		i++;
		setBounds(29539, 245, 90, i, tab);
		i++;
		setBounds(29541, 287, 90, i, tab);
		i++;
		setBounds(29542, 287, 90, i, tab);
		i++;
		setBounds(29544, 329, 90, i, tab);
		i++;
		setBounds(29545, 329, 90, i, tab);
		i++;
		setBounds(29547, 371, 90, i, tab);
		i++;
		setBounds(29548, 371, 90, i, tab);
		i++;
		setBounds(29550, 413, 90, i, tab);
		i++;
		setBounds(29551, 413, 90, i, tab);
		i++;
		setBounds(29553, 455, 90, i, tab);
		i++;
		setBounds(29554, 455, 90, i, tab);
		i++;
		setBounds(29556, 77, 190, i, tab);
		i++;
		setBounds(29557, 77, 190, i, tab);
		i++;
		setBounds(29559, 119, 190, i, tab);
		i++;
		setBounds(29560, 119, 190, i, tab);
		i++;
		setBounds(29562, 161, 190, i, tab);
		i++;
		setBounds(29563, 161, 190, i, tab);
		i++;
		setBounds(29565, 203, 190, i, tab);
		i++;
		setBounds(29566, 203, 190, i, tab);
		i++;
		setBounds(29568, 245, 190, i, tab);
		i++;
		setBounds(29569, 245, 190, i, tab);
		i++;
		setBounds(29571, 287, 190, i, tab);
		i++;
		setBounds(29572, 287, 190, i, tab);
		i++;
		setBounds(29574, 329, 190, i, tab);
		i++;
		setBounds(29575, 329, 190, i, tab);
		i++;
		setBounds(29577, 371, 190, i, tab);
		i++;
		setBounds(29578, 371, 190, i, tab);
		i++;
		setBounds(29580, 413, 190, i, tab);
		i++;
		setBounds(29581, 413, 190, i, tab);
		i++;
		setBounds(29583, 455, 190, i, tab);
		i++;
		setBounds(29584, 455, 190, i, tab);
		i++;
		setBounds(29586, 28, 44, i, tab);
		i++;
		setBounds(29587, 28, 44, i, tab);
		i++;
		setBounds(29589, 185, 44, i, tab);
		i++;
		setBounds(29590, 185, 44, i, tab);
		i++;
		setBounds(29592, 342, 44, i, tab);
		i++;
		setBounds(29593, 342, 44, i, tab);
		i++;
		setBounds(29595, 480, 22, i, tab);
		i++;
		setBounds(29596, 480, 22, i, tab);
		i++;
	}

	public static void castleWars2() {
		RSInterface tab = addTabInterface(27956);
		int i = 0;
		String s = "CastleWars/";
		addSprite(29600, s + "Main");
		addHoverButton(29601, s + "base", 0, 37, 75, "Buy Ballista base", 615,
				29602, 1);
		addHoveredButton(29602, s + "standhover", 1, 37, 75, 29603);
		addHoverButton(29604, s + "boltsack", 0, 37, 75,
				"Buy Ballista bolt stack", 615, 29605, 1);
		addHoveredButton(29605, s + "boltsack", 1, 37, 75, 29606);
		addHoverButton(29607, s + "bow", 0, 37, 75, "Buy Ballista bow", 615,
				29608, 1);
		addHoveredButton(29608, s + "bow", 1, 37, 75, 29609);
		addHoverButton(29610, s + "chamber", 0, 37, 75, "Buy Ballista chamber",
				615, 29611, 1);
		addHoveredButton(29611, s + "chamber", 1, 37, 75, 29612);
		addHoverButton(29613, s + "ammo", 0, 37, 75, "Buy Ballista ammo", 615,
				29614, 1);
		addHoveredButton(29614, s + "ammo", 1, 37, 75, 29615);
		addHoverButton(29616, s + "melee", 0, 37, 75, "Buy Melee potion set",
				615, 29617, 1);
		addHoveredButton(29617, s + "melee", 1, 37, 75, 29618);
		addHoverButton(29619, s + "range", 0, 37, 75, "Buy Ranged potion set",
				615, 29620, 1);
		addHoveredButton(29620, s + "range", 1, 37, 75, 29621);
		addHoverButton(29622, s + "magic", 0, 37, 75, "Buy Magic potion set",
				615, 29623, 1);
		addHoveredButton(29623, s + "mage", 1, 37, 75, 29624);
		addHoverButton(29586, s + "decbuttonnormal", 0, 144, 30,
				"Decorative Armour", 615, 29587, 1);
		addHoveredButton(29587, s + "decbuttonhover", 1, 144, 30, 29588);
		addHoverButton(29589, s + "consumebuttonnormal", 0, 144, 30,
				"Consumables", 615, 29590, 1);
		addHoveredButton(29590, s + "consumebuttonhover", 1, 144, 30, 29501);
		addHoverButton(29592, s + "miscbuttonnormal", 0, 144, 30,
				"Miscellaneous", 615, 29593, 1);
		addHoveredButton(29593, s + "miscbuttonhover", 1, 144, 30, 29594);
		addHoverButton(29595, s + "close", 0, 16, 16, "Close", 615, 29596, 1);
		addHoveredButton(29596, s + "close", 1, 16, 16, 29597);
		setChildren(25, tab);
		setBounds(29600, 2, 19, i, tab);
		i++;
		setBounds(29601, 119, 90, i, tab);
		i++;
		setBounds(29602, 119, 90, i, tab);
		i++;
		setBounds(29604, 161, 90, i, tab);
		i++;
		setBounds(29605, 161, 90, i, tab);
		i++;
		setBounds(29607, 203, 90, i, tab);
		i++;
		setBounds(29608, 203, 90, i, tab);
		i++;
		setBounds(29610, 245, 90, i, tab);
		i++;
		setBounds(29611, 245, 90, i, tab);
		i++;
		setBounds(29613, 287, 90, i, tab);
		i++;
		setBounds(29614, 287, 90, i, tab);
		i++;
		setBounds(29616, 119, 190, i, tab);
		i++;
		setBounds(29617, 119, 190, i, tab);
		i++;
		setBounds(29619, 203, 190, i, tab);
		i++;
		setBounds(29620, 203, 190, i, tab);
		i++;
		setBounds(29622, 287, 190, i, tab);
		i++;
		setBounds(29623, 287, 190, i, tab);
		i++;
		setBounds(29586, 28, 44, i, tab);
		i++;
		setBounds(29587, 28, 44, i, tab);
		i++;
		setBounds(29589, 185, 44, i, tab);
		i++;
		setBounds(29590, 185, 44, i, tab);
		i++;
		setBounds(29592, 342, 44, i, tab);
		i++;
		setBounds(29593, 342, 44, i, tab);
		i++;
		setBounds(29595, 480, 22, i, tab);
		i++;
		setBounds(29596, 480, 22, i, tab);
		i++;
	}

	public static void castleWars3() {
		RSInterface tab = addTabInterface(27957);
		int i = 0;
		String s = "CastleWars/";
		addSprite(29525, s + "Main");
		addHoverButton(29700, s + "saracape", 0, 37, 75, "Buy Saradomin Cloak",
				615, 29701, 1);
		addHoveredButton(29701, s + "saracape", 1, 37, 75, 29702);
		addHoverButton(29703, s + "zamcape", 0, 37, 75, "Buy Zamorak Cloak",
				615, 29704, 1);
		addHoveredButton(29704, s + "zamcape", 1, 37, 75, 29705);
		addHoverButton(29706, s + "sarahood", 0, 37, 75, "Buy Saradomin Hood",
				615, 29707, 1);
		addHoveredButton(29707, s + "sarahood", 1, 37, 75, 29708);
		addHoverButton(29709, s + "zamhood", 0, 37, 75, "Buy Zamorak Hood",
				615, 29710, 1);
		addHoveredButton(29710, s + "zamhood", 1, 37, 75, 29711);
		addHoverButton(29712, s + "flag", 0, 37, 75,
				"Buy Castle Wars flag cape", 615, 29713, 1);
		addHoveredButton(29713, s + "flag", 1, 37, 75, 29714);
		addHoverButton(29715, s + "kill", 0, 37, 75,
				"Buy Castle Wars kills cape", 615, 29716, 1);
		addHoveredButton(29716, s + "kill", 1, 37, 75, 29717);
		addHoverButton(29718, s + "hob", 0, 37, 75,
				"Buy Castle Wars hobbyist cape", 615, 29719, 1);
		addHoveredButton(29719, s + "hob", 1, 37, 75, 29720);
		addHoverButton(29721, s + "nerd", 0, 37, 75,
				"Buy Castle Wars enthusiast cape", 615, 29722, 1);
		addHoveredButton(29722, s + "nerd", 1, 37, 75, 29723);
		addHoverButton(29724, s + "nerdest", 0, 37, 75,
				"Buy Castle Wars professional cape", 615, 29725, 1);
		addHoveredButton(29725, s + "nerdest", 1, 37, 75, 29726);
		addHoverButton(29727, s + "guth", 0, 37, 75, "Buy Guthix halo", 615,
				29728, 1);
		addHoveredButton(29728, s + "guth", 1, 37, 75, 29729);
		addHoverButton(29730, s + "sara", 0, 37, 75, "Buy Saradomin halo", 615,
				29731, 1);
		addHoveredButton(29731, s + "sara", 1, 37, 75, 29732);
		addHoverButton(29733, s + "zammy", 0, 37, 75, "Buy Zamorak halo", 615,
				29734, 1);
		addHoveredButton(29734, s + "zammy", 1, 37, 75, 29735);
		addHoverButton(29736, s + "faith", 0, 37, 75, "Buy Faithful shield",
				615, 29737, 1);
		addHoveredButton(29737, s + "faith", 1, 37, 75, 29738);
		addHoverButton(29739, s + "free", 0, 37, 75, "Castle Wars Handbook",
				615, 29740, 1);
		addHoveredButton(29740, s + "free", 1, 37, 75, 29741);
		addHoverButton(29586, s + "decbuttonnormal", 0, 144, 30,
				"Decorative Armour", 615, 29587, 1);
		addHoveredButton(29587, s + "decbuttonhover", 1, 144, 30, 29588);
		addHoverButton(29589, s + "consumebuttonnormal", 0, 144, 30,
				"Consumables", 615, 29590, 1);
		addHoveredButton(29590, s + "consumebuttonhover", 1, 144, 30, 29501);
		addHoverButton(29592, s + "miscbuttonnormal", 0, 144, 30,
				"Miscellaneous", 615, 29593, 1);
		addHoveredButton(29593, s + "miscbuttonhover", 1, 144, 30, 29594);
		addHoverButton(29595, s + "close", 0, 16, 16, "Close", 615, 29596, 1);
		addHoveredButton(29596, s + "close", 1, 16, 16, 29597);
		setChildren(37, tab);
		setBounds(29525, 2, 19, i, tab);
		i++;
		setBounds(29700, 117, 90, i, tab);
		i++;
		setBounds(29701, 117, 90, i, tab);
		i++;
		setBounds(29703, 159, 90, i, tab);
		i++;
		setBounds(29704, 159, 90, i, tab);
		i++;
		setBounds(29706, 201, 90, i, tab);
		i++;
		setBounds(29707, 201, 90, i, tab);
		i++;
		setBounds(29709, 243, 90, i, tab);
		i++;
		setBounds(29710, 243, 90, i, tab);
		i++;
		setBounds(29712, 285, 90, i, tab);
		i++;
		setBounds(29713, 285, 90, i, tab);
		i++;
		setBounds(29715, 327, 90, i, tab);
		i++;
		setBounds(29716, 327, 90, i, tab);
		i++;
		setBounds(29718, 369, 90, i, tab);
		i++;
		setBounds(29719, 369, 90, i, tab);
		i++;
		setBounds(29721, 411, 90, i, tab);
		i++;
		setBounds(29722, 411, 90, i, tab);
		i++;
		setBounds(29724, 453, 90, i, tab);
		i++;
		setBounds(29725, 453, 90, i, tab);
		i++;
		setBounds(29727, 117, 190, i, tab);
		i++;
		setBounds(29728, 117, 190, i, tab);
		i++;
		setBounds(29730, 201, 190, i, tab);
		i++;
		setBounds(29731, 201, 190, i, tab);
		i++;
		setBounds(29733, 285, 190, i, tab);
		i++;
		setBounds(29734, 285, 190, i, tab);
		i++;
		setBounds(29736, 369, 190, i, tab);
		i++;
		setBounds(29737, 369, 190, i, tab);
		i++;
		setBounds(29739, 453, 190, i, tab);
		i++;
		setBounds(29740, 453, 190, i, tab);
		i++;
		setBounds(29586, 28, 44, i, tab);
		i++;
		setBounds(29587, 28, 44, i, tab);
		i++;
		setBounds(29589, 185, 44, i, tab);
		i++;
		setBounds(29590, 185, 44, i, tab);
		i++;
		setBounds(29592, 342, 44, i, tab);
		i++;
		setBounds(29593, 342, 44, i, tab);
		i++;
		setBounds(29595, 480, 22, i, tab);
		i++;
		setBounds(29596, 480, 22, i, tab);
		i++;
	}

	public static void priceChecker(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(43933);
		addSprite(18245, 1, "Interfaces/Checker/CHECK");
		addPriceChecker(18246);

		addHover(18247, 3, 0, 18248, 1, "Bank/BANK", 17, 17, "Close Window");
		addHovered(18248, 2, "Bank/BANK", 17, 17, 18249);

		rsi.totalChildren(69);
		rsi.child(0, 18245, 10, 20);// was 10 so + 10
		rsi.child(1, 18246, 100, 56);
		rsi.child(2, 18247, 472, 23);
		rsi.child(3, 18248, 472, 23);
		addText(18350, "Total value:", tda, 0, 0xFFFFFF, false, true);
		rsi.child(4, 18350, 225, 295); // Open Text
		addText(18351, "0", tda, 0, 0xFFFFFF, true, true);
		rsi.child(5, 18351, 251, 306);
		addText(18352, "", tda, 0, 0xFFFFFF, false, true);
		rsi.child(6, 18352, 120, 150);
		addText(18353, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(7, 18353, 120, 85);
		addText(18354, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(8, 18354, 120, 95);
		addText(18355, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(9, 18355, 120, 105);
		addText(18356, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(10, 18356, 190, 85);
		addText(18357, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(11, 18357, 190, 95);
		addText(18358, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(12, 18358, 190, 105);
		addText(18359, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(13, 18359, 260, 85);
		addText(18360, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(14, 18360, 260, 95);
		addText(18361, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(15, 18361, 260, 105);
		addText(18362, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(16, 18362, 330, 85);
		addText(18363, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(17, 18363, 330, 95);
		addText(18364, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(18, 18364, 330, 105);
		addText(18365, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(19, 18365, 400, 85);
		addText(18366, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(20, 18366, 400, 95);
		addText(18367, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(21, 18367, 400, 105);
		addText(18368, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(22, 18368, 120, 145);
		addText(18369, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(23, 18369, 120, 155);
		addText(18370, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(24, 18370, 120, 165);
		addText(18371, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(25, 18371, 190, 145);
		addText(18372, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(26, 18372, 190, 155);
		addText(18373, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(27, 18373, 190, 165);
		addText(18374, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(28, 18374, 260, 145);
		addText(18375, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(29, 18375, 260, 155);
		addText(18376, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(30, 18376, 260, 165);
		addText(18377, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(31, 18377, 330, 145);
		addText(18378, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(32, 18378, 330, 155);
		addText(18379, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(33, 18379, 330, 165);
		addText(18380, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(34, 18380, 400, 145);
		addText(18381, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(35, 18381, 400, 155);
		addText(18382, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(36, 18382, 400, 165);
		addText(18383, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(37, 18383, 120, 205);
		addText(18384, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(38, 18384, 120, 215);
		addText(18385, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(39, 18385, 120, 225);
		addText(18386, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(40, 18386, 190, 205);
		addText(18387, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(41, 18387, 190, 215);
		addText(18388, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(42, 18388, 190, 225);
		addText(18389, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(43, 18389, 260, 205);
		addText(18390, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(44, 18390, 260, 215);
		addText(18391, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(45, 18391, 260, 225);
		addText(18392, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(46, 18392, 330, 205);
		addText(18393, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(47, 18393, 330, 215);
		addText(18394, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(48, 18394, 330, 225);
		addText(18395, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(49, 18395, 400, 205);
		addText(18396, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(50, 18396, 400, 215);
		addText(18397, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(51, 18397, 400, 225);
		addText(18398, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(52, 18398, 120, 260);
		addText(18399, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(53, 18399, 120, 270);
		addText(18400, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(54, 18400, 120, 280);
		addText(18401, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(55, 18401, 190, 260);
		addText(18402, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(56, 18402, 190, 270);
		addText(18403, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(57, 18403, 190, 280);
		addText(18404, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(58, 18404, 260, 260);
		addText(18405, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(59, 18405, 260, 270);
		addText(18406, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(60, 18406, 260, 280);
		addText(18407, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(61, 18407, 330, 260);
		addText(18408, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(62, 18408, 330, 270);
		addText(18409, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(63, 18409, 330, 280);
		addText(18410, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(64, 18410, 400, 260);
		addText(18411, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(65, 18411, 400, 270);
		addText(18412, "", tda, 0, 0xFFFFFF, true, true);
		rsi.child(66, 18412, 400, 280);

		addHover(18413, 1, 0, 18414, 17, "Bank/BANK", 35, 25,
				"Deposit Inventory");
		addHovered(18414, 18, "Bank/BANK", 35, 25, 18415);

		rsi.child(67, 18413, 455, 294);
		rsi.child(68, 18414, 455, 294);

		addText(18416, "600", tda, 0, 0xFFFFFF, true, true);
		addText(18417, "0", tda, 0, 0xFFFFFF, true, true);
		addText(18418, "0", tda, 0, 0xFFFFFF, true, true);
	}

	public static void addPriceChecker(int index) {
		RSInterface rsi = interfaceCache[index] = new RSInterface();
		rsi.actions = new String[10];
		rsi.spritesX = new int[20];
		rsi.invStackSizes = new int[25];
		rsi.inv = new int[30];
		rsi.spritesY = new int[20];
		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];
		rsi.actions[0] = "Take 1";
		rsi.actions[1] = "Take 5";
		rsi.actions[2] = "Take 10";
		rsi.actions[3] = "Take All";
		rsi.actions[4] = "Take X";
		rsi.centerText = true;
		rsi.filled = false;
		rsi.dragDeletes = false;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.aBoolean259 = true;
		rsi.textShadow = false;
		rsi.invSpritePadX = 40;
		rsi.invSpritePadY = 28;
		rsi.height = 5;
		rsi.width = 5;
		rsi.parentID = 18246;
		rsi.id = 4393;
		rsi.type = 2;
	}

	public static void Bank(TextDrawingArea[] wid) {
		RSInterface Interface = addTabInterface(5292);
		setChildren(38, Interface);
		addSprite(5293, 0, "Bank/BANK");
		setBounds(5293, 13, 13, 0, Interface);
		addHover(5384, 3, 0, 5380, 1, "Bank/BANK", 17, 17, "Close Window");
		addHovered(5380, 2, "Bank/BANK", 17, 17, 5379);
		setBounds(5384, 476, 16, 3, Interface);
		setBounds(5380, 476, 16, 4, Interface);
		addHover(5294, 4, 0, 5295, 3, "Bank/BANK", 114, 25, "Set A Bank PIN");
		addHovered(5295, 4, "Bank/BANK", 114, 25, 5296);
		setBounds(5294, 110, 285, 5, Interface);
		setBounds(5295, 110, 285, 6, Interface);
		addBankHover(22000, 4, 22001, 5, 8, "Bank/BANK", 35, 25, 304, 1,
				"Swap Withdraw Mode", 22002, 7, 6, "Bank/BANK", 22003,
				"Switch to insert items \nmode",
				"Switch to swap items \nmode.", 12, 20);
		setBounds(22000, 25, 285, 7, Interface);
		setBounds(22001, 10, 225, 8, Interface);
		addBankHover(22004, 4, 22005, 13, 15, "Bank/BANK", 35, 25, 0, 1,
				"Search", 22006, 14, 16, "Bank/BANK", 22007,
				"Click here to search your \nbank",
				"Click here to search your \nbank", 12, 20);
		setBounds(22004, 65, 285, 9, Interface);
		setBounds(22005, 50, 225, 10, Interface);
		addBankHover(22008, 4, 22009, 9, 11, "Bank/BANK", 35, 25, 115, 1,
				"Withdraw", 22010, 10, 12, "Bank/BANK", 22011,
				"Switch to Interfaces/Notes/NOTE withdrawal \nmode",
				"Switch to item withdrawal \nmode", 12, 20);
		setBounds(22008, 240, 285, 11, Interface);
		setBounds(22009, 225, 225, 12, Interface);
		addBankHover1(22012, 5, 22013, 17, "Bank/BANK", 35, 25,
				"Deposit carried tems", 22014, 18, "Bank/BANK", 22015,
				"Empty your backpack into\nyour bank", 0, 20);
		setBounds(22012, 375, 285, 13, Interface);
		setBounds(22013, 360, 225, 14, Interface);
		addBankHover1(22016, 5, 22017, 19, "Bank/BANK", 35, 25,
				"Deposit worn items", 22018, 20, "Bank/BANK", 22019,
				"Empty the items your are\nwearing into your bank", 0, 20);
		setBounds(22016, 415, 285, 15, Interface);
		setBounds(22017, 400, 225, 16, Interface);
		addBankHover1(22020, 5, 22021, 21, "Bank/BANK", 35, 25,
				"Deposit beast of burden inventory.", 22022, 22, "Bank/BANK",
				22023, "Empty your BoB's inventory\ninto your bank", 0, 20);
		setBounds(22020, 455, 285, 17, Interface);
		setBounds(22021, 440, 225, 18, Interface);
		setBounds(5383, 100, 15, 1, Interface);
		setBounds(5385, -4, 74, 2, Interface);
		addButton(22024, 0, "BANK/TAB",
				"Click here to view the full contents of your bank");
		setBounds(22024, 22, 36, 19, Interface);
		addButton(22025, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22025, 70, 36, 20, Interface);
		addButton(22026, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22026, 118, 36, 21, Interface);
		addButton(22027, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22027, 166, 36, 22, Interface);
		addButton(22028, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22028, 214, 36, 23, Interface);
		addButton(22029, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22029, 262, 36, 24, Interface);
		addButton(22030, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22030, 310, 36, 25, Interface);
		addButton(22031, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22031, 358, 36, 26, Interface);
		addButton(22032, 4, "BANK/TAB", "Drag an item here to create a new tab");
		setBounds(22032, 406, 36, 27, Interface);
		addText(22033, "134", wid, 0, 0xB4965A, true, false);
		setBounds(22033, 473, 42, 28, Interface);
		addText(22034, "496", wid, 0, 0xB4965A, true, false);
		setBounds(22034, 473, 57, 29, Interface);
		addBankItem(22035, false);
		setBounds(22035, 77, 39, 30, Interface);
		addBankItem(22036, false);
		setBounds(22036, 125, 39, 31, Interface);
		addBankItem(22037, false);
		setBounds(22037, 173, 39, 32, Interface);
		addBankItem(22038, false);
		setBounds(22038, 221, 39, 33, Interface);
		addBankItem(22039, false);
		setBounds(22039, 269, 39, 34, Interface);
		addBankItem(22040, false);
		setBounds(22040, 317, 39, 35, Interface);
		addBankItem(22041, false);
		setBounds(22041, 365, 39, 36, Interface);
		addBankItem(22042, false);
		setBounds(22042, 413, 39, 37, Interface);

		/*
		 * addText(22051, "Tab 1", wid, 0, 16750623, true, false);
		 * setBounds(22051, 47, 80, 39, Interface); addSprite(22050,
		 * "Bank/SEP 1"); setBounds(22050, 35, 92, 38, Interface);
		 */

		addText(27000, "0", 0xFF981F, false, true, 52, wid, 1);
		addText(27001, "0", 0xFF981F, false, true, 52, wid, 1);
		addText(27002, "0", 0xFF981F, false, true, 52, wid, 1);
		addText(27003, "0", 0xFF981F, false, true, 52, wid, 1);

		Interface = interfaceCache[5385];
		Interface.height = 206;
		Interface.width = 480;
		Interface = interfaceCache[5382];
		Interface.width = 10;
		Interface.invSpritePadX = 12;
		Interface.height = 35;
	}

	public static void addBankHover(int interfaceID, int actionType,
			int hoverid, int spriteId, int spriteId2, String NAME, int Width,
			int Height, int configFrame, int configId, String Tooltip,
			int hoverId2, int hoverSpriteId, int hoverSpriteId2,
			String hoverSpriteName, int hoverId3, String hoverDisabledText,
			String hoverEnabledText, int X, int Y) {
		RSInterface hover = addTabInterface(interfaceID);
		hover.id = interfaceID;
		hover.parentID = interfaceID;
		hover.type = 5;
		hover.atActionType = actionType;
		hover.contentType = 0;
		hover.opacity = 0;
		hover.mOverInterToTrigger = hoverid;
		hover.disabledSprite = imageLoader(spriteId, NAME);
		hover.enabledSprite = imageLoader(spriteId2, NAME);
		hover.width = Width;
		hover.tooltip = Tooltip;
		hover.height = Height;
		hover.valueCompareType = new int[1];
		hover.requiredValues = new int[1];
		hover.valueCompareType[0] = 1;
		hover.requiredValues[0] = configId;
		hover.valueIndexArray = new int[1][3];
		hover.valueIndexArray[0][0] = 5;
		hover.valueIndexArray[0][1] = configFrame;
		hover.valueIndexArray[0][2] = 0;
		hover = addTabInterface(hoverid);
		hover.parentID = hoverid;
		hover.id = hoverid;
		hover.type = 0;
		hover.atActionType = 0;
		hover.width = 550;
		hover.height = 334;
		hover.isMouseoverTriggered = true;
		hover.mOverInterToTrigger = -1;
		addSprite(hoverId2, hoverSpriteId, hoverSpriteId2, hoverSpriteName,
				configId, configFrame);
		addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverEnabledText,
				configId, configFrame);
		setChildren(2, hover);
		setBounds(hoverId2, 15, 60, 0, hover);
		setBounds(hoverId3, X, Y, 1, hover);
	}

	public static void addBankHover1(int interfaceID, int actionType,
			int hoverid, int spriteId, String NAME, int Width, int Height,
			String Tooltip, int hoverId2, int hoverSpriteId,
			String hoverSpriteName, int hoverId3, String hoverDisabledText,
			int X, int Y) {
		RSInterface hover = addTabInterface(interfaceID);
		hover.id = interfaceID;
		hover.parentID = interfaceID;
		hover.type = 5;
		hover.atActionType = actionType;
		hover.contentType = 0;
		hover.opacity = 0;
		hover.mOverInterToTrigger = hoverid;
		hover.disabledSprite = imageLoader(spriteId, NAME);
		hover.width = Width;
		hover.tooltip = Tooltip;
		hover.height = Height;
		hover = addTabInterface(hoverid);
		hover.parentID = hoverid;
		hover.id = hoverid;
		hover.type = 0;
		hover.atActionType = 0;
		hover.width = 550;
		hover.height = 334;
		hover.isMouseoverTriggered = true;
		hover.mOverInterToTrigger = -1;
		addSprite(hoverId2, hoverSpriteId, hoverSpriteId, hoverSpriteName, 0, 0);
		addHoverBox(hoverId3, interfaceID, hoverDisabledText,
				hoverDisabledText, 0, 0);
		setChildren(2, hover);
		setBounds(hoverId2, 15, 60, 0, hover);
		setBounds(hoverId3, X, Y, 1, hover);
	}

	public static void notesTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(17350);
		addSprite(17351, 0, "Interfaces/Notes/NOTE");
		addHoverButton(17352, "Interfaces/Notes/NOTE", 1, 200, 30, "Add note",
				-1, 17353, 1);
		addHoveredButton(17353, "Interfaces/Notes/NOTE", 2, 200, 30, 17354);
		addHoverButton(17355, "Interfaces/Notes/NOTE", 3, 200, 30,
				"Delete all", -1, 17356, 1);
		addHoveredButton(17356, "Interfaces/Notes/NOTE", 4, 200, 30, 17357);
		addText(13800, "No notes", tda, 0, 0xffffff, false, true);
		addText(17801, "", tda, 0, 0xff981f, false, true);
		addText(17812, "", tda, 0, 0xff981f, false, true);
		addText(17813, "", tda, 0, 0xff981f, false, true);
		addText(17814, "", tda, 0, 0xff981f, false, true);
		tab.totalChildren(6);
		tab.child(0, 17351, 0, 0);
		tab.child(1, 17352, 8, 2);
		tab.child(2, 17353, 8, 2);
		tab.child(3, 17355, 165, 237);
		tab.child(4, 17356, 165, 237);
		tab.child(5, 13800, 68, 78);
		tab = addTabInterface(14000);
		tab.width = 474;
		tab.height = 213;
		tab.scrollMax = 305;
		for (int i = 14001; i <= 14030; i++) {
			addText(i, "", tda, 1, 0xffffff, false, true);
		}
		tab.totalChildren(30);
		int Child = 0;
		int Y = 5;
		for (int i = 14001; i <= 14030; i++) {
			tab.child(Child, i, 248, Y);
			Child++;
			Y += 13;
		}
	}

	public static void addHoverBox(int id, int ParentID, String text,
			String text2, int configId, int configFrame) {
		RSInterface rsi = addTabInterface(id);
		rsi.id = id;
		rsi.parentID = ParentID;
		rsi.type = 8;
		rsi.aString228 = text;
		rsi.message = text2;
		rsi.valueCompareType = new int[1];
		rsi.requiredValues = new int[1];
		rsi.valueCompareType[0] = 1;
		rsi.requiredValues[0] = configId;
		rsi.valueIndexArray = new int[1][3];
		rsi.valueIndexArray[0][0] = 5;
		rsi.valueIndexArray[0][1] = configFrame;
		rsi.valueIndexArray[0][2] = 0;
	}

	public static void addHover(int i, int aT, int cT, int hoverid, int sId,
			String NAME, int W, int H, String tip) {
		RSInterface hover = addTabInterface(i);
		hover.id = i;
		hover.parentID = i;
		hover.type = 5;
		hover.atActionType = aT;
		hover.contentType = cT;
		hover.mOverInterToTrigger = hoverid;
		hover.disabledSprite = imageLoader(sId, NAME);
		hover.enabledSprite = imageLoader(sId, NAME);
		hover.width = W;
		hover.height = H;
		hover.tooltip = tip;
	}

	public static void addHovered(int i, int j, String imageName, int w, int h,
			int IMAGEID) {
		RSInterface hover = addTabInterface(i);
		hover.parentID = i;
		hover.id = i;
		hover.type = 0;
		hover.atActionType = 0;
		hover.width = w;
		hover.height = h;
		hover.isMouseoverTriggered = true;
		hover.mOverInterToTrigger = -1;
		addSprite(IMAGEID, j, imageName);
		setChildren(1, hover);
		setBounds(IMAGEID, 0, 0, 0, hover);
	}

	public static void addSprite(int ID, int i, int i2, String name,
			int configId, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.id = ID;
		Tab.parentID = ID;
		Tab.type = 5;
		Tab.atActionType = 0;
		Tab.contentType = 0;
		Tab.width = 512;
		Tab.height = 334;
		Tab.opacity = (byte) 0;
		Tab.mOverInterToTrigger = -1;
		Tab.valueCompareType = new int[1];
		Tab.requiredValues = new int[1];
		Tab.valueCompareType[0] = 1;
		Tab.requiredValues[0] = configId;
		Tab.valueIndexArray = new int[1][3];
		Tab.valueIndexArray[0][0] = 5;
		Tab.valueIndexArray[0][1] = configFrame;
		Tab.valueIndexArray[0][2] = 0;
		Tab.disabledSprite = imageLoader(i, name);
		Tab.enabledSprite = imageLoader(i2, name);
	}

	public static TextDrawingArea[] fonts;

	public static void unpack(StreamLoader streamloader,
			TextDrawingArea atextdrawingarea[], StreamLoader streamloader1) {
		fonts = atextdrawingarea;
		aMRUNodes_238 = new Cache(50000);
		Stream stream = new Stream(streamloader.getDataForName("data"));
		int i = -1;
		int j = stream.getUnsignedShort();
		interfaceCache = new RSInterface[j + 50000];
		do {
			if (stream.currentOffset >= stream.buffer.length) {
				break;
			}
			int k = stream.getUnsignedShort();
			if (k == 65535) {
				i = stream.getUnsignedShort();
				k = stream.getUnsignedShort();
			}
			RSInterface rsinterface = interfaceCache[k] = new RSInterface();
			rsinterface.id = k;
			rsinterface.parentID = i;
			rsinterface.type = stream.getUnsigned();
			rsinterface.atActionType = stream.getUnsigned();
			rsinterface.contentType = stream.getUnsignedShort();
			rsinterface.width = stream.getUnsignedShort();
			rsinterface.height = stream.getUnsignedShort();
			rsinterface.opacity = (byte) stream.getUnsigned();
			rsinterface.mOverInterToTrigger = stream.getUnsigned();
			if (rsinterface.mOverInterToTrigger != 0) {
				rsinterface.mOverInterToTrigger = (rsinterface.mOverInterToTrigger - 1 << 8)
						+ stream.getUnsigned();
			} else {
				rsinterface.mOverInterToTrigger = -1;
			}
			int l = stream.getUnsigned();
			if (l > 0) {
				rsinterface.valueCompareType = new int[l];
				rsinterface.requiredValues = new int[l];
				for (int i1 = 0; i1 < l; i1++) {
					rsinterface.valueCompareType[i1] = stream.getUnsigned();
					rsinterface.requiredValues[i1] = stream.getUnsignedShort();
				}

			}
			int j1 = stream.getUnsigned();
			if (j1 > 0) {
				rsinterface.valueIndexArray = new int[j1][];
				for (int k1 = 0; k1 < j1; k1++) {
					int j3 = stream.getUnsignedShort();
					rsinterface.valueIndexArray[k1] = new int[j3];
					for (int l4 = 0; l4 < j3; l4++) {
						rsinterface.valueIndexArray[k1][l4] = stream
								.getUnsignedShort();
					}

				}

			}
			if (rsinterface.type == 0) {
				rsinterface.drawsTransparent = false;
				rsinterface.scrollMax = stream.getUnsignedShort();
				rsinterface.isMouseoverTriggered = stream.getUnsigned() == 1;
				int l1 = stream.getUnsignedShort();
				rsinterface.children = new int[l1];
				rsinterface.childX = new int[l1];
				rsinterface.childY = new int[l1];
				for (int k3 = 0; k3 < l1; k3++) {
					rsinterface.children[k3] = stream.getUnsignedShort();
					rsinterface.childX[k3] = stream.getSignedShort();
					rsinterface.childY[k3] = stream.getSignedShort();
				}

			}
			if (rsinterface.type == 1) {
				stream.getUnsignedShort();
				stream.getUnsigned();
			}
			if (rsinterface.type == 2) {
				rsinterface.inv = new int[rsinterface.width
						* rsinterface.height];
				rsinterface.invStackSizes = new int[rsinterface.width
						* rsinterface.height];
				rsinterface.aBoolean259 = stream.getUnsigned() == 1;
				rsinterface.isInventoryInterface = stream.getUnsigned() == 1;
				rsinterface.usableItemInterface = stream.getUnsigned() == 1;
				rsinterface.dragDeletes = stream.getUnsigned() == 1;
				rsinterface.invSpritePadX = stream.getUnsigned();
				rsinterface.invSpritePadY = stream.getUnsigned();
				rsinterface.spritesX = new int[20];
				rsinterface.spritesY = new int[20];
				rsinterface.sprites = new Sprite[20];
				for (int i2 = 0; i2 < 20; i2++) {
					int l3 = stream.getUnsigned();
					if (l3 != 1) {
						continue;
					}
					rsinterface.spritesX[i2] = stream.getSignedShort();
					rsinterface.spritesY[i2] = stream.getSignedShort();
					String s1 = stream.readString();
					if (streamloader1 != null && s1.length() > 0) {
						int i5 = s1.lastIndexOf(",");
						rsinterface.sprites[i2] = method207(
								Integer.parseInt(s1.substring(i5 + 1)),
								streamloader1, s1.substring(0, i5));
					}
				}

				rsinterface.actions = new String[5];
				for (int j2 = 0; j2 < 5; j2++) {
					rsinterface.actions[j2] = stream.readString();
					if (rsinterface.actions[j2].length() == 0) {
						rsinterface.actions[j2] = null;
					}
					if (rsinterface.parentID == 1644) {
						rsinterface.actions[2] = "Operate";
					}
					if (rsinterface.parentID == 3824) {
						rsinterface.actions[4] = "Buy 100";
					}
					/*
					 * try {
					 * if(rsinterface.actions[2].toLowerCase().contains("sell"))
					 * System.out.println(rsinterface.parentID); } catch
					 * (Exception e){ e.printStackTrace(); }
					 */
					if (rsinterface.parentID == 3822) {
						rsinterface.actions[3] = "Sell 100";
					}
				}

			}
			if (rsinterface.type == 3) {
				rsinterface.filled = stream.getUnsigned() == 1;
			}
			if (rsinterface.type == 4 || rsinterface.type == 1) {
				rsinterface.centerText = stream.getUnsigned() == 1;
				int k2 = stream.getUnsigned();
				if (atextdrawingarea != null) {
					rsinterface.textDrawingAreas = atextdrawingarea[k2];
				}
				rsinterface.textShadow = stream.getUnsigned() == 1;
			}
			if (rsinterface.type == 4) {
				rsinterface.message = stream.readString().replaceAll(
						"RuneScape", "Zarpor");
				rsinterface.aString228 = stream.readString();
			}
			if (rsinterface.type == 1 || rsinterface.type == 3
					|| rsinterface.type == 4) {
				rsinterface.textColor = stream.getInt();
			}
			if (rsinterface.type == 3 || rsinterface.type == 4) {
				rsinterface.anInt219 = stream.getInt();
				rsinterface.anInt216 = stream.getInt();
				rsinterface.anInt239 = stream.getInt();
			}
			if (rsinterface.type == 5) {
				rsinterface.drawsTransparent = false;
				String s = stream.readString();
				if (streamloader1 != null && s.length() > 0) {
					int i4 = s.lastIndexOf(",");
					rsinterface.disabledSprite = method207(
							Integer.parseInt(s.substring(i4 + 1)),
							streamloader1, s.substring(0, i4));
				}
				s = stream.readString();
				if (streamloader1 != null && s.length() > 0) {
					int j4 = s.lastIndexOf(",");
					rsinterface.enabledSprite = method207(
							Integer.parseInt(s.substring(j4 + 1)),
							streamloader1, s.substring(0, j4));
				}
			}
			if (rsinterface.type == 6) {
				int l2 = stream.getUnsigned();
				if (l2 != 0) {
					rsinterface.anInt233 = 1;
					rsinterface.mediaID = (l2 - 1 << 8) + stream.getUnsigned();
				}
				l2 = stream.getUnsigned();
				if (l2 != 0) {
					rsinterface.anInt255 = 1;
					rsinterface.anInt256 = (l2 - 1 << 8) + stream.getUnsigned();
				}
				l2 = stream.getUnsigned();
				if (l2 != 0) {
					rsinterface.anInt257 = (l2 - 1 << 8) + stream.getUnsigned();
				} else {
					rsinterface.anInt257 = -1;
				}
				l2 = stream.getUnsigned();
				if (l2 != 0) {
					rsinterface.anInt258 = (l2 - 1 << 8) + stream.getUnsigned();
				} else {
					rsinterface.anInt258 = -1;
				}
				rsinterface.modelZoom = stream.getUnsignedShort();
				rsinterface.modelRotation1 = stream.getUnsignedShort();
				rsinterface.modelRotation2 = stream.getUnsignedShort();
			}
			if (rsinterface.type == 7) {
				rsinterface.inv = new int[rsinterface.width
						* rsinterface.height];
				rsinterface.invStackSizes = new int[rsinterface.width
						* rsinterface.height];
				rsinterface.centerText = stream.getUnsigned() == 1;
				int i3 = stream.getUnsigned();
				if (atextdrawingarea != null) {
					rsinterface.textDrawingAreas = atextdrawingarea[i3];
				}
				rsinterface.textShadow = stream.getUnsigned() == 1;
				rsinterface.textColor = stream.getInt();
				rsinterface.invSpritePadX = stream.getSignedShort();
				rsinterface.invSpritePadY = stream.getSignedShort();
				rsinterface.isInventoryInterface = stream.getUnsigned() == 1;
				rsinterface.actions = new String[5];
				for (int k4 = 0; k4 < 5; k4++) {
					rsinterface.actions[k4] = stream.readString();
					if (rsinterface.actions[k4].length() == 0) {
						rsinterface.actions[k4] = null;
					}
				}

			}
			if (rsinterface.atActionType == 2 || rsinterface.type == 2) {
				rsinterface.selectedActionName = stream.readString();
				rsinterface.spellName = stream.readString();
				rsinterface.spellUsableOn = stream.getUnsignedShort();
			}
			if (rsinterface.type == 8) {
				rsinterface.message = stream.readString();
			}
			if (rsinterface.atActionType == 1 || rsinterface.atActionType == 4
					|| rsinterface.atActionType == 5
					|| rsinterface.atActionType == 6) {
				rsinterface.tooltip = stream.readString();
				if (rsinterface.tooltip.length() == 0) {
					if (rsinterface.atActionType == 1) {
						rsinterface.tooltip = "Ok";
					}
					if (rsinterface.atActionType == 4) {
						rsinterface.tooltip = "Select";
					}
					if (rsinterface.atActionType == 5) {
						rsinterface.tooltip = "Select";
					}
					if (rsinterface.atActionType == 6) {
						rsinterface.tooltip = "Continue";
					}
				}
			}
		} while (true);
		aClass44 = streamloader;
		pouches(atextdrawingarea);
		scrolls(atextdrawingarea);
		prayerTab(atextdrawingarea);
		emoteTab();
		reportAbuse1(atextdrawingarea);
		reportAbuse2(atextdrawingarea);
		Bank(atextdrawingarea);
		notesTab(atextdrawingarea);
		priceChecker(atextdrawingarea);
		castleWars();
		castleWars2();
		castleWars3();
		pkInterface(atextdrawingarea);
		skillTab602(atextdrawingarea);
		newTrade(atextdrawingarea);
		Shop(atextdrawingarea);
		bobInterface(atextdrawingarea);
		otherInvInterface(atextdrawingarea);
		profileInterface(atextdrawingarea);
		PestControl(atextdrawingarea);
		simpleText(atextdrawingarea);

		roomChooser();
		furnitureChooser(atextdrawingarea);
		constructionWaiting();

		grandExchangeMain(atextdrawingarea);
		grandExchangeBuy(atextdrawingarea);
		grandExchangeSell(atextdrawingarea);

		classSelect2(atextdrawingarea);
		classSelect3(atextdrawingarea);
		classSelect4(atextdrawingarea);
		classSelect5(atextdrawingarea);
		classSelect6(atextdrawingarea);

		graphicsOption(atextdrawingarea);
		minigame(atextdrawingarea);
		boss(atextdrawingarea);
		duelScreen(atextdrawingarea);
		wilderness(atextdrawingarea);
		training(atextdrawingarea);
		itemsOnDeathDATA(atextdrawingarea);
		itemsOnDeath(atextdrawingarea);
		optionTab(atextdrawingarea);
		quickPrayers(atextdrawingarea);
		prayerMenu(atextdrawingarea);
		quickCurses(atextdrawingarea);
		clanChatTab(atextdrawingarea);
		editClan(atextdrawingarea);
		Sidebar0(atextdrawingarea);
		friendsTab(atextdrawingarea);
		SummonTab(atextdrawingarea);
		ignoreTab(atextdrawingarea);
		EquipmentTab(atextdrawingarea);
		equipmentScreen(atextdrawingarea);
		Pestpanel(atextdrawingarea);
		Pestpanel2(atextdrawingarea);
		magicTab(atextdrawingarea);
		ancientMagicTab(atextdrawingarea);
		configureLunar(atextdrawingarea);
		ColorChanger(atextdrawingarea);
		Curses(atextdrawingarea);
		SettingsTab(atextdrawingarea);
		ConOptionsTab(atextdrawingarea);
		constructLunar();
		QuestTab(atextdrawingarea);
		infoTab(atextdrawingarea);
		achievementTab(atextdrawingarea);
		actionTab(atextdrawingarea, 0);
		Welcome(atextdrawingarea);
		GodWars(atextdrawingarea);
		// aMRUNodes_238 = null;
	}

	public static void roomChooser() {
		RSInterface tab = addTabInterface(28643);
		addHDSprite(28644, 3, -1);
		addButton(28645, -1, "", 16, 16, "Close", 5);
		setChildren(3, tab);
		int BASEX = 24, BASEY = 18;
		setBoundry(0, 28644, BASEX + 0, BASEY + 0, tab);
		setBoundry(1, 28645, BASEX + 431, BASEY + 5, tab);
		setBoundry(2, 28646, BASEX + 51, BASEY + 60, tab);

		tab = addTabInterface(28646);
		int totalRooms = 23;
		tab.scrollMax = totalRooms * 65;
		tab.width = 330;
		tab.height = 220;
		String[] names = new String[] { "Parlour: Lvl 1", "Garden: Lvl 1",
				"Kitchen: lvl 5", "Dining room: lvl 10", "Workshop: lvl 15",
				"Bedroom: Lvl 20", "Hall - Skill Trophies: Lvl 25",
				"Games Room: Lvl 30", "Combat room: Lvl 32",
				"Hall - Quest trophies: Lvl 35", "Menagarie: Lvl 37",
				"Study: Lvl 40", "Costume room: Lvl 42", "Chapel: Lvl 45",
				"Portal chamber: Lvl 50", "Formal garden: Lvl 55",
				"Throne room: Lvl 60", "Oubliette: Lvl 65",
				"Dungeon - corridor: Lvl 70", "Dungeon - junction: Lvl 70",
				"Dungeon - stairs: Lvl 70", "Dungeon - pit: Lvl 70",
				"Treasure room: Lvl 75" };
		int[] money = new int[] { 1000, 1000, 5000, 5000, 10000, 10000, 15000,
				25000, 25000, 25000, 30000, 50000, 50000, 50000, 100000, 75000,
				150000, 150000, 7500, 7500, 7500, 10000, 250000 };
		int y = 8, x = 4, bounds = 0, id = 28647;
		setChildren(totalRooms * 4, tab);
		for (int i = 0; i < names.length; i++) {
			addRectangleClickable(id, 0, 0x333333, false, 238, 61);
			setBoundry(bounds++, id++, x, y, tab);
			addHDSprite(id, i + 4, -1);
			setBoundry(bounds++, id++, x + 13, y + 5, tab);

			addText(id, names[i], names[i], 0xCCCCFF, 0xCCCCFF, false, true, 0,
					1);
			setBoundry(bounds++, id++, x + 78, y + 22, tab);
			addText(id, money[i] + " Coins", money[i] + " Coins", 0xC80000,
					0x00C800, false, true, 0, 1);
			interfaceCache[id].valueIndexArray = new int[1][];
			interfaceCache[id].requiredValues = new int[1];
			interfaceCache[id].valueCompareType = new int[1];
			interfaceCache[id].valueIndexArray[0] = new int[4];
			interfaceCache[id].valueIndexArray[0][0] = 4;
			interfaceCache[id].valueIndexArray[0][1] = 3214;
			interfaceCache[id].valueIndexArray[0][2] = 995;
			interfaceCache[id].valueIndexArray[0][3] = 0;
			interfaceCache[id].requiredValues[0] = money[i];
			interfaceCache[id].valueCompareType[0] = 10;
			setBoundry(bounds++, id++, x + 240, y + 25, tab);
			y += 64;

		}
	}

	public static void addText(int i, String disabledText, String enabledText,
			int disabledColor, int enabledColor, boolean centered,
			boolean shadow, int hoverType, int fontId) {
		try {
			RSInterface rsinterface = addTabInterface(i);
			rsinterface.parentID = i;
			rsinterface.id = i;
			rsinterface.type = 4;
			rsinterface.atActionType = 0;
			rsinterface.width = 0;
			rsinterface.height = 0;
			rsinterface.contentType = 0;
			rsinterface.opacity = 0;
			rsinterface.mOverInterToTrigger = hoverType;
			rsinterface.centerText = centered;
			rsinterface.textShadow = shadow;
			rsinterface.textDrawingAreas = RSInterface.fonts[fontId];
			rsinterface.message = disabledText;
			rsinterface.aString228 = enabledText;
			// rsinterface.disabledcolor = disabledColor;
			rsinterface.textColor = enabledColor;
		} catch (Exception e) {
		}
	}

	public static void addRectangle(int id, int opacity, int color,
			boolean filled, int width, int height) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.textColor = color;
		tab.filled = filled;
		tab.id = id;
		tab.parentID = id;
		tab.type = 3;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) opacity;
		tab.width = width;
		tab.height = height;
	}

	public static void addRectangleClickable(int id, int opacity, int color,
			boolean filled, int width, int height) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.textColor = color;
		tab.filled = filled;
		tab.id = id;
		tab.parentID = id;
		tab.type = 3;
		tab.atActionType = 5;
		tab.contentType = 0;
		tab.opacity = (byte) opacity;
		tab.width = width;
		tab.height = height;
		tab.tooltip = "Select";
	}

	public static void addFornitureX(int i) {
		RSInterface rsi = interfaceCache[i] = new RSInterface();
		rsi.id = i;
		rsi.parentID = i;
		rsi.type = 5;
		rsi.atActionType = 0;
		rsi.contentType = 0;
		rsi.opacity = 0;
		rsi.enabledSprite = imageLoader(2, "Construction/i");
		;
		rsi.width = 512;
		rsi.height = 334;
		setSelectableValues(i, 1000 + i - 38324, 1);
	}

	public static void setSelectableValues(int frame, int configId,
			int requiredValue) {
		RSInterface rsi = interfaceCache[frame];
		rsi.valueCompareType = new int[] { 5 };
		rsi.requiredValues = new int[] { requiredValue };
		rsi.valueIndexArray = new int[1][3];
		rsi.valueIndexArray[0][0] = 5;
		rsi.valueIndexArray[0][1] = configId;
		rsi.valueIndexArray[0][2] = 0;
	}

	public static void setSelectableValuesSwitchable(int frame, int configId,
			int requiredValue) {
		RSInterface rsi = interfaceCache[frame];
		rsi.valueCompareType = new int[] { 1 };
		rsi.requiredValues = new int[] { requiredValue };
		rsi.valueIndexArray = new int[1][3];
		rsi.valueIndexArray[0][0] = 5;
		rsi.valueIndexArray[0][1] = configId;
		rsi.valueIndexArray[0][2] = 0;
	}

	public static void addFornitureModels(int i) {
		RSInterface Tab = interfaceCache[i] = new RSInterface();
		Tab.actions = new String[5];
		Tab.actions[0] = "Select";
		Tab.spritesX = new int[20];
		Tab.invStackSizes = new int[30];
		Tab.inv = new int[30];
		Tab.spritesY = new int[20];
		Tab.children = new int[0];
		Tab.childX = new int[0];
		Tab.childY = new int[0];
		Tab.filled = false;
		Tab.dragDeletes = false;
		Tab.usableItemInterface = false;
		Tab.isInventoryInterface = false;
		Tab.textShadow = false;
		Tab.invSpritePadX = 164;
		Tab.invSpritePadY = 37;
		Tab.type = 2;
		Tab.parentID = 38272;
		Tab.id = 38274;
		Tab.width = 2;
		Tab.height = 4;
	}

	public static void furnitureChooser(TextDrawingArea[] wid) {
		RSInterface rsi = addTabInterface(38272);
		setChildren(59, rsi);
		addHDSprite(38273, 1, -1);
		setBounds(38273, 0, 0, 0, rsi);
		addFornitureModels(38274);
		setBounds(38274, 82, 56, 1, rsi);

		addText(38275, "Name1", wid, 0, 0xff981f, false);
		setBounds(38275, 140, 56, 2, rsi);
		addText(38276, "Req1.1", wid, 0, 0xccccff, false);
		setBounds(38276, 140, 67, 3, rsi);
		addText(38277, "Req1.2", wid, 0, 0xccccff, false);
		setBounds(38277, 140, 76, 4, rsi);
		addText(38278, "Req1.3", wid, 0, 0xccccff, false);
		setBounds(38278, 140, 85, 5, rsi);
		addText(38279, "Req1.4", wid, 0, 0xccccff, false);
		setBounds(38279, 140, 94, 6, rsi);
		addText(38280, "lvl1", wid, 0, 0xff981f, false);
		setBounds(38280, 88, 89, 7, rsi);

		addText(38281, "Name2", wid, 0, 0xff981f, false);
		setBounds(38281, 336, 56, 8, rsi);
		addText(38282, "req2.1", wid, 0, 0xccccff, false);
		setBounds(38282, 336, 67, 9, rsi);
		addText(38283, "req2.2", wid, 0, 0xccccff, false);
		setBounds(38283, 336, 76, 10, rsi);
		addText(38284, "req2.3", wid, 0, 0xccccff, false);
		setBounds(38284, 336, 85, 11, rsi);
		addText(38285, "req2.4", wid, 0, 0xccccff, false);
		setBounds(38285, 336, 94, 12, rsi);
		addText(38286, "lvl2", wid, 0, 0xff981f, false);
		setBounds(38286, 284, 89, 13, rsi);

		addText(38287, "Name3", wid, 0, 0xff981f, false);
		setBounds(38287, 140, 126, 14, rsi);
		addText(38288, "Req3.1", wid, 0, 0xccccff, false);
		setBounds(38288, 140, 135, 15, rsi);
		addText(38289, "Req3.2", wid, 0, 0xccccff, false);
		setBounds(38289, 140, 144, 16, rsi);
		addText(38290, "Req3.3", wid, 0, 0xccccff, false);
		setBounds(38290, 140, 153, 17, rsi);
		addText(38291, "Req3.4", wid, 0, 0xccccff, false);
		setBounds(38291, 140, 162, 18, rsi);
		addText(38292, "lvl3", wid, 0, 0xff981f, false);
		setBounds(38292, 88, 158, 19, rsi);

		addText(38293, "Name4", wid, 0, 0xff981f, false);
		setBounds(38293, 336, 126, 20, rsi);
		addText(38294, "Req4.1", wid, 0, 0xccccff, false);
		setBounds(38294, 336, 135, 21, rsi);
		addText(38295, "Req4.2", wid, 0, 0xccccff, false);
		setBounds(38295, 336, 144, 22, rsi);
		addText(38296, "Req4.3", wid, 0, 0xccccff, false);
		setBounds(38296, 336, 153, 23, rsi);
		addText(38297, "Req4.4", wid, 0, 0xccccff, false);
		setBounds(38297, 336, 162, 24, rsi);
		addText(38298, "lvl4", wid, 0, 0xff981f, false);
		setBounds(38298, 284, 158, 25, rsi);

		addText(38299, "Name5", wid, 0, 0xff981f, false);
		setBounds(38299, 140, 196, 26, rsi);
		addText(38300, "req5.1", wid, 0, 0xccccff, false);
		setBounds(38300, 140, 205, 27, rsi);
		addText(38301, "req5.2", wid, 0, 0xccccff, false);
		setBounds(38301, 140, 214, 28, rsi);
		addText(38302, "req5.3", wid, 0, 0xccccff, false);
		setBounds(38302, 140, 223, 29, rsi);
		addText(38303, "req5.4", wid, 0, 0xccccff, false);
		setBounds(38303, 140, 232, 30, rsi);
		addText(38304, "lvl5", wid, 0, 0xff981f, false);
		setBounds(38304, 89, 228, 31, rsi);

		addText(38305, "Name6", wid, 0, 0xff981f, false);
		setBounds(38305, 336, 196, 32, rsi);
		addText(38306, "req6.1", wid, 0, 0xccccff, false);
		setBounds(38306, 336, 205, 33, rsi);
		addText(38307, "req6.2", wid, 0, 0xccccff, false);
		setBounds(38307, 336, 214, 34, rsi);
		addText(38308, "req6.3", wid, 0, 0xccccff, false);
		setBounds(38308, 336, 223, 35, rsi);
		addText(38309, "req6.4", wid, 0, 0xccccff, false);
		setBounds(38309, 336, 232, 36, rsi);
		addText(38310, "lvl6", wid, 0, 0xff981f, false);
		setBounds(38310, 284, 228, 37, rsi);

		addText(38311, "Name7", wid, 0, 0xff981f, false);
		setBounds(38311, 140, 265, 38, rsi);
		addText(38312, "req7.1", wid, 0, 0xccccff, false);
		setBounds(38312, 140, 274, 39, rsi);
		addText(38313, "req7.2", wid, 0, 0xccccff, false);
		setBounds(38313, 140, 283, 40, rsi);
		addText(38314, "req7.3", wid, 0, 0xccccff, false);
		setBounds(38314, 140, 292, 41, rsi);
		addText(38315, "req7.4", wid, 0, 0xccccff, false);
		setBounds(38315, 140, 301, 42, rsi);
		addText(38316, "lvl7", wid, 0, 0xff981f, false);
		setBounds(38316, 89, 297, 43, rsi);

		addText(38317, "Name8", wid, 0, 0xff981f, false);
		setBounds(38317, 336, 265, 44, rsi);
		addText(38318, "req8.1", wid, 0, 0xccccff, false);
		setBounds(38318, 336, 274, 45, rsi);
		addText(38319, "req8.2", wid, 0, 0xccccff, false);
		setBounds(38319, 336, 283, 46, rsi);
		addText(38320, "req8.3", wid, 0, 0xccccff, false);
		setBounds(38320, 336, 292, 47, rsi);
		addText(38321, "req8.4", wid, 0, 0xccccff, false);
		setBounds(38321, 336, 301, 48, rsi);
		addText(38322, "lvl8", wid, 0, 0xff981f, false);
		setBounds(38322, 284, 297, 49, rsi);
		addButton(38323, -1, "", 16, 16, "Close", 5);
		setBounds(38323, 460, 25, 50, rsi);

		addFornitureX(38324);
		setBounds(38324, 85, 58, 51, rsi);
		addFornitureX(38325);
		setBounds(38325, 282, 58, 52, rsi);
		addFornitureX(38326);
		setBounds(38326, 85, 127, 53, rsi);
		addFornitureX(38327);
		setBounds(38327, 281, 124, 54, rsi);
		addFornitureX(38328);
		setBounds(38328, 79, 194, 55, rsi);
		addFornitureX(38329);
		setBounds(38329, 278, 192, 56, rsi);
		addFornitureX(38330);
		setBounds(38330, 82, 262, 57, rsi);
		addFornitureX(38331);
		setBounds(38331, 276, 267, 58, rsi);
	}

	public static void constructionWaiting() {
		RSInterface tab = addTabInterface(28640);
		addBackground(28641, 0, 0x000000);
		addHDSprite(28642, 0, -1);
		setChildren(2, tab);
		setBoundry(0, 28641, 0, 0, tab);
		setBoundry(1, 28642, 0, 0, tab);

	}

	public static void addBackground(int id, int opacity, int color) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.textColor = color;
		tab.id = id;
		tab.parentID = id;
		tab.type = 11;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) opacity;
	}

	public static final void wilderness(TextDrawingArea[] tda) {
		RSInterface rsinterface = addTabInterface(45600);
		addText(45601, "P'King Teleport", 0xff9b00, false, true, 52, tda, 2);
		addHoverButton(45602, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Mage Bank", -1, 45603, 1);
		addHoveredButton(45603, "Interfaces/Minigame/Hover", 2, 172, 24, 45604);
		addHoverButton(45618, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Level 13 Wild", -1, 45619, 1);
		addHoveredButton(45619, "Interfaces/Minigame/Hover", 2, 172, 24, 45620);
		addHoverButton(45621, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Level 18 Wild", -1, 45622, 1);
		addHoveredButton(45622, "Interfaces/Minigame/Hover", 2, 172, 24, 45623);
		addHoverButton(45624, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Edgeville", -1, 45625, 1);
		addHoveredButton(45625, "Interfaces/Minigame/Hover", 2, 172, 24, 45626);
		addHoverButton(45627, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Ardougne Fun Pvp", -1, 45628, 1);
		addHoveredButton(45628, "Interfaces/Minigame/Hover", 2, 172, 24, 45629);
		addHoverButton(45633, "Interfaces/Minigame/Back", 0, 16, 16, "Back",
				-1, 45634, 1);
		addHoveredButton(45634, "Interfaces/Minigame/Back", 1, 16, 16, 45635);
		addSprite(45605, 1, "Interfaces/Minigame/Pk");
		addSprite(45606, 1, "Interfaces/Minigame/Pk");
		addSprite(45607, 1, "Interfaces/Minigame/Pk");
		addSprite(45608, 1, "Interfaces/Minigame/Pk");
		addSprite(45609, 1, "Interfaces/Minigame/Pk");
		addSprite(45611, 1, "Interfaces/Minigame/Background");
		addText(45612, "Mage Bank", 0xd67b29, true, true, 52, tda, 2);
		addText(45613, "Level 13 Wild", 0xd67b29, true, true, 52, tda, 2);
		addText(45614, "Level 18 Wild", 0xd67b29, true, true, 52, tda, 2);
		addText(45615, "Edgeville", 0xd67b29, true, true, 52, tda, 2);
		addText(45616, "Ardougne Fun Pvp", 0xd67b29, true, true, 52, tda, 2);
		byte childAmount = 24;
		int indexChild = 0;
		setChildren(childAmount, rsinterface);
		setBounds(45611, -1, 26, indexChild, rsinterface);
		indexChild++;
		setBounds(45601, 33, 7, indexChild, rsinterface);
		indexChild++;
		setBounds(45602, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45603, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45612, 80, 39, indexChild, rsinterface);
		indexChild++;
		setBounds(45618, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45619, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45613, 80, 76, indexChild, rsinterface);
		indexChild++;
		setBounds(45621, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45622, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45614, 80, 113, indexChild, rsinterface);
		indexChild++;
		setBounds(45624, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45625, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45615, 80, 150, indexChild, rsinterface);
		indexChild++;
		setBounds(45627, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45628, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45616, 80, 187, indexChild, rsinterface);
		indexChild++;
		setBounds(45605, 148, 34, indexChild, rsinterface);
		indexChild++;
		setBounds(45606, 148, 71, indexChild, rsinterface);
		indexChild++;
		setBounds(45607, 148, 108, indexChild, rsinterface);
		indexChild++;
		setBounds(45608, 148, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45609, 148, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45633, 10, 6, indexChild, rsinterface);
		indexChild++;
		setBounds(45634, 10, 6, indexChild, rsinterface);
		indexChild++;
	}

	public static final void boss(TextDrawingArea[] tda) {
		RSInterface rsinterface = addTabInterface(45500);
		addText(45501, "Boss Teleport", 0xff9b00, false, true, 52, tda, 2);
		addHoverButton(45502, "Interfaces/Minigame/Hover", 0, 172, 24,
				"God Wars", -1, 45503, 1);
		addHoveredButton(45503, "Interfaces/Minigame/Hover", 3, 172, 24, 45504);
		addHoverButton(45518, "Interfaces/Minigame/Hover", 0, 172, 24,
				"King Black Dragon", -1, 45519, 1);
		addHoveredButton(45519, "Interfaces/Minigame/Hover", 3, 172, 24, 45520);
		addHoverButton(45521, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Dagannoth Kings", -1, 45522, 1);
		addHoveredButton(45522, "Interfaces/Minigame/Hover", 3, 172, 24, 45523);
		addHoverButton(45524, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Chaos Elemental", -1, 45525, 1);
		addHoveredButton(45525, "Interfaces/Minigame/Hover", 3, 172, 24, 45526);
		addHoverButton(45527, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Corporal Beast", -1, 45528, 1);
		addHoveredButton(45528, "Interfaces/Minigame/Hover", 3, 172, 24, 45529);
		addHoverButton(45533, "Interfaces/Minigame/Back", 0, 16, 16, "Back",
				-1, 45534, 1);
		addHoveredButton(45534, "Interfaces/Minigame/Back", 1, 16, 16, 45535);
		addSprite(45505, 1, "Interfaces/Minigame/Godwars");
		addSprite(45506, 1, "Interfaces/Minigame/Kbd");
		addSprite(45507, 1, "Interfaces/Minigame/Dagganoths");
		addSprite(45508, 1, "Interfaces/Minigame/Chaos");
		addSprite(45509, 1, "Interfaces/Minigame/Corporeal");
		addSprite(45511, 1, "Interfaces/Minigame/Background");
		addText(45512, "Godwars", 0xd67b29, true, true, 52, tda, 2);
		addText(45513, "King Black Dragon", 0xd67b29, true, true, 52, tda, 2);
		addText(45514, "Dagannoth Kings", 0xd67b29, true, true, 52, tda, 2);
		addText(45515, "Chaos Elemental", 0xd67b29, true, true, 52, tda, 2);
		addText(45516, "Corporal Beast", 0xd67b29, true, true, 52, tda, 2);
		byte childAmount = 24;
		int indexChild = 0;
		setChildren(childAmount, rsinterface);
		setBounds(45511, -1, 26, indexChild, rsinterface);
		indexChild++;
		setBounds(45501, 33, 7, indexChild, rsinterface);
		indexChild++;
		setBounds(45502, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45503, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45512, 80, 39, indexChild, rsinterface);
		indexChild++;
		setBounds(45518, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45519, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45513, 80, 76, indexChild, rsinterface);
		indexChild++;
		setBounds(45521, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45522, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45514, 80, 113, indexChild, rsinterface);
		indexChild++;
		setBounds(45524, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45525, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45515, 80, 150, indexChild, rsinterface);
		indexChild++;
		setBounds(45527, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45528, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45516, 80, 187, indexChild, rsinterface);
		indexChild++;
		setBounds(45505, 148, 33, indexChild, rsinterface);
		indexChild++;
		setBounds(45506, 148, 70, indexChild, rsinterface);
		indexChild++;
		setBounds(45507, 148, 104, indexChild, rsinterface);
		indexChild++;
		setBounds(45508, 148, 144, indexChild, rsinterface);
		indexChild++;
		setBounds(45509, 148, 179, indexChild, rsinterface);
		indexChild++;
		setBounds(45533, 10, 6, indexChild, rsinterface);
		indexChild++;
		setBounds(45534, 10, 6, indexChild, rsinterface);
		indexChild++;
	}

	public static void duelScreen(TextDrawingArea[] tda) {
		RSInterface Interface = addTabInterface(6575);
		setChildren(83, Interface);
		addSprite(6576, 0, "Duel/DUEL");
		addHover(6667, 1, 0, 25202, 1, "Duel/DUEL", 100, 24, "Accept Stake");
		addHovered(25202, 2, "Duel/DUEL", 100, 24, 25201);
		addHover(6668, 1, 0, 25205, 3, "Duel/DUEL", 100, 24, "Decline Stake");
		addHovered(25205, 4, "Duel/DUEL", 100, 24, 25204);
		// addHover(6664, 1, 0, 25209, 7, "Duel/DUEL", 172, 20,
		// "Previous Options");
		addHovered(25209, 8, "Duel/DUEL", 172, 20, 25208);
		addText(6671, "Opponent: ", tda, 1, 0xff9b00, false, true);
		addText(6844, "Opponent's Level: ", tda, 1, 0xff9b00, false, true);
		setBounds(6576, 0, 10, 0, Interface);
		setBounds(5384, 485, 19, 1, Interface);
		setBounds(5380, 485, 19, 2, Interface);
		setBounds(6665, 8, 33, 3, Interface);
		setBounds(6666, 8, 190, 4, Interface);
		setBounds(13813, 243, 48, 5, Interface);
		setBounds(13814, 202, 87, 6, Interface);
		setBounds(13815, 284, 87, 7, Interface);
		setBounds(13816, 243, 87, 8, Interface);
		setBounds(13817, 187, 126, 9, Interface);
		setBounds(13818, 243, 126, 10, Interface);
		setBounds(13819, 299, 126, 11, Interface);
		setBounds(13820, 243, 166, 12, Interface);
		setBounds(13822, 243, 206, 13, Interface);
		setBounds(13823, 187, 206, 14, Interface);
		setBounds(13821, 299, 206, 15, Interface);
		setBounds(13824, 189, 88, 16, Interface);
		setBounds(13825, 245, 50, 17, Interface);
		setBounds(13826, 204, 89, 18, Interface);
		setBounds(13827, 286, 89, 19, Interface);
		setBounds(13828, 245, 89, 20, Interface);
		setBounds(13829, 189, 128, 21, Interface);
		setBounds(13830, 245, 128, 22, Interface);
		setBounds(13831, 301, 128, 23, Interface);
		setBounds(13832, 245, 168, 24, Interface);
		setBounds(13833, 189, 208, 25, Interface);
		setBounds(13834, 245, 208, 26, Interface);
		setBounds(13835, 301, 208, 27, Interface);
		setBounds(6667, 220, 254, 28, Interface);
		setBounds(25202, 220, 254, 29, Interface);
		setBounds(6668, 366, 254, 30, Interface);
		setBounds(25205, 366, 254, 31, Interface);
		// setBounds(6664, 344, 229, 32, Interface);
		setBounds(25209, 344, 229, 32, Interface);
		setBounds(6684, 240, 285, 33, Interface);
		// equipment text
		setBounds(13836, 130, 290, 34, Interface);
		setBounds(13838, 120, 290, 35, Interface);
		setBounds(13842, 120, 290, 36, Interface);
		setBounds(13840, 120, 290, 37, Interface);
		setBounds(13844, 120, 290, 38, Interface);
		setBounds(13846, 130, 290, 39, Interface);
		setBounds(13848, 130, 290, 40, Interface);
		setBounds(13850, 130, 290, 41, Interface);
		setBounds(13852, 120, 290, 42, Interface);
		setBounds(13854, 120, 290, 43, Interface);
		setBounds(13856, 120, 290, 44, Interface);
		// top text
		setBounds(6671, 181, 19, 45, Interface);
		setBounds(6844, 350, 19, 46, Interface);
		// options
		setBounds(6725, 350, 42, 47, Interface);
		setBounds(6726, 350, 59, 48, Interface);
		setBounds(6727, 350, 76, 49, Interface);
		setBounds(670, 350, 93, 50, Interface);
		setBounds(6721, 350, 110, 51, Interface);
		setBounds(6728, 350, 127, 52, Interface);
		setBounds(6729, 350, 144, 53, Interface);
		setBounds(6730, 350, 161, 54, Interface);
		setBounds(6722, 350, 178, 55, Interface);
		setBounds(6732, 350, 195, 56, Interface);
		setBounds(7816, 350, 212, 57, Interface);
		// option text next to checkbox
		setBounds(6698, 380, 42, 58, Interface);
		setBounds(6699, 380, 59, 59, Interface);
		setBounds(6697, 380, 76, 60, Interface);
		setBounds(669, 380, 93, 61, Interface);
		setBounds(6696, 380, 110, 62, Interface);
		setBounds(6701, 380, 127, 63, Interface);
		setBounds(6702, 380, 144, 64, Interface);
		setBounds(6703, 380, 161, 65, Interface);
		setBounds(6704, 380, 178, 66, Interface);
		setBounds(6731, 380, 195, 67, Interface);
		setBounds(7817, 380, 212, 68, Interface);
		// option text
		setBounds(8259, 140, 290, 69, Interface);
		setBounds(8261, 140, 290, 70, Interface);
		setBounds(8263, 140, 290, 71, Interface);
		setBounds(8265, 140, 290, 72, Interface);
		setBounds(8267, 140, 290, 73, Interface);
		setBounds(8269, 140, 290, 74, Interface);
		setBounds(8271, 140, 290, 75, Interface);
		setBounds(8273, 140, 290, 76, Interface);
		setBounds(8275, 140, 290, 77, Interface);
		setBounds(8277, 140, 290, 78, Interface);
		setBounds(8279, 140, 290, 79, Interface);
		setBounds(8281, 140, 290, 80, Interface);
		setBounds(8283, 140, 290, 81, Interface);
		setBounds(8285, 140, 290, 82, Interface);
		Interface = interfaceCache[6665];
		setChildren(1, Interface);
		Interface.height = 132;
		Interface.width = 153;
		setBounds(6669, 15, 5, 0, Interface);
		Interface = interfaceCache[6666];
		setChildren(1, Interface);
		Interface.height = 125;
		Interface.width = 153;
		setBounds(6670, 15, 5, 0, Interface);
	}

	public static void duelScreen2(TextDrawingArea[] tda) {
		RSInterface Interface = addTabInterface(6575);
		setChildren(84, Interface);
		addSprite(6576, 0, "Duel/DUEL");
		addHover(6667, 1, 0, 25202, 1, "Duel/DUEL", 100, 24, "Accept Stake");
		addHovered(25202, 2, "Duel/DUEL", 100, 24, 25201);
		addHover(6668, 1, 0, 25205, 3, "Duel/DUEL", 100, 24, "Decline Stake");
		addHovered(25205, 4, "Duel/DUEL", 100, 24, 25204);
	}

	public static final void minigame(TextDrawingArea[] tda) {
		RSInterface rsinterface = addTabInterface(45200);
		addText(45201, "Minigames Teleport", 0xff9b00, false, true, 52, tda, 2);
		addHoverButton(45202, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Duel Arena", -1, 45203, 1);
		addHoveredButton(45203, "Interfaces/Minigame/Hover", 4, 172, 24, 45204);
		addHoverButton(45218, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Barrows", -1, 45219, 1);
		addHoveredButton(45219, "Interfaces/Minigame/Hover", 4, 172, 24, 45220);
		addHoverButton(45221, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Pest Control", -1, 45222, 1);
		addHoveredButton(45222, "Interfaces/Minigame/Hover", 4, 172, 24, 45223);
		addHoverButton(45224, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Tzhaar", -1, 45225, 1);
		addHoveredButton(45225, "Interfaces/Minigame/Hover", 4, 172, 24, 45226);
		addHoverButton(45227, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Warriors Guild", -1, 45228, 1);
		addHoveredButton(45228, "Interfaces/Minigame/Hover", 4, 172, 24, 45229);
		addHoverButton(45233, "Interfaces/Minigame/Back", 0, 16, 16, "Back",
				-1, 45234, 1);
		addHoveredButton(45234, "Interfaces/Minigame/Back", 1, 16, 16, 45235);
		addSprite(45205, 1, "Interfaces/Minigame/DuelArena");
		addSprite(45206, 1, "Interfaces/Minigame/Barrows");
		addSprite(45207, 1, "Interfaces/Minigame/PestControl");
		addSprite(45208, 1, "Interfaces/Minigame/Tzhaar");
		addSprite(45209, 1, "Interfaces/Minigame/Warriors");
		addSprite(45211, 1, "Interfaces/Minigame/Background");
		addText(45212, "Duel Arena", 0xd67b29, true, true, 52, tda, 2);
		addText(45213, "Barrows", 0xd67b29, true, true, 52, tda, 2);
		addText(45214, "Pest Control", 0xd67b29, true, true, 52, tda, 2);
		addText(45215, "Tzhaar", 0xd67b29, true, true, 52, tda, 2);
		addText(45216, "Warriors Guild", 0xd67b29, true, true, 52, tda, 2);
		byte childAmount = 24;
		int indexChild = 0;
		setChildren(childAmount, rsinterface);
		setBounds(45211, 0, 26, indexChild, rsinterface);
		indexChild++;
		setBounds(45201, 33, 7, indexChild, rsinterface);
		indexChild++;
		setBounds(45202, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45203, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45212, 80, 39, indexChild, rsinterface);
		indexChild++;
		setBounds(45218, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45219, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45213, 80, 76, indexChild, rsinterface);
		indexChild++;
		setBounds(45221, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45222, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45214, 80, 113, indexChild, rsinterface);
		indexChild++;
		setBounds(45224, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45225, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45215, 80, 150, indexChild, rsinterface);
		indexChild++;
		setBounds(45227, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45228, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45216, 80, 187, indexChild, rsinterface);
		indexChild++;
		setBounds(45205, 148, 33, indexChild, rsinterface);
		indexChild++;
		setBounds(45206, 148, 70, indexChild, rsinterface);
		indexChild++;
		setBounds(45207, 148, 104, indexChild, rsinterface);
		indexChild++;
		setBounds(45208, 148, 140, indexChild, rsinterface);
		indexChild++;
		setBounds(45209, 148, 179, indexChild, rsinterface);
		indexChild++;
		setBounds(45233, 10, 6, indexChild, rsinterface);
		indexChild++;
		setBounds(45234, 10, 6, indexChild, rsinterface);
		indexChild++;
	}

	public static final void training(TextDrawingArea[] tda) {
		RSInterface rsinterface = addTabInterface(45300);
		addText(45301, "Training Teleport", 0xff9b00, false, true, 52, tda, 2);
		addHoverButton(45302, "Interfaces/Minigame/Hover", 0, 172, 24,
				"RockCrabs", -1, 45303, 1);
		addHoveredButton(45303, "Interfaces/Minigame/Hover", 5, 172, 24, 45304);
		addHoverButton(45318, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Taverly Dung", -1, 45319, 1);
		addHoveredButton(45319, "Interfaces/Minigame/Hover", 5, 172, 24, 45320);
		addHoverButton(45321, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Brimhaven Dung", -1, 45322, 1);
		addHoveredButton(45322, "Interfaces/Minigame/Hover", 5, 172, 24, 45323);
		addHoverButton(45324, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Slayer Tower", -1, 45325, 1);
		addHoveredButton(45325, "Interfaces/Minigame/Hover", 5, 172, 24, 45326);
		addHoverButton(45327, "Interfaces/Minigame/Hover", 0, 172, 24,
				"Hill Giants", -1, 45328, 1);
		addHoveredButton(45328, "Interfaces/Minigame/Hover", 5, 172, 24, 45329);
		addHoverButton(45333, "Interfaces/Minigame/Back", 0, 16, 16, "Back",
				-1, 45334, 1);
		addHoveredButton(45334, "Interfaces/Minigame/Back", 1, 16, 16, 45335);
		addSprite(45305, 1, "Interfaces/Minigame/Crabs");
		addSprite(45306, 1, "Interfaces/Minigame/Taverly");
		addSprite(45307, 1, "Interfaces/Minigame/brimhaven");
		addSprite(45308, 1, "Interfaces/Minigame/Slayer");
		addSprite(45309, 1, "Interfaces/Minigame/HillGiants");
		addSprite(45311, 1, "Interfaces/Minigame/Background");
		addText(45312, "RockCrabs", 0xd67b29, true, true, 52, tda, 2);
		addText(45313, "Taverly Dung", 0xd67b29, true, true, 52, tda, 2);
		addText(45314, "Brimhaven Dung", 0xd67b29, true, true, 52, tda, 2);
		addText(45315, "Slayer Tower", 0xd67b29, true, true, 52, tda, 2);
		addText(45316, "Hill Giants", 0xd67b29, true, true, 52, tda, 2);
		byte childAmount = 24;
		int indexChild = 0;
		setChildren(childAmount, rsinterface);
		setBounds(45311, 0, 26, indexChild, rsinterface);
		indexChild++;
		setBounds(45301, 33, 7, indexChild, rsinterface);
		indexChild++;
		setBounds(45302, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45303, 8, 35, indexChild, rsinterface);
		indexChild++;
		setBounds(45312, 80, 39, indexChild, rsinterface);
		indexChild++;
		setBounds(45318, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45319, 8, 72, indexChild, rsinterface);
		indexChild++;
		setBounds(45313, 80, 76, indexChild, rsinterface);
		indexChild++;
		setBounds(45321, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45322, 8, 109, indexChild, rsinterface);
		indexChild++;
		setBounds(45314, 80, 113, indexChild, rsinterface);
		indexChild++;
		setBounds(45324, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45325, 8, 146, indexChild, rsinterface);
		indexChild++;
		setBounds(45315, 80, 150, indexChild, rsinterface);
		indexChild++;
		setBounds(45327, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45328, 8, 183, indexChild, rsinterface);
		indexChild++;
		setBounds(45316, 80, 187, indexChild, rsinterface);
		indexChild++;
		setBounds(45305, 148, 33, indexChild, rsinterface);
		indexChild++;
		setBounds(45306, 148, 70, indexChild, rsinterface);
		indexChild++;
		setBounds(45307, 148, 104, indexChild, rsinterface);
		indexChild++;
		setBounds(45308, 148, 140, indexChild, rsinterface);
		indexChild++;
		setBounds(45309, 148, 179, indexChild, rsinterface);
		indexChild++;
		setBounds(45333, 10, 6, indexChild, rsinterface);
		indexChild++;
		setBounds(45334, 10, 6, indexChild, rsinterface);
		indexChild++;
	}

	/*
	 * +602's Skill interface.
	 */

	// public static TextDrawingArea[] fonts;

	public static void skillTab602(TextDrawingArea[] tda) {
		RSInterface skill = addInterface(3917);
		addText(27203, "99", 0xFFFF00, false, true, -1, tda, 0);
		addText(27204, "99", 0xFFFF00, false, true, -1, tda, 0);
		addText(27205, "99", 0xFFFF00, false, true, -1, tda, 0);
		addText(27206, "99", 0xFFFF00, false, true, -1, tda, 0);
		int[] logoutID = { 2450, 2451, 2452 };
		int[] logoutID2 = { 2458 };
		for (int i : logoutID) {
			RSInterface Logout = interfaceCache[i];
			Logout.textColor = 0xFF981F;
			Logout.contentType = 0;
		}
		for (int i : logoutID2) {
			RSInterface Logout = interfaceCache[i];
			Logout.contentType = 0;
		}
		skill.totalChildren(4);
		skill.child(0, 27203, 158, 175);
		skill.child(1, 27204, 171, 186);
		skill.child(2, 27205, 158, 203);
		skill.child(3, 27206, 171, 214);
		String[] spriteNames = { "Attack", "HP", "Mine", "Strength", "Agility",
				"Smith", "Defence", "Herblore", "Fish", "Range", "Thief",
				"Cook", "Prayer", "Craft", "Fire", "Mage", "Fletch", "Wood",
				"Rune", "Slay", "Farm", "Construction", "Hunter", "Summon" };// "Dungeon"
		int[] buttons = { 8654, 8655, 8656, 8657, 8658, 8659, 8660, 8861, 8662,
				8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672,
				12162, 13928, 27123, 27124, 27125 };// 27126
		int[] hovers = { 4040, 4076, 4112, 4046, 4082, 4118, 4052, 4088, 4124,
				4058, 4094, 4130, 4064, 4100, 4136, 4070, 4106, 4142, 4160,
				2832, 13917, 19005, 19006, 19007 };// 19008
		/*
		 * int[][] text = { { 4004, 4005 }, { 4016, 4017 }, { 4028, 4029 }, {
		 * 4006, 4007 }, { 4018, 4019 }, { 4030, 4031 }, { 4008, 4009 }, { 4020,
		 * 4021 }, { 4032, 4033 }, { 4010, 4011 }, { 4022, 4023 }, { 4034, 4035
		 * }, { 4012, 4013 }, { 4024, 4025 }, { 4036, 4037 }, { 4014, 4015 }, {
		 * 4026, 4027 }, { 4038, 4039 }, { 4152, 4153 }, { 12166, 12167 }, {
		 * 13926, 13927 }, { 18000, 18001 }, { 18166, 18170 }, { 18167, 18171 },
		 * { 18168, 18172 } };
		 */
		int[][] text = { { 4004, 4005 }, { 4016, 4017 }, { 4028, 4029 },
				{ 4006, 4007 }, { 4018, 4019 }, { 4030, 4031 }, { 4008, 4009 },
				{ 4020, 4021 }, { 4032, 4033 }, { 4010, 4011 }, { 4022, 4023 },
				{ 4034, 4035 }, { 4012, 4013 }, { 4024, 4025 }, { 4036, 4037 },
				{ 4014, 4015 }, { 4026, 4027 }, { 4038, 4039 }, { 4152, 4153 },
				{ 12166, 12167 }, { 13926, 13927 }, { 19165, 19169 },
				{ 19166, 19170 }, { 19167, 19171 } };// { 18168, 18172 }
		int[] icons = { 3965, 3966, 3967, 3968, 3969, 3970, 3971, 3972, 3973,
				3974, 3975, 3976, 3977, 3978, 3979, 3980, 3981, 3982, 4151,
				12165, 13925, 27127, 27128, 27129 };// 27130
		int[][] buttonCoords = { { 4, 4 }, { 66, 4 }, { 128, 4 }, { 4, 32 },
				{ 66, 32 }, { 128, 32 }, { 4, 60 }, { 66, 60 }, { 128, 60 },
				{ 4, 88 }, { 66, 88 }, { 128, 88 }, { 4, 116 }, { 66, 116 },
				{ 128, 116 }, { 4, 144 }, { 66, 144 }, { 128, 144 },
				{ 4, 172 }, { 66, 172 }, { 128, 172 }, { 4, 200 }, { 66, 200 },
				{ 128, 200 } };// { 4, 229 }
		int[][] iconCoords = { { 6, 6 }, { 69, 7 }, { 131, 6 }, { 9, 34 },
				{ 68, 33 }, { 131, 36 }, { 9, 64 }, { 67, 63 }, { 131, 61 },
				{ 7, 91 }, { 68, 94 }, { 133, 90 }, { 6, 118 }, { 70, 120 },
				{ 130, 118 }, { 6, 147 }, { 69, 146 }, { 132, 146 },
				{ 6, 173 }, { 69, 173 }, { 130, 174 }, { 6, 202 }, { 69, 201 },
				{ 131, 202 } };// { 6, 230 }
		int[][] textCoords = { { 31, 7, 44, 18 }, { 93, 7, 106, 18 },
				{ 155, 7, 168, 18 }, { 31, 35, 44, 46 }, { 93, 35, 106, 46 },
				{ 155, 35, 168, 46 }, { 31, 63, 44, 74 }, { 93, 63, 106, 74 },
				{ 155, 63, 168, 74 }, { 31, 91, 44, 102 },
				{ 93, 91, 106, 102 }, { 155, 91, 168, 102 },
				{ 31, 119, 44, 130 }, { 93, 119, 106, 130 },
				{ 155, 119, 168, 130 }, { 31, 149, 44, 158 },
				{ 93, 147, 106, 158 }, { 155, 147, 168, 158 },
				{ 31, 175, 44, 186 }, { 93, 175, 106, 186 },
				{ 155, 175, 168, 186 }, { 31, 203, 44, 214 },
				{ 93, 203, 106, 214 }, { 155, 203, 168, 214 } };// { 31, 231,
																// 44, 242 }
		int[][] newText = { { 19165, 19166, 19167, 19168 },
				{ 19169, 19170, 19171, 19172 } };
		for (int i = 0; i < hovers.length; i++) {
			createSkillHover(hovers[i], 205 + i);
			addSkillButton(buttons[i], i);
			addImage(icons[i], "Skill/" + spriteNames[i]);
		}
		for (int i = 0; i < 4; i++) {
			addSkillText(newText[0][i], false, i + 21);
			addSkillText(newText[1][i], true, i + 21);
		}
		skill.children(icons.length + (text.length * 2) + hovers.length
				+ buttons.length + 1);
		int frame = 0;
		RSInterface totalLevel = interfaceCache[3984];
		totalLevel.message = "@yel@Total level: %1";
		totalLevel.textDrawingAreas = fonts[2];
		skill.child(frame, 3984, 44, 237);
		frame++;
		for (int i = 0; i < buttons.length; i++) {
			skill.child(frame, buttons[i], buttonCoords[i][0],
					buttonCoords[i][1]);
			frame++;
		}
		for (int i = 0; i < icons.length; i++) {
			skill.child(frame, icons[i], iconCoords[i][0], iconCoords[i][1]);
			frame++;
		}
		for (int i = 0; i < text.length; i++) {
			skill.child(frame, text[i][0], textCoords[i][0], textCoords[i][1]);
			frame++;
		}
		for (int i = 0; i < text.length; i++) {
			skill.child(frame, text[i][1], textCoords[i][2], textCoords[i][3]);
			frame++;
		}
		for (int i = 0; i < hovers.length; i++) {
			skill.child(frame, hovers[i], buttonCoords[i][0],
					buttonCoords[i][1]);
			frame++;
		}
	}

	public void children(int total) {
		children = new int[total];
		childX = new int[total];
		childY = new int[total];
	}

	public static void createSkillHover(int id, int x) {
		RSInterface hover = addInterface(id);
		hover.type = 8;
		hover.contentType = x;
		hover.width = 60;
		hover.height = 28;
		hover.inventoryHover = true;
	}

	public static void addImage(int id, String s) {
		RSInterface image = addInterface(id);
		image.type = 5;
		image.atActionType = 0;
		image.contentType = 0;
		image.width = 100;
		image.height = 100;
		image.disabledSprite = getSprite(s);
	}

	public static void addSkillText(int id, boolean max, int skill) {
		RSInterface text = addInterface(id);
		text.id = id;
		text.parentID = id;
		text.type = 4;
		text.atActionType = 0;
		text.width = 15;
		text.height = 12;
		text.textDrawingAreas = fonts[0];
		text.textShadow = true;
		text.centerText = true;
		text.textColor = 16776960;
		if (!max) {
			text.valueIndexArray = new int[1][];
			text.valueIndexArray[0] = new int[3];
			text.valueIndexArray[0][0] = 1;
			text.valueIndexArray[0][1] = skill;
			text.valueIndexArray[0][2] = 0;
		} else {
			text.valueIndexArray = new int[2][];
			text.valueIndexArray[0] = new int[3];
			text.valueIndexArray[0][0] = 1;
			text.valueIndexArray[0][1] = skill;
			text.valueIndexArray[0][2] = 0;
			text.valueIndexArray[1] = new int[1];
			text.valueIndexArray[1][0] = 0;
		}
		text.message = "%1";
	}

	@SuppressWarnings("unused")
	public static Sprite getSprite(String s) {
		Sprite image;
		try {
			image = new Sprite(s);
			if (image != null) {
				return image;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return image;
	}

	public boolean inventoryHover;

	public static void addSkillButton(int id, int z) {
		String[] skillNames = { "Attack", "Hitpoints", "Mining", "Strength",
				"Agility", "Smithing", "Defence", "Herblore", "Fishing",
				"Ranged", "Thieving", "Cooking", "Prayer", "Crafting",
				"Firemaking", "Magic", "Fletching", "Woodcutting",
				"Runecrafting", "Slayer", "Farming", "Construction", "Hunter",
				"Summoning" };

		RSInterface button = addInterface(id);
		button.type = 5;
		button.atActionType = 5;
		button.contentType = 0;
		button.width = 60;
		button.height = 27;
		button.disabledSprite = CustomSpriteLoader(33225, "");
		button.disabledSprite = getSprite("Skill/Button");
		button.tooltip = "View @or2@" + skillNames[z] + " @whi@guide";
	}

	public static void pkInterface(TextDrawingArea[] wid) {
		RSInterface rsinterface = addTab(19805);
		addSprite(19806, 0, "Skill/PK");
		addText(19807, "Change Stats:", wid, 2, 0xff981f);
		addText(19808, "Spawn Items:", wid, 2, 0xff981f);
		addText(19809, "Level: 126", wid, 0, 0xFFEE33);
		addText(19810, "1", wid, 0, 0xFFEE33);
		addText(19811, "1", wid, 0, 0xFFEE33);
		addText(19812, "1", wid, 0, 0xFFEE33);
		addText(19813, "1", wid, 0, 0xFFEE33);
		addText(19814, "1", wid, 0, 0xFFEE33);
		addText(19815, "1", wid, 0, 0xFFEE33);
		addText(19816, "1", wid, 0, 0xFFEE33);
		addText(19817, "1", wid, 0, 0xFFEE33);
		addText(19818, "1", wid, 0, 0xFFEE33);
		addText(19819, "1", wid, 0, 0xFFEE33);
		addText(19820, "1", wid, 0, 0xFFEE33);
		addText(19821, "1", wid, 0, 0xFFEE33);
		addText(19822, "1", wid, 0, 0xFFEE33);
		addText(19823, "1", wid, 0, 0xFFEE33);
		addText(19824, "Search", wid, 1, 0xff981f);
		addText(19825, "Clear Inv", wid, 1, 0xff981f);

		addHoverButton(19826, "Skill/PK", 3, 96, 43, "Search For Item", -1,
				19827, 1);
		addHoveredButton(19827, "Skill/PK", 4, 96, 43, 19828);
		addHoverButton(19829, "Skill/PK", 3, 96, 43, "Clear Inventory", -1,
				19830, 1);
		addHoveredButton(19830, "Skill/PK", 4, 96, 43, 19831);
		addHoverButton(19832, "Skill/PK", 12, 47, 22, "Melee Sets", -1, 19833,
				1);
		addHoveredButton(19833, "Skill/PK", 16, 47, 22, 19834);
		addHoverButton(19835, "Skill/PK", 13, 47, 22, "Mage Sets", -1, 19836, 1);
		addHoveredButton(19836, "Skill/PK", 17, 47, 22, 19837);
		addHoverButton(19838, "Skill/PK", 14, 47, 22, "Range Sets", -1, 19839,
				1);
		addHoveredButton(19839, "Skill/PK", 18, 47, 22, 19840);
		addHoverButton(19841, "Skill/PK", 15, 47, 22, "Consumables", -1, 19842,
				1);
		addHoveredButton(19842, "Skill/PK", 19, 47, 22, 19843);

		addHoverButton(19844, "Skill/PK", 9, 60, 27, "Change Attack", -1,
				19845, 1);
		addHoveredButton(19845, "Skill/PK", 24, 60, 27, 19846);

		addHoverButton(19847, "Skill/PK", 10, 60, 27, "Change Strength", -1,
				19848, 1);
		addHoveredButton(19848, "Skill/PK", 25, 60, 27, 19849);

		addHoverButton(19850, "Skill/PK", 11, 60, 27, "Change Defence", -1,
				19851, 1);
		addHoveredButton(19851, "Skill/PK", 26, 60, 27, 19852);

		addHoverButton(19853, "Skill/PK", 6, 60, 27, "Change Magic", -1, 19854,
				1);
		addHoveredButton(19854, "Skill/PK", 21, 60, 27, 19855);

		addHoverButton(19856, "Skill/PK", 7, 60, 27, "Change Range", -1, 19857,
				1);
		addHoveredButton(19857, "Skill/PK", 22, 60, 27, 19858);

		addHoverButton(19859, "Skill/PK", 8, 60, 27, "Change Prayer", -1,
				19860, 1);
		addHoveredButton(19860, "Skill/PK", 23, 60, 27, 19861);

		addHoverButton(19862, "Skill/PK", 5, 60, 27, "Change Hitpoints", -1,
				19863, 1);
		addHoveredButton(19863, "Skill/PK", 20, 60, 27, 19864);

		rsinterface.totalChildren(46);
		rsinterface.child(0, 19806, 13, 1);
		rsinterface.child(1, 19807, 20, 7);
		rsinterface.child(2, 19808, 20, 138);
		rsinterface.child(3, 19809, 22, 30);

		rsinterface.child(4, 19844, 18, 51);
		rsinterface.child(5, 19845, 18, 51);
		rsinterface.child(6, 19847, 18, 78);
		rsinterface.child(7, 19848, 18, 78);
		rsinterface.child(8, 19850, 18, 105);
		rsinterface.child(9, 19851, 18, 105);

		rsinterface.child(10, 19853, 114, 51);
		rsinterface.child(11, 19854, 114, 51);
		rsinterface.child(12, 19856, 114, 78);
		rsinterface.child(13, 19857, 114, 78);
		rsinterface.child(14, 19859, 114, 105);
		rsinterface.child(15, 19860, 114, 105);
		rsinterface.child(16, 19862, 114, 24);
		rsinterface.child(17, 19863, 114, 24);

		rsinterface.child(18, 19810, 46, 55);
		rsinterface.child(19, 19811, 61, 65);
		rsinterface.child(20, 19812, 46, 82);
		rsinterface.child(21, 19813, 61, 92);
		rsinterface.child(22, 19814, 46, 110);
		rsinterface.child(23, 19815, 61, 120);
		rsinterface.child(24, 19816, 143, 55);
		rsinterface.child(25, 19817, 158, 65);
		rsinterface.child(26, 19818, 143, 82);
		rsinterface.child(27, 19819, 158, 92);
		rsinterface.child(28, 19820, 143, 110);
		rsinterface.child(29, 19821, 158, 120);
		rsinterface.child(30, 19822, 143, 28);
		rsinterface.child(31, 19823, 158, 38);
		rsinterface.child(32, 19826, 76, 158);
		rsinterface.child(33, 19827, 76, 158);
		rsinterface.child(34, 19824, 104, 171);
		rsinterface.child(35, 19829, 76, 210);
		rsinterface.child(36, 19830, 76, 210);
		rsinterface.child(37, 19825, 100, 225);

		rsinterface.child(38, 19832, 20, 157);
		rsinterface.child(39, 19833, 20, 157);
		rsinterface.child(40, 19835, 20, 182);
		rsinterface.child(41, 19836, 20, 182);
		rsinterface.child(42, 19838, 20, 207);
		rsinterface.child(43, 19839, 20, 207);
		rsinterface.child(44, 19841, 20, 232);
		rsinterface.child(45, 19842, 20, 232);

	}

	public static void skillInterface(TextDrawingArea[] wid) {
		addTab(3917);
		skillInterface(19746, 255);
		// skillInterface(19747, 51);
		// skillInterface(19748, 50);
		skillInterface(19749, 52);
		addText(29799, "1", wid, 0, 0xFFEE33); // Hunter
		addText(29800, "1", wid, 0, 0xFFEE33); // Hunter
		addText(29801, "1", wid, 0, 0xFFEE33); // Summoning
		addText(29802, "1", wid, 0, 0xFFEE33); // Summoning
		addButton(19747, 51, 27700, "Skill/Skill", 62, 32,
				"View Hunter Skill XP", 5);
		addButton(19748, 50, 27701, "Skill/Skill", 62, 32,
				"View Summoning Skill XP", 5);

		addText(13984, "Total", wid, 0, 0xFFEE33);
		addText(3985, "", wid, 0, 0xFFEE33);
		addText(13983, "Level: 2277", wid, 0, 0xFFEE33, true, true);
		for (int k = 0; k < boxIds.length; k++) {
			skillInterface(boxIds[k], 256);
		}
		RSInterface rsinterface = addTab(3917);
		rsinterface.children = new int[63];
		rsinterface.childX = new int[63];
		rsinterface.childY = new int[63];
		rsinterface.children[0] = 3918;
		rsinterface.childX[0] = 0;
		rsinterface.childY[0] = 0;
		rsinterface.children[1] = 3925;
		rsinterface.childX[1] = 0;
		rsinterface.childY[1] = 31;
		rsinterface.children[2] = 3932;
		rsinterface.childX[2] = 0;
		rsinterface.childY[2] = 62;
		rsinterface.children[3] = 3939;
		rsinterface.childX[3] = 0;
		rsinterface.childY[3] = 93;
		rsinterface.children[4] = 3946;
		rsinterface.childX[4] = 0;
		rsinterface.childY[4] = 124;
		rsinterface.children[5] = 3953;
		rsinterface.childX[5] = 0;
		rsinterface.childY[5] = 155;
		rsinterface.children[6] = 4148;
		rsinterface.childX[6] = 0;
		rsinterface.childY[6] = 186;
		rsinterface.children[7] = 19746;
		rsinterface.childX[7] = 70;
		rsinterface.childY[7] = 69;
		rsinterface.children[8] = 19748;
		rsinterface.childX[8] = 1;
		rsinterface.childY[8] = 219;
		rsinterface.children[9] = 19747;
		rsinterface.childX[9] = 64;
		rsinterface.childY[9] = 219;
		rsinterface.children[10] = 14000;
		rsinterface.childX[10] = 10;
		rsinterface.childY[10] = 219;
		rsinterface.children[11] = 19749;
		rsinterface.childX[11] = 128;
		rsinterface.childY[11] = 220;
		rsinterface.children[12] = 13983;
		rsinterface.childX[12] = 158;
		rsinterface.childY[12] = 238;
		rsinterface.children[13] = 3984;
		rsinterface.childX[13] = 300;
		rsinterface.childY[13] = 225;
		rsinterface.children[14] = 3985;
		rsinterface.childX[14] = 130;
		rsinterface.childY[14] = 238;
		rsinterface.children[15] = 29799;
		rsinterface.childX[15] = 98;
		rsinterface.childY[15] = 220;
		rsinterface.children[16] = 29800;
		rsinterface.childX[16] = 107;
		rsinterface.childY[16] = 235;
		rsinterface.children[17] = 29802;
		rsinterface.childX[17] = 36;
		rsinterface.childY[17] = 220;
		rsinterface.children[18] = 29801;
		rsinterface.childX[18] = 45;
		rsinterface.childY[18] = 235;
		rsinterface.children[19] = 4040;
		rsinterface.childX[19] = 5;
		rsinterface.childY[19] = 20;
		rsinterface.children[20] = 8654;
		rsinterface.childX[20] = 0;
		rsinterface.childY[20] = 2;
		rsinterface.children[21] = 8655;
		rsinterface.childX[21] = 64;
		rsinterface.childY[21] = 2;
		rsinterface.children[22] = 4076;
		rsinterface.childX[22] = 20;
		rsinterface.childY[22] = 20;
		rsinterface.children[23] = 8656;
		rsinterface.childX[23] = 128;
		rsinterface.childY[23] = 2;
		rsinterface.children[24] = 4112;
		rsinterface.childX[24] = 20;
		rsinterface.childY[24] = 20;
		rsinterface.children[25] = 8657;
		rsinterface.childX[25] = 0;
		rsinterface.childY[25] = 33;
		rsinterface.children[26] = 4046;
		rsinterface.childX[26] = 20;
		rsinterface.childY[26] = 50;
		rsinterface.children[27] = 8658;
		rsinterface.childX[27] = 64;
		rsinterface.childY[27] = 33;
		rsinterface.children[28] = 4082;
		rsinterface.childX[28] = 20;
		rsinterface.childY[28] = 50;
		rsinterface.children[29] = 8659;
		rsinterface.childX[29] = 128;
		rsinterface.childY[29] = 33;
		rsinterface.children[30] = 4118;
		rsinterface.childX[30] = 20;
		rsinterface.childY[30] = 50;
		rsinterface.children[31] = 8660;
		rsinterface.childX[31] = 0;
		rsinterface.childY[31] = 60 + 10;
		rsinterface.children[32] = 4052;
		rsinterface.childX[32] = 20;
		rsinterface.childY[32] = 83;
		rsinterface.children[33] = 8661;
		rsinterface.childX[33] = 65;
		rsinterface.childY[33] = 60 + 10;
		rsinterface.children[34] = 4088;
		rsinterface.childX[34] = 20;
		rsinterface.childY[34] = 83;
		rsinterface.children[35] = 8662;
		rsinterface.childX[35] = 130;
		rsinterface.childY[35] = 60 + 10;
		rsinterface.children[36] = 4124;
		rsinterface.childX[36] = 20;
		rsinterface.childY[36] = 83;
		rsinterface.children[37] = 8663;
		rsinterface.childX[37] = 0;
		rsinterface.childY[37] = 90 + 10;
		rsinterface.children[38] = 4058;
		rsinterface.childX[38] = 20;
		rsinterface.childY[38] = 120;
		rsinterface.children[39] = 8664;
		rsinterface.childX[39] = 65;
		rsinterface.childY[39] = 90 + 10;
		rsinterface.children[40] = 4094;
		rsinterface.childX[40] = 20;
		rsinterface.childY[40] = 120;
		rsinterface.children[41] = 8665;
		rsinterface.childX[41] = 130;
		rsinterface.childY[41] = 90 + 10;
		rsinterface.children[42] = 4130;
		rsinterface.childX[42] = 20;
		rsinterface.childY[42] = 120;
		rsinterface.children[43] = 8666;
		rsinterface.childX[43] = 0;
		rsinterface.childY[43] = 130;
		rsinterface.children[44] = 4064;
		rsinterface.childX[44] = 20;
		rsinterface.childY[44] = 150;
		rsinterface.children[45] = 8667;
		rsinterface.childX[45] = 65;
		rsinterface.childY[45] = 130;
		rsinterface.children[46] = 4100;
		rsinterface.childX[46] = 20;
		rsinterface.childY[46] = 150;
		rsinterface.children[47] = 8668;
		rsinterface.childX[47] = 130;
		rsinterface.childY[47] = 130;
		rsinterface.children[48] = 4136;
		rsinterface.childX[48] = 20;
		rsinterface.childY[48] = 150;
		rsinterface.children[49] = 8669;
		rsinterface.childX[49] = 0;
		rsinterface.childY[49] = 160;
		rsinterface.children[50] = 4070;
		rsinterface.childX[50] = 20;
		rsinterface.childY[50] = 180;
		rsinterface.children[51] = 8670;
		rsinterface.childX[51] = 65;
		rsinterface.childY[51] = 160;
		rsinterface.children[52] = 4106;
		rsinterface.childX[52] = 20;
		rsinterface.childY[52] = 180;
		rsinterface.children[53] = 8671;
		rsinterface.childX[53] = 130;
		rsinterface.childY[53] = 160;
		rsinterface.children[54] = 4142;
		rsinterface.childX[54] = 20;
		rsinterface.childY[54] = 180;
		rsinterface.children[55] = 8672;
		rsinterface.childX[55] = 0;
		rsinterface.childY[55] = 190;
		rsinterface.children[56] = 4160;
		rsinterface.childX[56] = 20;
		rsinterface.childY[56] = 150;
		rsinterface.children[57] = 4160;
		rsinterface.childX[57] = 20;
		rsinterface.childY[57] = 150;
		rsinterface.children[58] = 12162;
		rsinterface.childX[58] = 65;
		rsinterface.childY[58] = 190;
		rsinterface.children[59] = 2832;
		rsinterface.childX[59] = 20;
		rsinterface.childY[59] = 150;
		rsinterface.children[60] = 13928;
		rsinterface.childX[60] = 130;
		rsinterface.childY[60] = 190;
		rsinterface.children[61] = 13917;
		rsinterface.childX[61] = 20;
		rsinterface.childY[61] = 150;
		rsinterface.children[62] = 13984;
		rsinterface.childX[62] = 145;
		rsinterface.childY[62] = 225;
	}

	public static void skillInterface(int i, int j) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 26;
		rsinterface.height = 34;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 0;
		rsinterface.disabledSprite = imageLoader(j, "Skill/Skill");
		rsinterface.enabledSprite = imageLoader(j, "Skill/Skill");
	}

	public static void itemsOnDeath(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17100);
		addSprite(17101, 2, 2);
		addHover(17102, 3, 0, 10601, 1, "Interfaces/Equipment/SPRITE", 17, 17,
				"Close Window");
		addHovered(10601, 3, "Interfaces/Equipment/SPRITE", 17, 17, 10602);
		addText(17103, "Items Kept On Death", wid, 2, 0xff981f);
		addText(17104, "Items you will keep on death (if not skulled):", wid,
				1, 0xff981f);
		addText(17105, "Items you will lose on death (if not skulled):", wid,
				1, 0xff981f);
		addText(17106, "Information", wid, 1, 0xff981f);
		addText(17107, "Max items kept on death:", wid, 1, 0xffcc33);
		addText(17108, "~ 3 ~", wid, 1, 0xffcc33);
		rsinterface.scrollMax = 0;
		rsinterface.isMouseoverTriggered = false;

		interfaceCache[10494].invSpritePadX = 8;
		interfaceCache[10600].invSpritePadX = 6;
		interfaceCache[10600].invSpritePadY = 6;

		rsinterface.children = new int[12];
		rsinterface.childX = new int[12];
		rsinterface.childY = new int[12];

		rsinterface.children[0] = 17101;
		rsinterface.childX[0] = 7;
		rsinterface.childY[0] = 8;
		rsinterface.children[1] = 17102;
		rsinterface.childX[1] = 480;
		rsinterface.childY[1] = 17;
		rsinterface.children[2] = 17103;
		rsinterface.childX[2] = 185;
		rsinterface.childY[2] = 18;
		rsinterface.children[3] = 17104;
		rsinterface.childX[3] = 22;
		rsinterface.childY[3] = 50;
		rsinterface.children[4] = 17105;
		rsinterface.childX[4] = 22;
		rsinterface.childY[4] = 110;
		rsinterface.children[5] = 17106;
		rsinterface.childX[5] = 347;
		rsinterface.childY[5] = 47;
		rsinterface.children[6] = 17107;
		rsinterface.childX[6] = 349;
		rsinterface.childY[6] = 270;
		rsinterface.children[7] = 17108;
		rsinterface.childX[7] = 398;
		rsinterface.childY[7] = 298;
		rsinterface.children[8] = 17115;
		rsinterface.childX[8] = 348;
		rsinterface.childY[8] = 64;
		rsinterface.children[9] = 10494;
		rsinterface.childX[9] = 26;
		rsinterface.childY[9] = 74;
		rsinterface.children[10] = 10600;
		rsinterface.childX[10] = 26;
		rsinterface.childY[10] = 133;
		rsinterface.children[11] = 10601;
		rsinterface.childX[11] = 480;
		rsinterface.childY[11] = 17;
	}

	public static void itemsOnDeathDATA(TextDrawingArea[] wid) {
		RSInterface rsinterface = addInterface(17115);
		addText(17109, "", wid, 0, 0xff981f);
		addText(17110, "The normal amount of", wid, 0, 0xff981f);
		addText(17111, "items kept is three.", wid, 0, 0xff981f);
		addText(17112, "", wid, 0, 0xff981f);
		addText(17113, "If you are skulled,", wid, 0, 0xff981f);
		addText(17114, "you will lose all your", wid, 0, 0xff981f);
		addText(17117, "items, unless an item", wid, 0, 0xff981f);
		addText(17118, "protecting prayer is", wid, 0, 0xff981f);
		addText(17119, "used.", wid, 0, 0xff981f);
		addText(17120, "", wid, 0, 0xff981f);
		addText(17121, "Item protecting prayers", wid, 0, 0xff981f);
		addText(17122, "will allow you to keep", wid, 0, 0xff981f);
		addText(17123, "one extra item.", wid, 0, 0xff981f);
		addText(17124, "", wid, 0, 0xff981f);
		addText(17125, "The items kept are", wid, 0, 0xff981f);
		addText(17126, "selected by the server", wid, 0, 0xff981f);
		addText(17127, "and include the most", wid, 0, 0xff981f);
		addText(17128, "expensive items you're", wid, 0, 0xff981f);
		addText(17129, "carrying.", wid, 0, 0xff981f);
		addText(17130, "", wid, 0, 0xff981f);
		rsinterface.parentID = 17115;
		rsinterface.id = 17115;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 130;
		rsinterface.height = 197;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.scrollMax = 280;
		rsinterface.children = new int[20];
		rsinterface.childX = new int[20];
		rsinterface.childY = new int[20];
		rsinterface.children[0] = 17109;
		rsinterface.childX[0] = 0;
		rsinterface.childY[0] = 0;
		rsinterface.children[1] = 17110;
		rsinterface.childX[1] = 0;
		rsinterface.childY[1] = 12;
		rsinterface.children[2] = 17111;
		rsinterface.childX[2] = 0;
		rsinterface.childY[2] = 24;
		rsinterface.children[3] = 17112;
		rsinterface.childX[3] = 0;
		rsinterface.childY[3] = 36;
		rsinterface.children[4] = 17113;
		rsinterface.childX[4] = 0;
		rsinterface.childY[4] = 48;
		rsinterface.children[5] = 17114;
		rsinterface.childX[5] = 0;
		rsinterface.childY[5] = 60;
		rsinterface.children[6] = 17117;
		rsinterface.childX[6] = 0;
		rsinterface.childY[6] = 72;
		rsinterface.children[7] = 17118;
		rsinterface.childX[7] = 0;
		rsinterface.childY[7] = 84;
		rsinterface.children[8] = 17119;
		rsinterface.childX[8] = 0;
		rsinterface.childY[8] = 96;
		rsinterface.children[9] = 17120;
		rsinterface.childX[9] = 0;
		rsinterface.childY[9] = 108;
		rsinterface.children[10] = 17121;
		rsinterface.childX[10] = 0;
		rsinterface.childY[10] = 120;
		rsinterface.children[11] = 17122;
		rsinterface.childX[11] = 0;
		rsinterface.childY[11] = 132;
		rsinterface.children[12] = 17123;
		rsinterface.childX[12] = 0;
		rsinterface.childY[12] = 144;
		rsinterface.children[13] = 17124;
		rsinterface.childX[13] = 0;
		rsinterface.childY[13] = 156;
		rsinterface.children[14] = 17125;
		rsinterface.childX[14] = 0;
		rsinterface.childY[14] = 168;
		rsinterface.children[15] = 17126;
		rsinterface.childX[15] = 0;
		rsinterface.childY[15] = 180;
		rsinterface.children[16] = 17127;
		rsinterface.childX[16] = 0;
		rsinterface.childY[16] = 192;
		rsinterface.children[17] = 17128;
		rsinterface.childX[17] = 0;
		rsinterface.childY[17] = 204;
		rsinterface.children[18] = 17129;
		rsinterface.childX[18] = 0;
		rsinterface.childY[18] = 216;
		rsinterface.children[19] = 17130;
		rsinterface.childX[19] = 0;
		rsinterface.childY[19] = 228;
	}

	public static void addSprite(int i, int j, int k) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 1;
		rsinterface.contentType = 0;
		rsinterface.width = 20;
		rsinterface.height = 20;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j,
				"Interfaces/Equipment/SPRITE");
		rsinterface.enabledSprite = imageLoader(k,
				"Interfaces/Equipment/SPRITE");
	}

	public static void GodWars(TextDrawingArea[] TDA) {
		RSInterface rsinterface = addTab(16210);
		addText(16211, "NPC killcount", 0xff9040, false, true, 52, TDA, 0);
		addText(16212, "Armadyl kills", 0xff9040, false, true, 52, TDA, 0);
		addText(16213, "Bandos kills", 0xff9040, false, true, 52, TDA, 0);
		addText(16214, "Saradomin kills", 0xff9040, false, true, 52, TDA, 0);
		addText(16215, "Zamorak kills", 0xff9040, false, true, 52, TDA, 0);
		addText(16216, "0", 0x66FFFF, false, true, 52, TDA, 0);// armadyl
		addText(16217, "0", 0x66FFFF, false, true, 52, TDA, 0);// bandos
		addText(16218, "0", 0x66FFFF, false, true, 52, TDA, 0);// saradomin
		addText(16219, "0", 0x66FFFF, false, true, 52, TDA, 0);// zamorak
		rsinterface.scrollMax = 0;
		rsinterface.children = new int[9];
		rsinterface.childX = new int[9];
		rsinterface.childY = new int[9];
		rsinterface.children[0] = 16211;
		rsinterface.childX[0] = -52 + 375 + 30;
		rsinterface.childY[0] = 7;
		rsinterface.children[1] = 16212;
		rsinterface.childX[1] = -52 + 375 + 30;
		rsinterface.childY[1] = 30;
		rsinterface.children[2] = 16213;
		rsinterface.childX[2] = -52 + 375 + 30;
		rsinterface.childY[2] = 44;
		rsinterface.children[3] = 16214;
		rsinterface.childX[3] = -52 + 375 + 30;
		rsinterface.childY[3] = 58;
		rsinterface.children[4] = 16215;
		rsinterface.childX[4] = -52 + 375 + 30;
		rsinterface.childY[4] = 73;

		rsinterface.children[5] = 16216;
		rsinterface.childX[5] = -52 + 460 + 60;
		rsinterface.childY[5] = 31;
		rsinterface.children[6] = 16217;
		rsinterface.childX[6] = -52 + 460 + 60;
		rsinterface.childY[6] = 45;
		rsinterface.children[7] = 16218;
		rsinterface.childX[7] = -52 + 460 + 60;
		rsinterface.childY[7] = 59;
		rsinterface.children[8] = 16219;
		rsinterface.childX[8] = -52 + 460 + 60;
		rsinterface.childY[8] = 74;
	}

	public static void magicTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(1151);
		RSInterface homeHover = addTabInterface(1196);
		RSInterface spellButtons = interfaceCache[12424];
		spellButtons.scrollMax = 0;
		spellButtons.height = 260;
		spellButtons.width = 190;
		int[] spellButton = { 1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249,
				1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324,
				1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404,
				1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469,
				15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512,
				1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446,
				12456, 6004, 18471 };
		tab.totalChildren(63);
		tab.child(0, 12424, 13, 24);
		for (int i1 = 0; i1 < spellButton.length; i1++) {
			int yPos = i1 > 34 ? 8 : 183;
			tab.child(1, 1195, 13, 24);
			tab.child(i1 + 2, spellButton[i1], 5, yPos);
			addButton(1195, 1, "Magic/Home", "Cast @gre@Home Teleport");
			RSInterface homeButton = interfaceCache[1195];
			homeButton.mOverInterToTrigger = 1196;
		}
		for (int i2 = 0; i2 < spellButton.length; i2++) {
			if (i2 < 60)
				spellButtons.childX[i2] = spellButtons.childX[i2] + 24;
			if (i2 == 6 || i2 == 12 || i2 == 19 || i2 == 35 || i2 == 41
					|| i2 == 44 || i2 == 49 || i2 == 51)
				spellButtons.childX[i2] = 0;
			spellButtons.childY[6] = 24;
			spellButtons.childY[12] = 48;
			spellButtons.childY[19] = 72;
			spellButtons.childY[49] = 96;
			spellButtons.childY[44] = 120;
			spellButtons.childY[51] = 144;
			spellButtons.childY[35] = 170;
			spellButtons.childY[41] = 192;
		}
		homeHover.isMouseoverTriggered = true;
		addText(1197, "Level 0: Home Teleport", tda, 1, 0xFE981F, true, true);
		RSInterface homeLevel = interfaceCache[1197];
		homeLevel.width = 174;
		homeLevel.height = 68;
		addText(1198, "A teleport which takes you", tda, 0, 0xAF6A1A, true,
				true);
		addText(18998, "to your desired home location.", tda, 0, 0xAF6A1A,
				true, true);
		addText(18999, "(Right click to change location)", tda, 0, 0xAF6A1A,
				true, true);
		homeHover.totalChildren(4);
		homeHover.child(0, 1197, 3, 4);
		homeHover.child(1, 1198, 91, 23);
		homeHover.child(2, 18998, 91, 34);
		homeHover.child(3, 18999, 91, 45);
		resetRunesAndLevels(1541);
	}

	public static void ancientMagicTab(TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(12855);
		addButton(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
		RSInterface rsinterface1 = interfaceCache[12856];
		rsinterface1.mOverInterToTrigger = 1196;
		int ai[] = { 12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963,
				13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911,
				12871, 13079, 12975, 13023, 13087, 12929, 12891, 13095, 1196,
				12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054,
				12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080,
				12976, 13024, 13088, 12930, 12892, 13096 };
		rsinterface.totalChildren(ai.length);
		int i = 0;
		int j = 18;
		int k = 8;
		while (i < ai.length) {
			if (j > 175) {
				j = 18;
				k += 28;
			}
			if (i < 25) {
				rsinterface.child(i, ai[i], j, k);
			}
			if (i > 24) {
				k = i >= 41 ? 1 : 181;
				rsinterface.child(i, ai[i], 4, k);
			}
			i++;
			j += 45;
		}
	}

	public static void drawBlackBox(int i, int j) {
		DrawingArea.drawPixels(71, j - 1, i - 2, 0x726451, 1);
		DrawingArea.drawPixels(69, j, i + 174, 0x726451, 1);
		DrawingArea.drawPixels(1, j - 2, i - 2, 0x726451, 178);
		DrawingArea.drawPixels(1, j + 68, i, 0x726451, 174);
		DrawingArea.drawPixels(71, j - 1, i - 1, 0x2e2b23, 1);
		DrawingArea.drawPixels(71, j - 1, i + 175, 0x2e2b23, 1);
		DrawingArea.drawPixels(1, j - 1, i, 0x2e2b23, 175);
		DrawingArea.drawPixels(1, j + 69, i, 0x2e2b23, 175);
		DrawingArea.method335(0, j, 174, 68, 220, i);
	}

	public static void addButton(int i, int j, String s, String s1) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 1;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = rsinterface.disabledSprite.myWidth;
		rsinterface.height = rsinterface.enabledSprite.myHeight;
		rsinterface.tooltip = s1;
	}

	public static void prayerTab(TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addTabInterface(5608);
		RSInterface rsinterface1 = interfaceCache[687];
		rsinterface1.textColor = 0xff981f;
		rsinterface1.textShadow = true;
		rsinterface1.message = "%1/%2";
		addSpriteWithHover(19022, 11, "CurseTab/SPRITE", 19021);
		addButton(19023, 12, "CurseTab/SPRITE", "", 190, 17);
		addText(19030, "Hide stat adjustments.", 0xFFCC00, false, true, -1,
				atextdrawingarea, 0, 0xFFFFFF);
		addText(19024, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(19025, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(19026, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(19027, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(19028, "", 0xFF981F, false, false, -1, atextdrawingarea, 0);
		addText(19029, "99/99", 0xFF981F, false, false, -1, atextdrawingarea, 1);
		addSprite(5651, 0, "PRAYER");
		addPrayer(19100, 0, 601, 7, 0, "Sharp Eye");
		addPrayer(19102, 0, 602, 8, 1, "Mystic Will");
		addPrayer(19104, 0, 603, 25, 2, "Hawk Eye");
		addPrayer(19106, 0, 604, 26, 3, "Mystic Lore");
		addPrayer(19108, 0, 605, 43, 4, "Eagle Eye");
		addPrayer(19110, 0, 606, 44, 5, "Mystic Might");
		addPrayer(19112, 0, 607, 59, 6, "Chivalry");
		addPrayer(19114, 0, 608, 69, 7, "Piety");
		rsinterface.totalChildren(62);
		rsinterface.child(0, 5609, 6, 4);
		rsinterface.child(1, 5610, 42, 4);
		rsinterface.child(2, 5611, 78, 4);
		rsinterface.child(3, 5612, 6, 40);
		rsinterface.child(4, 5613, 42, 40);
		rsinterface.child(5, 5614, 78, 40);
		rsinterface.child(6, 5615, 114, 40);
		rsinterface.child(7, 5616, 150, 40);
		rsinterface.child(8, 5617, 6, 76);
		rsinterface.child(9, 5618, 114, 76);
		rsinterface.child(10, 5619, 150, 76);
		rsinterface.child(11, 5620, 6, 112);
		rsinterface.child(12, 5621, 42, 112);
		rsinterface.child(13, 5622, 78, 112);
		rsinterface.child(14, 5623, 114, 112);
		rsinterface.child(15, 683, 42, 148);
		rsinterface.child(16, 684, 78, 148);
		rsinterface.child(17, 685, 114, 148);
		rsinterface.child(18, 5632, 8, 6);
		rsinterface.child(19, 5633, 44, 6);
		rsinterface.child(20, 5634, 80, 6);
		rsinterface.child(21, 5635, 8, 42);
		rsinterface.child(22, 5636, 44, 42);
		rsinterface.child(23, 5637, 80, 42);
		rsinterface.child(24, 5638, 116, 42);
		rsinterface.child(25, 5639, 152, 42);
		rsinterface.child(26, 5640, 8, 79);
		rsinterface.child(27, 5641, 116, 78);
		rsinterface.child(28, 5642, 152, 78);
		rsinterface.child(29, 5643, 8, 114);
		rsinterface.child(30, 5644, 44, 114);
		rsinterface.child(31, 686, 80, 114);
		rsinterface.child(32, 5645, 116, 114);
		rsinterface.child(33, 5649, 44, 150);
		rsinterface.child(34, 5647, 80, 150);
		rsinterface.child(35, 5648, 116, 150);
		rsinterface.child(36, 19100, 114, 4);
		rsinterface.child(37, 19101, 117, 8);
		rsinterface.child(38, 19102, 150, 4);
		rsinterface.child(39, 19103, 153, 7);
		rsinterface.child(40, 19104, 42, 76);
		rsinterface.child(41, 19105, 45, 80);
		rsinterface.child(42, 19106, 78, 76);
		rsinterface.child(43, 19107, 81, 79);
		rsinterface.child(44, 19108, 150, 112);
		rsinterface.child(45, 19109, 153, 116);
		rsinterface.child(46, 19110, 6, 148);
		rsinterface.child(47, 19111, 9, 151);
		rsinterface.child(48, 19112, 150, 148);
		rsinterface.child(49, 19113, 157, 151);
		rsinterface.child(50, 19114, 6, 184);
		rsinterface.child(51, 19115, 8, 194);
		rsinterface.child(52, 5651, 65, 242);
		rsinterface.child(53, 19022, 85, 241);
		rsinterface.child(54, 19023, 0, 217);
		rsinterface.child(55, 19024, 0, 170);
		rsinterface.child(56, 19025, 89, 200);
		rsinterface.child(57, 19026, 10, 200);
		rsinterface.child(58, 19027, 50, 200);
		rsinterface.child(59, 19028, 130, 200);
		rsinterface.child(60, 19029, 170, 200);
		rsinterface.child(61, 19030, 47, 218);

		String as[] = { "Thick Skin", "Burst of Strength",
				"Clarity of Thought", "Rock Skin", "Superhuman Strength",
				"Improved Reflexes", "Rapid Restore", "Rapid Heal",
				"Protect Item", "Steel Skin", "Ultimate Strength",
				"Incredible Reflexes", "Protect from Magic",
				"Protect from Range", "Protect from Melee", "Retribution",
				"Redemption", "Smite" };
		int i = 0;
		for (int j = 5609; j <= 5623; j++) {
			RSInterface rsinterface2 = interfaceCache[j];
			rsinterface2.tooltip = (new StringBuilder())
					.append("Activate @or2@").append(as[i++]).toString();
		}

		for (int k = 683; k <= 685; k++) {
			RSInterface rsinterface3 = interfaceCache[k];
			rsinterface3.tooltip = (new StringBuilder())
					.append("Activate @or2@").append(as[i++]).toString();
		}
		rsinterface.width = 173;
		rsinterface.height = 260;
		rsinterface.scrollMax = 610;

	}

	public static void addTooltipBox(int i, String s) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 8;
		rsinterface.popupString = s;
	}

	public static void drawTooltip(int id, String text) {
		RSInterface rsinterface = addTabInterface(id);
		rsinterface.parentID = id;
		rsinterface.type = 0;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.tooltip = text;
		rsinterface.totalChildren(1);
		rsinterface.child(0, id + 1, 0, 0);
	}

	public static void addTooltip(int i, String s) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.id = i;
		rsinterface.type = 0;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		addTooltipBox(i + 1, s);
		rsinterface.totalChildren(1);
		rsinterface.child(0, i + 1, 0, 0);
	}

	public static void addTooltip(int i, String s, int a, int b)// Curses
																// tooltip
	{
		RSInterface rsinterface = addInterface(i);
		rsinterface.id = i;
		rsinterface.type = 0;
		rsinterface.width = a;
		rsinterface.height = b;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		addTooltipBox(i + 1, s);
		rsinterface.totalChildren(1);
		rsinterface.child(0, i + 1, 0, 0);
	}

	public static void addPrayer(int i, int j, int k, int l, int i1, String s) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.id = i;
		rsinterface.parentID = 5608;
		rsinterface.type = 5;
		rsinterface.atActionType = 4;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.disabledSprite = imageLoader(0, "PRAYERGLOW");
		rsinterface.enabledSprite = imageLoader(1, "PRAYERGLOW");
		rsinterface.width = 34;
		rsinterface.height = 34;
		rsinterface.valueCompareType = new int[1];
		rsinterface.requiredValues = new int[1];
		rsinterface.valueCompareType[0] = 1;
		rsinterface.requiredValues[0] = j;
		rsinterface.valueIndexArray = new int[1][3];
		rsinterface.valueIndexArray[0][0] = 5;
		rsinterface.valueIndexArray[0][1] = k;
		rsinterface.valueIndexArray[0][2] = 0;
		rsinterface.tooltip = (new StringBuilder()).append("Activate@or2@ ")
				.append(s).toString();
		RSInterface rsinterface1 = addTabInterface(i + 1);
		rsinterface1.id = i + 1;
		rsinterface1.parentID = 5608;
		rsinterface1.type = 5;
		rsinterface1.atActionType = 0;
		rsinterface1.contentType = 0;
		rsinterface1.opacity = 0;
		rsinterface1.mOverInterToTrigger = -1;
		rsinterface1.disabledSprite = imageLoader(i1, "/PRAYER/PRAYON");
		rsinterface1.enabledSprite = imageLoader(i1, "/PRAYER/PRAYOFF");
		rsinterface1.width = 34;
		rsinterface1.height = 34;
		rsinterface1.valueCompareType = new int[1];
		rsinterface1.requiredValues = new int[1];
		rsinterface1.valueCompareType[0] = 2;
		rsinterface1.requiredValues[0] = 1 + 1;
		rsinterface1.valueIndexArray = new int[1][3];
		rsinterface1.valueIndexArray[0][0] = 2;
		rsinterface1.valueIndexArray[0][1] = 5;
		rsinterface1.valueIndexArray[0][2] = 0;
	}

	public static void friendsTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(5065);
		RSInterface list = interfaceCache[5066];
		addSprite(16126, 4, "/Interfaces/Friends/SPRITE");
		addSprite(16127, 1, "/Interfaces/Friends/SPRITE");
		addText(5067, "Friends List", tda, 1, 0xff9933, true, true);
		addText(5070, "                      World 1", tda, 0, 0xff9933, false,
				true);
		addText(5071, "", tda, 0, 0xff9933, false, true);
		addHoverButton(5068, "/Interfaces/Friends/SPRITE", 6, 29, 29,
				"Add Name", 201, 5072, 1);
		addHoveredButton(5072, "/Interfaces/Friends/SPRITE", 7, 29, 29, 5073);
		addHoverButton(5069, "/Interfaces/Friends/SPRITE", 9, 29, 29,
				"Delete Name", 202, 5074, 1);
		addHoveredButton(5074, "/Interfaces/Friends/SPRITE", 10, 29, 29, 5075);
		addHoverButton(5076, "/Interfaces/Friends/SPRITE", 15, 215, 32,
				"Toggle Friends", 0, 5077, 1);
		addHoveredButton(5077, "/Interfaces/Friends/SPRITE", 16, 215, 32, 5078);
		addHoverButton(5079, "/Interfaces/Friends/SPRITE", 17, 215, 32,
				"Toggle Ignored", 0, 5080, 1);
		addHoveredButton(5080, "/Interfaces/Friends/SPRITE", 18, 215, 32, 5081);
		addText(5082, "0 / 200", tda, 0, 0xF5F5DC, false, true);
		tab.totalChildren(16);
		tab.child(0, 16127, 0, 40);
		tab.child(1, 5067, 92, 5);
		tab.child(2, 16126, 0, 40);
		tab.child(3, 5066, 0, 42);
		tab.child(4, 16126, 0, 231);
		tab.child(5, 5068, 5, 240);
		tab.child(6, 5072, 4, 240);
		tab.child(7, 5069, 25, 240);
		tab.child(8, 5074, 24, 240);
		tab.child(9, 5076, 150, 236);
		tab.child(10, 5077, 150, 237);
		tab.child(11, 5079, 170, 236);
		tab.child(12, 5080, 170, 237);
		tab.child(13, 5070, 10, 25);
		tab.child(14, 5071, 106, 237);
		tab.child(15, 5082, 46, 245);
		list.height = 189;
		list.width = 174;
		list.scrollMax = 200;
		for (int id = 5092, i = 0; id <= 5191 && i <= 99; id++, i++) {
			list.children[i] = id;
			list.childX[i] = 3;
			list.childY[i] = list.childY[i] - 7;
		}
		for (int id = 5192, i = 100; id <= 5291 && i <= 199; id++, i++) {
			list.children[i] = id;
			list.childX[i] = 131;
			list.childY[i] = list.childY[i] - 7;
		}
	}

	public static void ignoreTab(TextDrawingArea[] tda) {
		RSInterface tab = addTabInterface(5715);
		RSInterface list = interfaceCache[5716];
		addText(5717, "Ignore List", tda, 1, 0xff9933, true, true);
		addText(5720, "World 1", tda, 0, 0xff9933, false, true);
		addText(5721, "", tda, 0, 0xff9933, false, true);
		addHoverButton(5718, "/Interfaces/Friends/SPRITE", 11, 29, 29,
				"Add Name", 501, 5722, 1);
		addHoveredButton(5722, "/Interfaces/Friends/SPRITE", 12, 29, 29, 5723);
		addHoverButton(5719, "/Interfaces/Friends/SPRITE", 13, 29, 29,
				"Delete Name", 502, 5724, 1);
		addHoveredButton(5724, "/Interfaces/Friends/SPRITE", 14, 29, 29, 5725);
		addText(5727, "0 / 100", tda, 0, 0xF5F5DC, false, true);
		tab.totalChildren(16);
		tab.child(0, 5717, 92, 5);
		tab.child(1, 16127, 0, 40);
		tab.child(2, 16126, 0, 40);
		tab.child(3, 5716, 0, 42);
		tab.child(4, 16126, 0, 231);
		tab.child(5, 5718, 5, 240);
		tab.child(6, 5722, 4, 240);
		tab.child(7, 5719, 25, 240);
		tab.child(8, 5724, 24, 240);
		tab.child(9, 5727, 46, 245);
		tab.child(10, 5076, 150, 236);
		tab.child(11, 5077, 150, 237);
		tab.child(12, 5079, 170, 236);
		tab.child(13, 5080, 170, 237);
		tab.child(14, 5720, 70, 25);
		tab.child(15, 5721, 108, 237);
		list.height = 189;
		list.width = 174;
		list.scrollMax = 200;
		for (int id = 5742, i = 0; id <= 5841 && i <= 99; id++, i++) {
			list.children[i] = id;
			list.childX[i] = 3;
			list.childY[i] = list.childY[i] - 7;
		}
	}

	private static Sprite CustomSpriteLoader(int i, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null) {
			return sprite;
		}
		try {
			sprite = new Sprite((new StringBuilder()).append("/Attack/")
					.append(i).append(s).toString());
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public static RSInterface addInterface(int i) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.width = 512;
		rsinterface.height = 334;
		return rsinterface;
	}

	public static void addText(int i, String s,
			TextDrawingArea textDrawingAreas[], int j, int k, boolean flag) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		if (flag) {
			rsinterface.centerText = true;
		}
		rsinterface.textShadow = true;
		rsinterface.textDrawingAreas = textDrawingAreas[j];
		rsinterface.message = s;
		rsinterface.textColor = k;
		rsinterface.id = i;
		rsinterface.type = 4;
	}

	public static void textColor(int i, int j) {
		RSInterface rsinterface = interfaceCache[i];
		rsinterface.textColor = j;
	}

	public static void textSize(int i, TextDrawingArea textDrawingAreas[], int j) {
		RSInterface rsinterface = interfaceCache[i];
		rsinterface.textDrawingAreas = textDrawingAreas[j];
	}

	public static void addCacheSprite(int i, int j, int k, String s) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.disabledSprite = method207(j, aClass44, s);
		rsinterface.enabledSprite = method207(k, aClass44, s);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 5;
	}

	public static void sprite1(int i, int j) {
		RSInterface rsinterface = interfaceCache[i];
		rsinterface.disabledSprite = CustomSpriteLoader(j, "");
	}

	public static void addActionButton(int i, int j, int k, int l, int i1,
			String s) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.disabledSprite = CustomSpriteLoader(j, "");
		if (k == j) {
			rsinterface.enabledSprite = CustomSpriteLoader(j, "a");
		} else {
			rsinterface.enabledSprite = CustomSpriteLoader(k, "");
		}
		rsinterface.tooltip = s;
		rsinterface.contentType = 0;
		rsinterface.atActionType = 1;
		rsinterface.width = l;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 5;
		rsinterface.height = i1;
	}

	public static void addToggleButton(int i, int j, int k, int l, int i1,
			String s) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.disabledSprite = CustomSpriteLoader(j, "");
		rsinterface.enabledSprite = CustomSpriteLoader(j, "a");
		rsinterface.requiredValues = new int[1];
		rsinterface.requiredValues[0] = 1;
		rsinterface.valueCompareType = new int[1];
		rsinterface.valueCompareType[0] = 1;
		rsinterface.valueIndexArray = new int[1][3];
		rsinterface.valueIndexArray[0][0] = 5;
		rsinterface.valueIndexArray[0][1] = k;
		rsinterface.valueIndexArray[0][2] = 0;
		rsinterface.atActionType = 4;
		rsinterface.width = l;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 5;
		rsinterface.height = i1;
		rsinterface.tooltip = s;
	}

	public void totalChildren(int i, int j, int k) {
		children = new int[i];
		childX = new int[j];
		childY = new int[k];
	}

	public static void removeSomething(int id) {
		@SuppressWarnings("unused")
		RSInterface rsi = interfaceCache[id] = new RSInterface();
	}

	public void specialBar(int i) {
		addActionButton(i - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");
		for (int j = i - 11; j < i; j++)
			removeSomething(j);

		RSInterface rsinterface = interfaceCache[i - 12];
		rsinterface.width = 150;
		rsinterface.height = 26;
		rsinterface = interfaceCache[i];
		rsinterface.width = 150;
		rsinterface.height = 26;
		rsinterface.child(0, i - 12, 0, 0);
		rsinterface.child(12, i + 1, 2, 7);
		rsinterface.child(23, i + 12, 16, 8);
		for (int k = 13; k < 23; k++) {
			rsinterface.childY[k]--;
		}

		rsinterface = interfaceCache[i + 1];
		rsinterface.type = 5;
		rsinterface.disabledSprite = CustomSpriteLoader(7600, "");
		for (int l = i + 2; l < i + 12; l++) {
			RSInterface rsinterface1 = interfaceCache[l];
			rsinterface1.type = 5;
		}

		sprite1(i + 2, 7601);
		sprite1(i + 3, 7602);
		sprite1(i + 4, 7603);
		sprite1(i + 5, 7604);
		sprite1(i + 6, 7605);
		sprite1(i + 7, 7606);
		sprite1(i + 8, 7607);
		sprite1(i + 9, 7608);
		sprite1(i + 10, 7609);
		sprite1(i + 11, 7610);
	}

	public static void Sidebar0(TextDrawingArea atextdrawingarea[]) {
		Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75,
				127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75,
				124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75,
				125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39,
				75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40,
				103, atextdrawingarea);
		Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75,
				124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75,
				125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41,
				75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40,
				103, atextdrawingarea);
		Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75,
				125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103,
				atextdrawingarea);
		Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75,
				46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50,
				atextdrawingarea);
		Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75,
				42, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75,
				125, 75, 29, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75,
				42, 128, 40, 50, 122, 50, 40, 103, atextdrawingarea);
		Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75,
				42, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75,
				43, 128, 40, 103, 40, 50, 122, 50, atextdrawingarea);
		Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127,
				75, 36, 128, 40, 50, 40, 103, 122, 50, atextdrawingarea);
		Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136,
				40, 120, 40, 50, 40, 85, atextdrawingarea);
		RSInterface rsinterface = addInterface(19300);
		textSize(3983, atextdrawingarea, 0);
		addToggleButton(150, 150, 172, 150, 44, "Auto Retaliate");
		rsinterface.totalChildren(2, 2, 2);
		rsinterface.child(0, 3983, 52, 25);
		rsinterface.child(1, 150, 21, 153);
		rsinterface = interfaceCache[3983];
		rsinterface.centerText = true;
		rsinterface.textColor = 0xff981f;
	}

	public static void Sidebar0a(int i, int j, int k, String s, String s1,
			String s2, String s3, int l, int i1, int j1, int k1, int l1,
			int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3,
			int i4, int j4, int k4, TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(i);
		addText(j, "-2", atextdrawingarea, 3, 0xff981f, true);
		addText(j + 11, s, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 12, s1, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 13, s2, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 14, s3, atextdrawingarea, 0, 0xff981f, false);
		rsinterface.specialBar(k);
		rsinterface.width = 190;
		rsinterface.height = 261;
		byte byte0 = 15;
		int l4 = 0;
		rsinterface.totalChildren(byte0, byte0, byte0);
		rsinterface.child(l4, j + 3, 21, 46);
		l4++;
		rsinterface.child(l4, j + 4, 104, 99);
		l4++;
		rsinterface.child(l4, j + 5, 21, 99);
		l4++;
		rsinterface.child(l4, j + 6, 105, 46);
		l4++;
		rsinterface.child(l4, j + 7, l2, i3);
		l4++;
		rsinterface.child(l4, j + 8, j3, k3);
		l4++;
		rsinterface.child(l4, j + 9, l3, i4);
		l4++;
		rsinterface.child(l4, j + 10, j4, k4);
		l4++;
		rsinterface.child(l4, j + 11, l, i1);
		l4++;
		rsinterface.child(l4, j + 12, j1, k1);
		l4++;
		rsinterface.child(l4, j + 13, l1, i2);
		l4++;
		rsinterface.child(l4, j + 14, j2, k2);
		l4++;
		rsinterface.child(l4, 19300, 0, 0);
		l4++;
		rsinterface.child(l4, j, 94, 4);
		l4++;
		rsinterface.child(l4, k, 21, 205);
		l4++;
		for (int i5 = j + 3; i5 < j + 7; i5++) {
			RSInterface rsinterface1 = interfaceCache[i5];
			rsinterface1.disabledSprite = CustomSpriteLoader(19301, "");
			rsinterface1.enabledSprite = CustomSpriteLoader(19301, "a");
			rsinterface1.width = 68;
			rsinterface1.height = 44;
		}

	}

	public static void Sidebar0b(int i, int j, String s, String s1, String s2,
			String s3, int k, int l, int i1, int j1, int k1, int l1, int i2,
			int j2, int k2, int l2, int i3, int j3, int k3, int l3, int i4,
			int j4, TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(i);
		addText(j, "-2", atextdrawingarea, 3, 0xff981f, true);
		addText(j + 11, s, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 12, s1, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 13, s2, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 14, s3, atextdrawingarea, 0, 0xff981f, false);
		rsinterface.width = 190;
		rsinterface.height = 261;
		byte byte0 = 14;
		int k4 = 0;
		rsinterface.totalChildren(byte0, byte0, byte0);
		rsinterface.child(k4, j + 3, 21, 46);
		k4++;
		rsinterface.child(k4, j + 4, 104, 99);
		k4++;
		rsinterface.child(k4, j + 5, 21, 99);
		k4++;
		rsinterface.child(k4, j + 6, 105, 46);
		k4++;
		rsinterface.child(k4, j + 7, k2, l2);
		k4++;
		rsinterface.child(k4, j + 8, i3, j3);
		k4++;
		rsinterface.child(k4, j + 9, k3, l3);
		k4++;
		rsinterface.child(k4, j + 10, i4, j4);
		k4++;
		rsinterface.child(k4, j + 11, k, l);
		k4++;
		rsinterface.child(k4, j + 12, i1, j1);
		k4++;
		rsinterface.child(k4, j + 13, k1, l1);
		k4++;
		rsinterface.child(k4, j + 14, i2, j2);
		k4++;
		rsinterface.child(k4, 19300, 0, 0);
		k4++;
		rsinterface.child(k4, j, 94, 4);
		k4++;
		for (int l4 = j + 3; l4 < j + 7; l4++) {
			RSInterface rsinterface1 = interfaceCache[l4];
			rsinterface1.disabledSprite = CustomSpriteLoader(19301, "");
			rsinterface1.enabledSprite = CustomSpriteLoader(19301, "a");
			rsinterface1.width = 68;
			rsinterface1.height = 44;
		}

	}

	public static void Sidebar0c(int i, int j, int k, String s, String s1,
			String s2, int l, int i1, int j1, int k1, int l1, int i2, int j2,
			int k2, int l2, int i3, int j3, int k3,
			TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(i);
		addText(j, "-2", atextdrawingarea, 3, 0xff981f, true);
		addText(j + 9, s, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 10, s1, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 11, s2, atextdrawingarea, 0, 0xff981f, false);
		rsinterface.specialBar(k);
		rsinterface.width = 190;
		rsinterface.height = 261;
		byte byte0 = 12;
		int l3 = 0;
		rsinterface.totalChildren(byte0, byte0, byte0);
		rsinterface.child(l3, j + 3, 21, 99);
		l3++;
		rsinterface.child(l3, j + 4, 105, 46);
		l3++;
		rsinterface.child(l3, j + 5, 21, 46);
		l3++;
		rsinterface.child(l3, j + 6, j2, k2);
		l3++;
		rsinterface.child(l3, j + 7, l2, i3);
		l3++;
		rsinterface.child(l3, j + 8, j3, k3);
		l3++;
		rsinterface.child(l3, j + 9, l, i1);
		l3++;
		rsinterface.child(l3, j + 10, j1, k1);
		l3++;
		rsinterface.child(l3, j + 11, l1, i2);
		l3++;
		rsinterface.child(l3, 19300, 0, 0);
		l3++;
		rsinterface.child(l3, j, 94, 4);
		l3++;
		rsinterface.child(l3, k, 21, 205);
		l3++;
		for (int i4 = j + 3; i4 < j + 6; i4++) {
			RSInterface rsinterface1 = interfaceCache[i4];
			rsinterface1.disabledSprite = CustomSpriteLoader(19301, "");
			rsinterface1.enabledSprite = CustomSpriteLoader(19301, "a");
			rsinterface1.width = 68;
			rsinterface1.height = 44;
		}

	}

	public static void Sidebar0d(int i, int j, String s, String s1, String s2,
			int k, int l, int i1, int j1, int k1, int l1, int i2, int j2,
			int k2, int l2, int i3, int j3, TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(i);
		addText(j, "-2", atextdrawingarea, 3, 0xff981f, true);
		addText(j + 9, s, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 10, s1, atextdrawingarea, 0, 0xff981f, false);
		addText(j + 11, s2, atextdrawingarea, 0, 0xff981f, false);
		addText(353, "Spell", atextdrawingarea, 0, 0xff981f, false);
		addText(354, "Spell", atextdrawingarea, 0, 0xff981f, false);
		addCacheSprite(337, 19, 0, "combaticons");
		addCacheSprite(338, 13, 0, "combaticons2");
		addCacheSprite(339, 14, 0, "combaticons2");
		addToggleButton(349, 349, 129, 68, 44, "Select");
		addToggleButton(350, 350, 108, 68, 44, "Select");
		rsinterface.width = 190;
		rsinterface.height = 261;
		byte byte0 = 15;
		int k3 = 0;
		rsinterface.totalChildren(byte0, byte0, byte0);
		rsinterface.child(k3, j + 3, 20, 115);
		k3++;
		rsinterface.child(k3, j + 4, 20, 80);
		k3++;
		rsinterface.child(k3, j + 5, 20, 45);
		k3++;
		rsinterface.child(k3, j + 6, i2, j2);
		k3++;
		rsinterface.child(k3, j + 7, k2, l2);
		k3++;
		rsinterface.child(k3, j + 8, i3, j3);
		k3++;
		rsinterface.child(k3, j + 9, k, l);
		k3++;
		rsinterface.child(k3, j + 10, i1, j1);
		k3++;
		rsinterface.child(k3, j + 11, k1, l1);
		k3++;
		rsinterface.child(k3, 349, 105, 46);
		k3++;
		rsinterface.child(k3, 350, 104, 106);
		k3++;
		rsinterface.child(k3, 353, 125, 74);
		k3++;
		rsinterface.child(k3, 354, 125, 134);
		k3++;
		rsinterface.child(k3, 19300, 0, 0);
		k3++;
		rsinterface.child(k3, j, 94, 4);
		k3++;
	}

	public static void emoteTab() {
		RSInterface tab = addTabInterface(147);
		RSInterface scroll = addTabInterface(148);
		tab.totalChildren(1);
		tab.child(0, 148, 0, 1);
		int[] ButtonIDs = { 168, 169, 164, 165, 162, 163, 13370, 171, 167, 170,
				13366, 13368, 166, 13363, 13364, 13365, 161, 11100, 13362,
				13367, 172, 13369, 13383, 13384, 667, 6503, 6506, 666, 18464,
				18465, 15166, 18686, 18689, 18688, 18691, 18692, 18687, 154,
				22586, 22587, 22588, 22589, 22590, 22591, 22592, 22593, 22594 };
		int[] EmoteX = { 10, 54, 98, 137, 9, 48, 95, 137, 7, 51, 95, 139, 6,
				50, 90, 135, 8, 51, 99, 137, 10, 53, 88, 138, 3, 52, 96, 141,
				5, 53, 88, 142, 10, 51, 139, 88, 12, 49, 97, 140, 10, 50, 90,
				140, 10, 60, 90 };
		int[] EmoteY = { 6, 6, 13, 6, 55, 55, 55, 55, 104, 104, 103, 104, 153,
				153, 153, 153, 203, 202, 203, 202, 250, 250, 255, 249, 300,
				299, 299, 299, 349, 350, 352, 350, 401, 402, 406, 402, 452,
				450, 452, 452, 505, 505, 505, 505, 560, 560, 560 };
		int[] EmoteIDs = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 33, 34, 35,
				36, 28, 29, 30, 37, 31, 32, 38, 39, 40, 41, 42, 43, 44, 45, 46 };
		String[] EmoteTooltip = { "Yes", "No", "Bow", "Angry", "Think", "Wave",
				"Shrug", "Cheer", "Beckon", "Laugh", "Jump for Joy", "Yawn",
				"Dance", "Jig", "Spin", "Headbang", "Cry", "Blow Kiss",
				"Panic", "Raspberry", "Clap", "Salute", "Goblin Bow",
				"Goblin Salute", "Glass Box", "Climb Rope", "Lean on Air",
				"Glass Wall", "Idea", "Stomp", "Flap", "Slap Head",
				"Zombie Walk", "Zombie Dance", "Scared", "Zombie Hand",
				"Bunny Hop", "Skill Cape", "Snowman Dance", "Air Guitar",
				"Safety First", "Explore", "Trick", "Freeze & Melt",
				"Give Thanks", "Around The World In Eggty Days",
				"Dramatic Point" };
		scroll.totalChildren(ButtonIDs.length);
		for (int index = 0; index < ButtonIDs.length; index++) {
			addButton(ButtonIDs[index], EmoteIDs[index], "Emotes/EMOTE",
					EmoteTooltip[index]);
		}
		for (int index = 0; index < ButtonIDs.length; index++) {
			scroll.child(index, ButtonIDs[index], EmoteX[index], EmoteY[index]);
		}
		scroll.width = 173;
		scroll.height = 260;
		scroll.scrollMax = 610;
	}

	public static void optionTab(TextDrawingArea tda[]) {
		RSInterface rsinterface = addTabInterface(904);
		RSInterface rsinterface1 = interfaceCache[149];
		rsinterface1.textColor = 0xff9933;
		addSprite(905, 9, "/Options/SPRITE");
		addSprite(907, 18, "/Options/SPRITE");
		addSprite(909, 29, "/Options/SPRITE");
		addSprite(951, 32, "/Options/SPRITE");
		addSprite(953, 33, "/Options/SPRITE");
		addSprite(955, 34, "/Options/SPRITE");
		addSprite(947, 36, "/Options/SPRITE");
		addSprite(949, 35, "/Options/SPRITE");
		addSprite(18989, 29, "/Construction/i");
		addSprite(18991, 17, "/OptionTab/OPTION");
		addConfigButton(152, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-run", 1, 5, 173);
		addConfigButton(906, 904, 10, 14, "/Options/SPRITE", 32, 16, "Dark", 1,
				5, 166);
		addConfigButton(908, 904, 11, 15, "/Options/SPRITE", 32, 16, "Normal",
				2, 5, 166);
		addConfigButton(910, 904, 12, 16, "/Options/SPRITE", 32, 16, "Bright",
				3, 5, 166);
		addConfigButton(912, 904, 13, 17, "/Options/SPRITE", 32, 16,
				"Very Bright", 4, 5, 166);
		addConfigButton(930, 904, 19, 24, "/Options/SPRITE", 26, 16,
				"Music Off", 4, 5, 168);
		addConfigButton(931, 904, 20, 25, "/Options/SPRITE", 26, 16,
				"Music Level-1", 3, 5, 168);
		addConfigButton(932, 904, 21, 26, "/Options/SPRITE", 26, 16,
				"Music Level-2", 2, 5, 168);
		addConfigButton(933, 904, 22, 27, "/Options/SPRITE", 26, 16,
				"Music Level-3", 1, 5, 168);
		addConfigButton(934, 904, 23, 28, "/Options/SPRITE", 24, 16,
				"Music Level-4", 0, 5, 168);
		addConfigButton(941, 904, 19, 24, "/Options/SPRITE", 26, 16,
				"Default Zoom", 4, 5, 169);
		addConfigButton(942, 904, 21, 26, "/Options/SPRITE", 26, 16,
				"Manual Zoom (Scroll Wheel)", 3, 5, 169);
		addConfigButton(943, 904, 23, 28, "/Options/SPRITE", 26, 16,
				"Locked Zoom", 2, 5, 169);
		/*
		 * addConfigButton(944, 904, 22, 27, "/Options/SPRITE", 26, 16,
		 * "Zoom +3", 1, 5, 169); addConfigButton(945, 904, 23, 28,
		 * "/Options/SPRITE", 24, 16, "Zoom +4", 0, 5, 169);
		 */
		addConfigButton(913, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Mouse Buttons", 0, 5, 170);
		addConfigButton(915, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Chat Effects", 0, 5, 171);
		addConfigButton(957, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Split Private Chat", 1, 5, 287);
		addConfigButton(12464, 904, 30, 31, "/Options/SPRITE", 40, 40,
				"Toggle-Accept Aid", 0, 5, 427);
		addConfigButton(18988, 904, 30, 30, "/Options/SPRITE", 40, 40,
				"Open House Options", 0, 5, 457);
		addConfigButton(18990, 904, 30, 30, "/Options/SPRITE", 40, 40,
				"Client Settings", 0, 5, 457);
		rsinterface.totalChildren(30);
		int i = 0;
		byte byte0 = 2;
		rsinterface.child(0, 905, 13 + i, 10 + byte0);
		rsinterface.child(1, 906, 48 + i, 18 + byte0);
		rsinterface.child(2, 908, 80 + i, 18 + byte0);
		rsinterface.child(3, 910, 112 + i, 18 + byte0);
		rsinterface.child(4, 912, 144 + i, 18 + byte0);
		rsinterface.child(5, 907, 14 + i, 55 + byte0);
		rsinterface.child(6, 930, 49 + i, 61 + byte0);
		rsinterface.child(7, 931, 75 + i, 61 + byte0);
		rsinterface.child(8, 932, 101 + i, 61 + byte0);
		rsinterface.child(9, 933, 127 + i, 61 + byte0);
		rsinterface.child(10, 934, 151 + i, 61 + byte0);
		rsinterface.child(11, 909, 13 + i, 99 + byte0);
		rsinterface.child(12, 941, 49 + i, 104 + byte0);
		rsinterface.child(13, 942, 75 + i, 104 + byte0);
		rsinterface.child(14, 943, 101 + i, 104 + byte0);
		rsinterface.child(15, 913, 15, 153);
		rsinterface.child(16, 955, 19, 159);
		rsinterface.child(17, 915, 75, 153);
		rsinterface.child(18, 953, 79, 160);
		rsinterface.child(19, 957, 135, 153);
		rsinterface.child(20, 951, 139, 159);
		rsinterface.child(21, 12464, 15, 208);
		rsinterface.child(22, 949, 20, 213);
		rsinterface.child(23, 152, 75, 208);
		rsinterface.child(24, 947, 87, 212);
		rsinterface.child(25, 149, 80, 231);
		rsinterface.child(26, 18988, 135, 208);
		rsinterface.child(27, 18989, 139, 213);
		rsinterface.child(28, 18990, 135, 98);
		rsinterface.child(29, 18991, 141, 105);
	}

	public static void addText(int id, String text, TextDrawingArea wid[],
			int idx, int color) {
		RSInterface rsinterface = addTab(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 174;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = false;
		rsinterface.textShadow = true;
		rsinterface.textDrawingAreas = wid[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.anInt219 = 0;
		rsinterface.anInt216 = 0;
		rsinterface.anInt239 = 0;
	}

	public static int boxIds[] = { 4041, 4077, 4113, 4047, 4083, 4119, 4053,
			4089, 4125, 4059, 4095, 4131, 4065, 4101, 4137, 4071, 4107, 4143,
			4154, 12168, 13918 };

	public static RSInterface addTab(int i) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 0;
		return rsinterface;
	}

	public static void addButton(int i, int j, int hoverId, String name, int W,
			int H, String S, int AT) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.id = i;
		RSInterface.parentID = i;
		RSInterface.type = 5;
		RSInterface.atActionType = AT;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = hoverId;
		RSInterface.disabledSprite = imageLoader(j, name);
		RSInterface.enabledSprite = imageLoader(j, name);
		RSInterface.width = W;
		RSInterface.height = H;
		RSInterface.tooltip = S;
	}

	public static void addText(int i, String s, int j, boolean flag,
			boolean flag1, int k, TextDrawingArea atextdrawingarea[], int l) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 0;
		rsinterface.height = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = k;
		rsinterface.centerText = flag;
		rsinterface.textShadow = flag1;
		rsinterface.textDrawingAreas = atextdrawingarea[l];
		rsinterface.message = s;
		rsinterface.aString228 = "";
		rsinterface.textColor = j;
	}

	public static void Pestpanel(TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(21005);
		addText(21006, "Next Departure:", 0xCCCBCB, false, true, 52,
				atextdrawingarea, 1);
		addText(21007, "Players Ready:", 0x5BD230, false, true, 52,
				atextdrawingarea, 1);
		addText(21008, "(Need 5 to 25 players)", 0xDED36A, false, true, 52,
				atextdrawingarea, 1);
		addText(21009, "Pest Points:", 0x99FFFF, false, true, 52,
				atextdrawingarea, 1);
		byte byte0 = 4;
		rsinterface.children = new int[byte0];
		rsinterface.childX = new int[byte0];
		rsinterface.childY = new int[byte0];
		setBounds(21006, 15, 12, 0, rsinterface);
		setBounds(21007, 15, 30, 1, rsinterface);
		setBounds(21008, 15, 48, 2, rsinterface);
		setBounds(21009, 15, 66, 3, rsinterface);
	}

	public static void Pestpanel2(TextDrawingArea atextdrawingarea[]) {
		RSInterface rsinterface = addInterface(21100);
		addSprite(21101, 0, "Pest Control/PEST1");
		addSprite(21102, 1, "Pest Control/PEST1");
		addSprite(21103, 2, "Pest Control/PEST1");
		addSprite(21104, 3, "Pest Control/PEST1");
		addSprite(21105, 4, "Pest Control/PEST1");
		addSprite(21106, 5, "Pest Control/PEST1");
		addText(21107, "W", 0xcc00cc, false, true, 52, atextdrawingarea, 1);
		addText(21108, "E", 0x0000FF, false, true, 52, atextdrawingarea, 1);
		addText(21109, "SE", 0xffff44, false, true, 52, atextdrawingarea, 1);
		addText(21110, "SW", 0xcc0000, false, true, 52, atextdrawingarea, 1);
		addText(21111, "250", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21112, "250", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21113, "250", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21114, "250", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21115, "***", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21116, "***", 0x99ff33, false, true, 52, atextdrawingarea, 1);
		addText(21117, "Time Remaining:", 0xffffff, false, true, 52,
				atextdrawingarea, 0);
		addText(21118, "10 Minutes", 0xffffff, false, true, 52,
				atextdrawingarea, 0);
		byte byte0 = 18;
		rsinterface.children = new int[byte0];
		rsinterface.childX = new int[byte0];
		rsinterface.childY = new int[byte0];
		setBounds(21101, 361, 26, 0, rsinterface);
		setBounds(21102, 396, 26, 1, rsinterface);
		setBounds(21103, 436, 26, 2, rsinterface);
		setBounds(21104, 474, 26, 3, rsinterface);
		setBounds(21105, 3, 21, 4, rsinterface);
		setBounds(21106, 3, 50, 5, rsinterface);
		setBounds(21107, 371, 60, 6, rsinterface);
		setBounds(21108, 409, 60, 7, rsinterface);
		setBounds(21109, 443, 60, 8, rsinterface);
		setBounds(21110, 479, 60, 9, rsinterface);
		setBounds(21111, 362, 10, 10, rsinterface);
		setBounds(21112, 398, 10, 11, rsinterface);
		setBounds(21113, 436, 10, 12, rsinterface);
		setBounds(21114, 475, 10, 13, rsinterface);
		setBounds(21115, 32, 32, 14, rsinterface);
		setBounds(21116, 32, 62, 15, rsinterface);
		setBounds(21117, 8, 88, 16, rsinterface);
		setBounds(21118, 87, 88, 17, rsinterface);
	}

	public static void addHoverBox(int i, String s) {
		RSInterface rsinterface = interfaceCache[i];
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.type = 8;
		rsinterface.hoverText = s;
	}

	public static void addText(int i, String s,
			TextDrawingArea atextdrawingarea[], int j, int k, boolean flag,
			boolean flag1) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 0;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = flag;
		rsinterface.textShadow = flag1;
		rsinterface.textDrawingAreas = atextdrawingarea[j];
		rsinterface.message = s;
		rsinterface.aString228 = "";
		rsinterface.textColor = k;
		rsinterface.anInt219 = 0;
		rsinterface.anInt216 = 0;
		rsinterface.anInt239 = 0;
	}

	public static void addButton(int i, int j, String s, String s1, int k, int l) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 1;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = k;
		rsinterface.height = l;
		rsinterface.tooltip = s1;
	}

	public static void addConfigButton(int i, int j, int k, int l, String s,
			int i1, int j1, String s1, int k1, int l1, int i2) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = j;
		rsinterface.id = i;
		rsinterface.type = 5;
		rsinterface.atActionType = l1;
		rsinterface.contentType = 0;
		rsinterface.width = i1;
		rsinterface.height = j1;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.valueCompareType = new int[1];
		rsinterface.requiredValues = new int[1];
		rsinterface.valueCompareType[0] = 1;
		rsinterface.requiredValues[0] = k1;
		rsinterface.valueIndexArray = new int[1][3];
		rsinterface.valueIndexArray[0][0] = 5;
		rsinterface.valueIndexArray[0][1] = i2;
		rsinterface.valueIndexArray[0][2] = 0;
		rsinterface.disabledSprite = imageLoader(k, s);
		rsinterface.enabledSprite = imageLoader(l, s);
		rsinterface.tooltip = s1;
	}

	public boolean advancedSprite = false;

	public static void addHDSprite(int id, int spriteId, int sprite2) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.advancedSprite = true;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(spriteId, "Construction/i");
		tab.enabledSprite = imageLoader(sprite2, "Construction/i");
		;

		tab.width = 512;
		tab.height = 1024;
	}

	public static void addSpriteSelectable(int id, int spriteId, int sprite2,
			int width, int height, String tooltip) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.advancedSprite = true;
		tab.atActionType = 5;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(spriteId, "Construction/i");
		;// = imageLoader(spriteId, spriteName);
		tab.enabledSprite = imageLoader(sprite2, "Construction/i");
		;// imageLoader(sprite2, spriteName);

		tab.width = width;
		tab.height = height;
		tab.tooltip = tooltip;
	}

	public static void addSprite(int i, int j, String s) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5; // 5
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = 512;
		rsinterface.height = 334;
	}

	public static void addSprite(int i, int j, URL u) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5; // 5
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = new Sprite(u);
		rsinterface.enabledSprite = rsinterface.disabledSprite;
		rsinterface.width = 512;
		rsinterface.height = 334;
	}

	public static void addSprite(int i, int j, String s, boolean isBackground) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = 124;
		rsinterface.height = 13;
	}

	public static void addHoverButton(int parentid, String s, int spriteid,
			int width, int height, String tooltip, int i1, int j1, int k1) {
		RSInterface rsinterface = addTabInterface(parentid);
		rsinterface.id = parentid;
		rsinterface.parentID = parentid;
		rsinterface.type = 5;
		rsinterface.atActionType = k1;
		rsinterface.contentType = i1;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = j1;
		rsinterface.disabledSprite = imageLoader(spriteid, s);
		rsinterface.enabledSprite = imageLoader(spriteid, s);
		rsinterface.width = width;
		rsinterface.height = height;
		rsinterface.tooltip = tooltip;
	}

	public static void addHoveredButton(int i, String s, int j, int k, int l,
			int i1) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.width = k;
		rsinterface.height = l;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.scrollMax = 0;
		addHoverImage(i1, j, j, s);
		rsinterface.totalChildren(1);
		rsinterface.child(0, i1, 0, 0);
	}

	public static void addHoverImage(int i, int j, int k, String s) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(k, s);
	}

	public static void addTransparentSprite(int i, int j, String s) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.drawsTransparent = true;
	}

	public static RSInterface addScreenInterface(int i) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 0;
		return rsinterface;
	}

	public static RSInterface addTabInterface(int i) {
		RSInterface rsinterface = interfaceCache[i] = new RSInterface();
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 700;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		return rsinterface;
	}

	private static Sprite imageLoader(int i, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null) {
			return sprite;
		}
		try {
			sprite = new Sprite((new StringBuilder()).append(s).append(" ")
					.append(i).toString());
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public void child(int i, int j, int k, int l) {
		children[i] = j;
		childX[i] = k;
		childY[i] = l;
	}

	public void totalChildren(int i) {
		children = new int[i];
		childX = new int[i];
		childY = new int[i];
	}

	private Model method206(int i, int j) {
		Model model = (Model) aMRUNodes_264.insertFromCache((i << 16) + j);
		if (model != null) {
			return model;
		}
		if (i == 1) {
			model = Model.method462(j);
		}
		if (i == 2) {
			model = NPCDef.forID(j).method160();
		}
		if (i == 3) {
			model = Client.myPlayer.method453();
		}
		if (i == 4) {
			model = ItemDef.forID(j).method202(50);
		}
		if (i == 5) {
			model = null;
		}
		if (model != null) {
			aMRUNodes_264.removeFromCache(model, (i << 16) + j);
		}
		return model;
	}

	private static Sprite method207(int i, StreamLoader streamloader, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null) {
			return sprite;
		}
		try {
			sprite = new Sprite(streamloader, s, i);
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public static void method208(boolean flag, Model model) {
		int i = 0;
		byte byte0 = 5;
		if (flag) {
			return;
		}
		aMRUNodes_264.unlinkAll();
		if (model != null && byte0 != 4) {
			aMRUNodes_264.removeFromCache(model, (byte0 << 16) + i);
		}
	}

	public Model method209(int j, int k, boolean flag, Animation animDef) {
		Model model;
		if (flag)
			model = method206(anInt255, anInt256);
		else
			model = method206(anInt233, mediaID);
		if (model == null) {
			return null;
		}
		if (k == -1 && j == -1 && model.colorValues == null)
			return model;
		Model model_1 = new Model(Model.getFlags(k, animDef)
				| Model.getFlags(j, animDef), model);
		if (k != -1 || j != -1)
			model_1.method469();
		if (k != -1)
			model_1.method470(k, animDef);
		if (j != -1)
			model_1.method470(j, animDef);
		model_1.method479(64, 768, -50, -10, -50, true, false);
		return model_1;
	}

	public RSInterface() {
	}

	public static void addButton(int id, int sId, String spriteName,
			String tooltip, int aT) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.disabledSprite = imageLoader(sId, spriteName);
		tab.enabledSprite = imageLoader(sId, spriteName);
		tab.width = tab.disabledSprite.myWidth;
		tab.height = tab.disabledSprite.myHeight;
		tab.tooltip = tooltip;
	}

	public static void addChar(int ID) {
		RSInterface t = interfaceCache[ID] = new RSInterface();
		t.id = ID;
		t.parentID = ID;
		t.type = 6;
		t.atActionType = 0;
		t.contentType = 328;
		t.width = 136;
		t.height = 168;
		t.opacity = 0;
		t.mOverInterToTrigger = 0;
		t.modelZoom = 560;
		t.modelRotation1 = 150;
		t.modelRotation2 = 0;
		t.anInt257 = -1;
		t.anInt258 = -1;
	}

	public static void equipmentScreen(TextDrawingArea[] TDA) {
		RSInterface Interface = addInterface(19148);
		addSprite(19149, 0, "Equipment/CHAR");
		addHover(19150, 3, 0, 19151, 3, "Equipment/CHAR", 21, 21, "Close");
		addHovered(19151, 2, "Equipment/CHAR", 21, 21, 19152);
		addText(19154, "Equip Your Character...", 0xFF981F, false, true, 52,
				TDA, 2);
		addText(1673, "Attack bonus", 0xFF981F, false, true, 52, TDA, 2);
		addText(1674, "Defense bonus", 0xFF981F, false, true, 52, TDA, 2);
		addText(1685, "Other bonuses", 0xFF981F, false, true, 52, TDA, 2);
		addText(1675, "Stab:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1676, "Slash:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1677, "Crush:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1678, "Magic:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1679, "Ranged:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1680, "Stab:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1681, "Slash:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1682, "Crush:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1683, "Magic:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1684, "Ranged:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1686, "Strength:", 0xFF981F, false, true, 52, TDA, 1);
		addText(1687, "Prayer:", 0xFF981F, false, true, 52, TDA, 1);
		addText(19155, "0%", 0xFF981F, false, true, 52, TDA, 1);
		addChar(19153);
		int last = 45;
		int frame = 0;
		setChildren(last, Interface);
		setBounds(19149, 12, 20, frame, Interface);
		frame++;
		setBounds(19150, 472, 27, frame, Interface);
		frame++;
		setBounds(19151, 472, 27, frame, Interface);
		frame++;
		setBounds(19153, 193, 190, frame, Interface);
		frame++;
		setBounds(19154, 23, 29, frame, Interface);
		frame++;
		setBounds(1673, 365, 71, frame, Interface);
		frame++;
		setBounds(1674, 365, 163, frame, Interface);
		frame++;
		setBounds(1675, 372, 85, frame, Interface);
		frame++;
		setBounds(1676, 372, 99, frame, Interface);
		frame++;
		setBounds(1677, 372, 113, frame, Interface);
		frame++;
		setBounds(1678, 372, 127, frame, Interface);
		frame++;
		setBounds(1679, 372, 141, frame, Interface);
		frame++;
		setBounds(1680, 372, 177, frame, Interface);
		frame++;
		setBounds(1681, 372, 191, frame, Interface);
		frame++;
		setBounds(1682, 372, 205, frame, Interface);
		frame++;
		setBounds(1683, 372, 219, frame, Interface);
		frame++;
		setBounds(1684, 372, 233, frame, Interface);
		frame++;
		setBounds(1685, 365, 253, frame, Interface);
		frame++;
		setBounds(1686, 372, 267, frame, Interface);
		frame++;
		setBounds(1687, 372, 281, frame, Interface);
		frame++;
		setBounds(19155, 94, 286, frame, Interface);
		frame++;
		setBounds(1645, 83, 106, frame, Interface);
		frame++;
		setBounds(1646, 83, 135, frame, Interface);
		frame++;
		setBounds(1647, 83, 172, frame, Interface);
		frame++;
		setBounds(1648, 83, 213, frame, Interface);
		frame++;
		setBounds(1649, 27, 185, frame, Interface);
		frame++;
		setBounds(1650, 27, 221, frame, Interface);
		frame++;
		setBounds(1651, 139, 185, frame, Interface);
		frame++;
		setBounds(1652, 139, 221, frame, Interface);
		frame++;
		setBounds(1653, 53, 148, frame, Interface);
		frame++;
		setBounds(1654, 112, 148, frame, Interface);
		frame++;
		setBounds(1655, 63, 109, frame, Interface);
		frame++;
		setBounds(1656, 117, 108, frame, Interface);
		frame++;
		setBounds(1657, 83, 71, frame, Interface);
		frame++;
		setBounds(1658, 42, 110, frame, Interface);
		frame++;
		setBounds(1659, 83, 110, frame, Interface);
		frame++;
		setBounds(1660, 124, 110, frame, Interface);
		frame++;
		setBounds(1661, 27, 149, frame, Interface);
		frame++;
		setBounds(1662, 83, 149, frame, Interface);
		frame++;
		setBounds(1663, 139, 149, frame, Interface);
		frame++;
		setBounds(1664, 83, 189, frame, Interface);
		frame++;
		setBounds(1665, 83, 229, frame, Interface);
		frame++;
		setBounds(1666, 27, 229, frame, Interface);
		frame++;
		setBounds(1667, 139, 229, frame, Interface);
		frame++;
		setBounds(1688, 29, 111, frame, Interface);
		frame++;
	}

	public static void EquipmentTab(TextDrawingArea[] wid) {
		RSInterface Interface = interfaceCache[1644];
		addSprite(15101, 0, "Equipment/bl");// cheap hax
		addSprite(15102, 1, "Equipment/bl");// cheap hax
		addSprite(15109, 2, "Equipment/bl");// cheap hax
		removeSomething(15103);
		removeSomething(15104);
		Interface.children[23] = 15101;
		Interface.childX[23] = 40;
		Interface.childY[23] = 205;
		Interface.children[24] = 15102;
		Interface.childX[24] = 110;
		Interface.childY[24] = 205;
		Interface.children[25] = 15109;
		Interface.childX[25] = 39;
		Interface.childY[25] = 240;
		Interface.children[26] = 27650;
		Interface.childX[26] = 0;
		Interface.childY[26] = 0;
		Interface = addInterface(27650);
		addButton(27651, 6, "Equipment/BOX", "Xp Toggle", 27659, 1, 26, 33);
		// addTooltip(27659, "Locks/unlocks your EXP");
		addButton(27653, 1, "Equipment/BOX", "Show Equipment Stats", 27655, 1,
				40, 39);
		// addTooltip(27655, "Show Equipment Stats");
		addButton(27654, 2, "Equipment/BOX", "Show Items Kept On Death", 27657,
				1, 40, 39);
		// addTooltip(27657, "Shows items kept on death.");
		setChildren(3, Interface);
		setBounds(27651, 84, 215, 0, Interface);
		setBounds(27653, 29, 205, 1, Interface);
		setBounds(27654, 124, 205, 2, Interface);
		// setBounds(27659, 39, 240, 3, Interface);
		// setBounds(27655, 39, 240, 4, Interface);
		// setBounds(27657, 39, 240, 5, Interface);
		addText(14500, "1", 0xFF981F, false, true, 52, wid, 1);
		addText(14508, "2", 0xFF981F, false, true, 52, wid, 1);
		addText(14505, "0", 0xFF981F, false, true, 52, wid, 1);
		addText(14510, "0", 0xFF981F, false, true, 52, wid, 1);
	}

	public static void addButton(int id, int sid, String spriteName,
			String tooltip, int mOver, int atAction, int width, int height) {
		RSInterface tab = interfaceCache[id] = new RSInterface();
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = atAction;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = mOver;
		tab.disabledSprite = imageLoader(sid, spriteName);
		tab.enabledSprite = imageLoader(sid, spriteName);
		tab.width = width;
		tab.height = height;
		tab.tooltip = tooltip;
	}

	public boolean inventoryhover;

	public static void addActionButton(int id, int sprite, int sprite2,
			int width, int height, String s, String folder) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		if (folder.equalsIgnoreCase("equipment")) {
			rsi.disabledSprite = imageLoader("equipment", sprite, "Equipment/CUSTOM");
		} else if (folder.equalsIgnoreCase("attack")) {
			rsi.disabledSprite = imageLoader("attack", sprite, "");
		} else {
			rsi.disabledSprite = imageLoader("misc", sprite, "");
		}
		if (sprite2 == sprite) {
			rsi.enabledSprite = imageLoader("attack", sprite, "a");
		} else {
			rsi.enabledSprite = imageLoader("attack", sprite2, "");
		}
		rsi.tooltip = s;
		rsi.contentType = 0;
		rsi.atActionType = 1;
		rsi.width = width;
		rsi.mOverInterToTrigger = 52;
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
		rsi.height = height;
	}

	private static Sprite imageLoader(String folder, int i, String s) {
		long l = (TextClass.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
		if (sprite != null)
			return sprite;
		try {
			if (folder.equals("attack")) {
				sprite = new Sprite("" + folder + "/" + i + "" + s + "");
			} else {
				sprite = new Sprite("" + folder + "/" + s + " " + i + "");
			}
			aMRUNodes_238.removeFromCache(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public static void addClick(int id, int spriteOnId, int spriteOffId,
			String castText, int h, int w) {
		RSInterface rsi = interfaceCache[id] = new RSInterface();
		rsi.id = id;
		rsi.parentID = id;
		rsi.type = 5;
		rsi.atActionType = 1;
		rsi.contentType = 0;
		rsi.width = h;
		rsi.height = w;
		rsi.opacity = (byte) 0;
		rsi.mOverInterToTrigger = 52;
		rsi.selectedActionName = "Cast On";
		rsi.spellName = castText;
		rsi.disabledSprite = imageLoader("equipment", spriteOnId, "interface");
		rsi.enabledSprite = imageLoader("equipment", spriteOffId, "interface");
		rsi.tooltip = castText;
	}

	// public static TextDrawingArea[] fonts;

	public static void addText(int i, String s, int k, boolean l, boolean m,
			int a, int j) {
		RSInterface rsinterface = addTabInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 0;
		rsinterface.width = 0;
		rsinterface.height = 0;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = a;
		rsinterface.centerText = l;
		rsinterface.textShadow = m;
		rsinterface.textDrawingAreas = RSInterface.fonts[j];
		rsinterface.message = s;
		rsinterface.textColor = k;
	}

	private static Sprite loadSprite(int i, String s) {

		Sprite sprite;
		try {
			sprite = new Sprite(s + " " + i);
			if (sprite != null) {
				return sprite;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	public Sprite loadSprite(String s, int i) {
		Sprite sprite;
		try {
			sprite = new Sprite(s + " " + i);
			if (sprite != null) {
				return sprite;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void addLunarSprite(int i, int j, String name) {
		RSInterface RSInterface = addTabInterface(i);
		RSInterface.id = i;
		RSInterface.parentID = i;
		RSInterface.type = 5;
		RSInterface.atActionType = 0;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.disabledSprite = imageLoader(j, name);
		RSInterface.width = 500;
		RSInterface.height = 500;
		RSInterface.tooltip = "";
	}

	public static void drawRune(int i, int id, String runeName) {
		RSInterface RSInterface = addTabInterface(i);
		RSInterface.type = 5;
		RSInterface.atActionType = 0;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.disabledSprite = loadSprite(id, "Lunar/RUNE");
		RSInterface.width = 500;
		RSInterface.height = 500;
	}

	public static void addRuneText(int ID, int runeAmount, int RuneID,
			TextDrawingArea[] font) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 4;
		rsInterface.atActionType = 0;
		rsInterface.contentType = 0;
		rsInterface.width = 0;
		rsInterface.height = 14;
		rsInterface.opacity = 0;
		rsInterface.mOverInterToTrigger = -1;
		rsInterface.valueCompareType = new int[1];
		rsInterface.requiredValues = new int[1];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = runeAmount;
		rsInterface.valueIndexArray = new int[1][4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = RuneID;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.centerText = true;
		rsInterface.textDrawingAreas = font[0];
		rsInterface.textShadow = true;
		rsInterface.message = "%1/" + runeAmount + "";
		rsInterface.aString228 = "";
		rsInterface.textColor = 12582912;
		rsInterface.anInt219 = 49152;
	}

	public static void homeTeleport() {
		RSInterface RSInterface = addTabInterface(30000);
		RSInterface.tooltip = "Cast @gre@Lunar Home Teleport";
		RSInterface.id = 30000;
		RSInterface.parentID = 30000;
		RSInterface.type = 5;
		RSInterface.atActionType = 5;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 30001;
		RSInterface.disabledSprite = loadSprite(1, "Lunar/SPRITE");
		RSInterface.width = 20;
		RSInterface.height = 20;
		RSInterface hover = addTabInterface(30001);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(1, hover);
		addLunarSprite(30002, 0, "Lunar/SPRITE");
		setBounds(30002, 0, 0, 0, hover);
	}

	public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1,
			int ra2, int rune1, int lvl, String name, String descr,
			TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast On";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.valueCompareType = new int[3];
		rsInterface.requiredValues = new int[3];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = ra1;
		rsInterface.valueCompareType[1] = 3;
		rsInterface.requiredValues[1] = ra2;
		rsInterface.valueCompareType[2] = 3;
		rsInterface.requiredValues[2] = lvl;
		rsInterface.valueIndexArray = new int[3][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[3];
		rsInterface.valueIndexArray[2][0] = 1;
		rsInterface.valueIndexArray[2][1] = 6;
		rsInterface.valueIndexArray[2][2] = 0;
		rsInterface.enabledSprite = loadSprite(sid, "Lunar/LUNARON");
		if (name.toLowerCase().contains("teleport"))
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNARON");
		else
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(7, hover);
		addLunarSprite(ID + 2, 0, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true,
				true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 19, 2, hover);
		setBounds(30016, 37, 35, 3, hover);// Rune
		setBounds(rune1, 112, 35, 4, hover);// Rune
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 50, 66, 5, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 123, 66, 6, hover);

	}

	public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3,
			int ra1, int ra2, int ra3, int rune1, int rune2, int lvl,
			String name, String descr, TextDrawingArea[] TDA, int sid, int suo,
			int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.valueCompareType = new int[4];
		rsInterface.requiredValues = new int[4];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = ra1;
		rsInterface.valueCompareType[1] = 3;
		rsInterface.requiredValues[1] = ra2;
		rsInterface.valueCompareType[2] = 3;
		rsInterface.requiredValues[2] = ra3;
		rsInterface.valueCompareType[3] = 3;
		rsInterface.requiredValues[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.enabledSprite = loadSprite(sid, "Lunar/LUNARON");
		if (name.toLowerCase().contains("teleport"))
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNARON");
		else
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 0, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true,
				true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 19, 2, hover);
		setBounds(30016, 14, 35, 3, hover);
		setBounds(rune1, 74, 35, 4, hover);
		setBounds(rune2, 130, 35, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 66, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 66, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 66, 8, hover);
	}

	public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3,
			int ra1, int ra2, int ra3, int rune1, int rune2, int lvl,
			String name, String descr, TextDrawingArea[] TDA, int sid, int suo,
			int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.valueCompareType = new int[4];
		rsInterface.requiredValues = new int[4];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = ra1;
		rsInterface.valueCompareType[1] = 3;
		rsInterface.requiredValues[1] = ra2;
		rsInterface.valueCompareType[2] = 3;
		rsInterface.requiredValues[2] = ra3;
		rsInterface.valueCompareType[3] = 3;
		rsInterface.requiredValues[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.enabledSprite = loadSprite(sid, "Lunar/LUNARON");
		if (name.toLowerCase().contains("teleport"))
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNARON");
		else
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.mOverInterToTrigger = -1;
		hover.isMouseoverTriggered = true;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 1, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true,
				true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 21, 2, hover);
		setBounds(30016, 14, 48, 3, hover);
		setBounds(rune1, 74, 48, 4, hover);
		setBounds(rune2, 130, 48, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 79, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 79, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 79, 8, hover);
	}

	public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3,
			int ra1, int ra2, int ra3, int rune1, int rune2, int lvl,
			String name, String descr, TextDrawingArea[] TDA, int sid, int suo,
			int type) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.valueCompareType = new int[4];
		rsInterface.requiredValues = new int[4];
		rsInterface.valueCompareType[0] = 3;
		rsInterface.requiredValues[0] = ra1;
		rsInterface.valueCompareType[1] = 3;
		rsInterface.requiredValues[1] = ra2;
		rsInterface.valueCompareType[2] = 3;
		rsInterface.requiredValues[2] = ra3;
		rsInterface.valueCompareType[3] = 3;
		rsInterface.requiredValues[3] = lvl;
		rsInterface.valueIndexArray = new int[4][];
		rsInterface.valueIndexArray[0] = new int[4];
		rsInterface.valueIndexArray[0][0] = 4;
		rsInterface.valueIndexArray[0][1] = 3214;
		rsInterface.valueIndexArray[0][2] = r1;
		rsInterface.valueIndexArray[0][3] = 0;
		rsInterface.valueIndexArray[1] = new int[4];
		rsInterface.valueIndexArray[1][0] = 4;
		rsInterface.valueIndexArray[1][1] = 3214;
		rsInterface.valueIndexArray[1][2] = r2;
		rsInterface.valueIndexArray[1][3] = 0;
		rsInterface.valueIndexArray[2] = new int[4];
		rsInterface.valueIndexArray[2][0] = 4;
		rsInterface.valueIndexArray[2][1] = 3214;
		rsInterface.valueIndexArray[2][2] = r3;
		rsInterface.valueIndexArray[2][3] = 0;
		rsInterface.valueIndexArray[3] = new int[3];
		rsInterface.valueIndexArray[3][0] = 1;
		rsInterface.valueIndexArray[3][1] = 6;
		rsInterface.valueIndexArray[3][2] = 0;
		rsInterface.enabledSprite = loadSprite(sid, "Lunar/LUNARON");
		if (name.toLowerCase().contains("teleport"))
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNARON");
		else
			rsInterface.disabledSprite = loadSprite(sid, "Lunar/LUNAROFF");
		RSInterface hover = addTabInterface(ID + 1);
		hover.isMouseoverTriggered = true;
		hover.mOverInterToTrigger = -1;
		setChildren(9, hover);
		addLunarSprite(ID + 2, 2, "Lunar/BOX");
		setBounds(ID + 2, 0, 0, 0, hover);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true,
				true, 52, 1);
		setBounds(ID + 3, 90, 4, 1, hover);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, 0);
		setBounds(ID + 4, 90, 34, 2, hover);
		setBounds(30016, 14, 61, 3, hover);
		setBounds(rune1, 74, 61, 4, hover);
		setBounds(rune2, 130, 61, 5, hover);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, hover);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, hover);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, hover);
	}

	public static void configureLunar(TextDrawingArea[] TDA) {
		homeTeleport();
		drawRune(30003, 1, "Fire");
		drawRune(30004, 2, "Water");
		drawRune(30005, 3, "Air");
		drawRune(30006, 4, "Earth");
		drawRune(30007, 5, "Mind");
		drawRune(30008, 6, "Body");
		drawRune(30009, 7, "Death");
		drawRune(30010, 8, "Nature");
		drawRune(30011, 9, "Chaos");
		drawRune(30012, 10, "Law");
		drawRune(30013, 11, "Cosmic");
		drawRune(30014, 12, "Blood");
		drawRune(30015, 13, "Soul");
		drawRune(30016, 14, "Astral");
		addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004,
				64, "Bake Pie", "Bake pies without a stove", TDA, 0, 16, 2);
		addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant",
				"Cure disease on farming patch", TDA, 1, 4, 2);
		addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65,
				"Monster Examine",
				"Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
		addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005,
				66, "NPC Contact", "Speak with varied NPCs", TDA, 3, 0, 5);
		addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006,
				67, "Cure Other", "Cure poisoned players", TDA, 4, 8, 2);
		addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003,
				67, "Humidify", "Fills certain vessels with water", TDA, 5, 0,
				5);
		addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006,
				68, "Moonclan Teleport", "Teleports you to Lunar Isle", TDA, 6,
				0, 5);
		addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69,
				"Tele Group Moonclan", "Teleports players to Lunar Isle", TDA,
				7, 0, 5);
		addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006,
				70, "Ourania Teleport", "Teleports you to Ourania", TDA, 8, 0,
				5);
		addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012,
				70, "Cure Me", "Cures Poison", TDA, 9, 0, 5);
		addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit",
				"Get a kit of hunting gear", TDA, 10, 0, 5);
		addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004,
				71, "Waterbirth Teleport", "Teleports you to Waterbirth", TDA,
				11, 0, 5);
		addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72,
				"Tele Group Waterbirth", "Teleports players to Waterbirth",
				TDA, 12, 0, 5);
		addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012,
				73, "Cure Group", "Cures Poison on players", TDA, 13, 0, 5);
		addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74,
				"Stat Spy",
				"Cast on another player to see\\ntheir skill levels", TDA, 14,
				8, 2);
		addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74,
				"Barbarian Teleport", "Teleports you to the Barbarian Outpost",
				TDA, 15, 0, 5);
		addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75,
				"Tele Group Barbarian",
				"Teleports players to the\\nBarbarian Outpost", TDA, 16, 0, 5);
		addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005,
				76, "Superglass Make", "Make glass without a furnace", TDA, 17,
				16, 2);
		addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004,
				77, "Khazard Teleport", "Teleports you to Port khazard", TDA,
				18, 0, 5);
		addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004,
				78, "Tele Group Khazard", "Teleports players to Port khazard",
				TDA, 19, 0, 5);
		addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78,
				"Dream", "Take a rest and restore hitpoints 3\\n times faster",
				TDA, 20, 0, 5);
		addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004,
				79, "String Jewellery", "String amulets without wool", TDA, 21,
				0, 5);
		addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004,
				80, "Boost Other Stats",
				"Temporarily increases Atk, Str\\nand Def of other players",
				TDA, 22, 0, 5);
		addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004,
				81, "Magic Imbue", "Combine runes without a talisman", TDA, 23,
				0, 5);
		addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82,
				"Fertile Soil",
				"Fertilise a farming patch with\\nsuper compost", TDA, 24, 4, 2);
		addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83,
				"Boost Stats",
				"Temporarily increases Attack,\\nStrength and Defence", TDA,
				25, 0, 5);
		addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004,
				84, "Fishing Guild Teleport",
				"Teleports you to the fishing guild", TDA, 26, 0, 5);
		addLunar3RunesLargeBox(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004,
				85, "Tele Group Fishing\\nGuild",
				"Teleports players to the Fishing\\nGuild", TDA, 27, 0, 5);
		addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010,
				85, "Plank Make", "Turn Logs into planks", TDA, 28, 16, 5);
		addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004,
				86, "Catherby Teleport", "Teleports you to Catherby", TDA, 29,
				0, 5);
		addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004,
				87, "Tele Group Catherby", "Teleports players to Catherby",
				TDA, 30, 0, 5);
		addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004,
				88, "Ice Plateau Teleport", "Teleports you to Ice Plateau",
				TDA, 31, 0, 5);
		addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89,
				"Tele Group Ice\\n Plateau",
				"\\nTeleports players to Ice Plateau", TDA, 32, 0, 5);
		addLunar3RunesBigBox(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90,
				"Energy Transfer",
				"Spend HP and REnergy to give\\naway to another player", TDA,
				33, 8, 2);
		addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91,
				"Heal Other", "Heal targeted player by\\nup to 40 HP", TDA, 34,
				8, 2);
		addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92,
				"Vengeance Other",
				"Allows another player to rebound\\ndamage to an opponent",
				TDA, 35, 8, 2);
		addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006,
				93, "Vengeance", "Rebound damage to an opponent", TDA, 36, 0, 5);
		addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94,
				"Heal Group", "Heal all players around you\\nby up to 40 HP",
				TDA, 37, 0, 5);
		addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95,
				"Spellbook Swap",
				"Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
	}

	public static void constructLunar() {
		RSInterface Interface = addTabInterface(16640);
		int[] LunarIDs = { 30000, 30017, 30025, 30032, 30040, 30048, 30056,
				30064, 30075, 30083, 30091, 30099, 30106, 30114, 30122, 30130,
				30138, 30146, 30154, 30162, 30170, 30178, 30186, 30194, 30202,
				30210, 30218, 30226, 30234, 30242, 30250, 30258, 30266, 30274,
				30282, 30290, 30298, 30306, 30314, 30322, 30001, 30018, 30026,
				30033, 30041, 30049, 30057, 30065, 30076, 30084, 30092, 30100,
				30107, 30115, 30123, 30131, 30139, 30147, 30155, 30163, 30171,
				30179, 30187, 30195, 30203, 30211, 30219, 30227, 30235, 30243,
				30251, 30259, 30267, 30275, 30283, 30291, 30299, 30307, 30323,
				30315 };
		int[] LunarX = { 11, 40, 71, 103, 133, 162, 8, 41, 71, 103, 134, 165,
				12, 42, 71, 103, 135, 165, 14, 42, 71, 101, 135, 168, 10, 42,
				74, 103, 135, 164, 10, 42, 71, 103, 138, 162, 13, 42, 69, 104,
				6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
				5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		int[] LunarY = { 10, 9, 12, 10, 12, 10, 38, 39, 39, 39, 39, 37, 68, 68,
				66, 68, 68, 68, 97, 97, 97, 97, 98, 98, 126, 124, 125, 125,
				125, 126, 155, 155, 155, 155, 155, 155, 185, 185, 183, 184,
				184, 176, 176, 163, 176, 176, 176, 176, 163, 176, 176, 176,
				176, 163, 176, 163, 163, 163, 176, 176, 176, 163, 176, 149,
				176, 163, 163, 176, 149, 176, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		Interface.totalChildren(LunarIDs.length);
		for (int index = 0; index < LunarIDs.length; index++) {
			Interface.child(index, LunarIDs[index], LunarX[index],
					LunarY[index]);
		}
	}

	public static void setBounds(int ID, int X, int Y, int frame,
			RSInterface RSinterface) {
		RSinterface.children[frame] = ID;
		RSinterface.childX[frame] = X;
		RSinterface.childY[frame] = Y;
	}

	public static void setChildren(int total, RSInterface i) {
		i.children = new int[total];
		i.childX = new int[total];
		i.childY = new int[total];
	}

	public static void addButton(int i, int j, String s, int k, int l,
			String s1, int i1) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = i1;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(j, s);
		rsinterface.enabledSprite = imageLoader(j, s);
		rsinterface.width = k;
		rsinterface.height = l;
		rsinterface.tooltip = s1;
	}

	public static void addButton(int i, String s1, int k, int l, String s) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 1;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.disabledSprite = imageLoader(s);
		rsinterface.enabledSprite = imageLoader(s);
		rsinterface.width = k;
		rsinterface.height = l;
		rsinterface.tooltip = s1;
	}

}