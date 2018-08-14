public class Configuration {
	public static boolean staffClient = false;
	public static boolean cacheUpdatingON = true;
	public static boolean displayGEItemIds = false;
	public static boolean snowON = false;
	public static boolean allObjectsHaveExamine = false;

	public static String server = "world1.zarpor.com";
	public static String serverReg = "world1.zarpor.com";

	public static String version = "7.1.8";
	public static final String STAFFIP_URL = "https://www.zarpor.com/staff.ip";
	public static boolean TEN_TIMES = true;
	public static boolean HDMinimap = true;
	public static int npcSize = 4;
	public static int modelSize = 0;
	

	public static String[] clientSettings = { "x10 Hitting", "GFX Effects",
			"New Hitpoints Bar", "Custom Cursor Icons", "Names Above Heads",
			"HP Above Heads", "Fog & Moving Water", "High Detail" };
	
	public static boolean[] clientSettingsOn = { false, false, true, true, false, false, true, true };

	public static int currentTheme = 0;
	public static int themeIndex = 0;
	public static String[] customThemes = {"Default Theme"};
	
	public static String[][] teleportOptions = {
			{ "General", "Home Teleport", "Skilling Teleport",
					"House Teleport", "", "Minigame Teleports",
					"Boss Teleports", "Training Teleports", "Slayer Teleports",
					"PK Teleports" },
			{ "Minigame Teleports", "Barrows", "Castle Wars", "Duel Arena",
					"Monster Carnage", "Pest Control", "Tzhaar Caves",
					"Warriors Guild", "Zombie Waves", },
			{ "Boss Teleports", "Barrelchest", "Bork",
					"Chaos Elemental (Wild)", "Corp Beast", "Dagannoth Kings",
					"Ice Strykewyrm", "King Black Dragon (Wild)", "Nex",
					"Nomad", "Penanace Queen", "Tormented Demons",
					"God Wars Dungeon" },
			{ "Training Teleports", "Rock Crabs (Level 13)", "Yaks (Level 22)",
					"Hill Giants (Level 28)", "Metal Dragons", "",
					"Taverly Dungeon", "Brimhaven Dungeon", "Desert Dungeon" },
			{ "Slayer Teleports", "Slayer Tower", "Slayer Dungeon",
					"Ancient Cavern", "Waterbirth Dungeon" },
			{ "PK Teleports", "Fun PK", "", "Edgeville", "Varrock",
					"Mage Bank", "Green Dragons", "Revenant Dungeon" } };
	
	public static boolean npcLeftClickCombatOff = true;

}
