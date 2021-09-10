package first_task_sandship_storage;

//Little minecraft Industrial craft and Thermal expansion mod skills required here *
public enum Material {

    IRON("Iron", "ironOre.png", "Main metal to develop", 63, 10),
    COPPER("Copper", "copperOre.png", "Main metal for circuits", 60, 20),
    LEAD("Lead", "leadOre.png", "Metal for itemductes", 25, 30),
    TIN("Tin", "tinOre.png", "Metal for capsules", 55, 40),
    SILVER("Silver", "silverOre.png", "Metal for glass fibre cable", 35, 50),
    EMERALD("Emerald", "emeraldOre.png", "Metal to trade with villagers", 32, 69),
    Ferrous("Ferrous", "ferrousOre.png", "Main metal to get platinum ingot", 2, 70),
    URANIUM("Uranium", "uraniumOre.png", "Metal to blow others up", 43, 5);

    private final String name;
    private String icon;//I guess this is changed quit a lot.
    private final String description;
    private final int spawnLayer;
    private final int space;

    Material(String name, String icon, String description, int optimalSpawnLayer, int space) {
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.spawnLayer = optimalSpawnLayer;
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public int getSpawnLayer() {
        return spawnLayer;
    }

    public int getSpace() {
        return space;
    }
}
