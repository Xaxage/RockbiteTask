package first_task_sandship_storage;

import java.util.EnumMap;
import java.util.Map;

public class Storage {
    private final Map<Material, Integer> storageMaterials;
    private final String name;

    public Storage(String name) {
        this.name = name;
        storageMaterials = new EnumMap<>(Material.class);
    }

    //Materials that are already in a storage
    private int getPresentMaterialCount(Material material) {
        if (storageMaterials.get(material) == null) return 0;
        else return storageMaterials.get(material);
    }

    //Free space for selected material in a storage
    private int getAvailableMaterialsCapacity(Material material) {
        return material.getSpace() - getPresentMaterialCount(material);
    }

    public void addMaterial(Material material, int quantity) {
        if (quantity <= 0) System.out.println("Negative numbers and 0 are not allowed !!!");
        else if (getAvailableMaterialsCapacity(material) >= quantity) {
            if (storageMaterials.containsKey(material)) {
                storageMaterials.put(material, getPresentMaterialCount(material) + quantity);
            } else storageMaterials.put(material, quantity);
        } else System.out.println("Not enough space");
    }

    public void removeMaterial(Material material, int quantity) {
        if (quantity <= 0) System.out.println("Negative numbers and 0 are not allowed !!!");
        else if (storageMaterials.containsKey(material)) {
            if (getPresentMaterialCount(material) >= quantity) {
                storageMaterials.put(material, getPresentMaterialCount(material) - quantity);
            } else System.out.println("Not enough materials");
        }
    }

    //I could create another class like Service for this functionality. But I decided not to .
    public void transferToAnotherStorage(Storage destinationStorage, Material material, int quantity) {
        if (this.getPresentMaterialCount(material) >= quantity
                && destinationStorage.getAvailableMaterialsCapacity(material) >= quantity) {
            this.removeMaterial(material, quantity);
            destinationStorage.addMaterial(material, quantity);
        } else if (this.getPresentMaterialCount(material) < quantity) {
            System.out.println("It is impossible due to lack of materials.");
        } else if (destinationStorage.getAvailableMaterialsCapacity(material) < quantity) {
            System.out.println("It is impossible due to lack of space.");
        }
    }

    //Stream complicates codes visibility, but I DIDN'T LEARN IT FOR NOTHING. At least it'll be used once...
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Storage ").append(getName()).append(" contains : ");
        storageMaterials.forEach((key, value) -> {
            if (value != 0) stringBuilder.append("{").append(key).append("=").append(value).append("}");
        });
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }
}
