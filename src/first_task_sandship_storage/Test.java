package first_task_sandship_storage;

public class Test {
    public static void main(String[] args) {
        //I could have used Scanner and exception handling for more beautiful code,
        //but I have second assignment to understand and solve ...

        Storage storage1 = new Storage("Xaxage");
        Storage storage2 = new Storage("Nendreh");

        storage1.addMaterial(Material.IRON, 3);
        storage1.addMaterial(Material.COPPER, 6);
        storage1.addMaterial(Material.TIN, 8);
        System.out.println(storage1);

        storage2.addMaterial(Material.IRON, 6);
        storage2.addMaterial(Material.URANIUM, 5);
        storage2.addMaterial(Material.TIN, 32);
        System.out.println(storage2);


        storage1.transferToAnotherStorage(storage2, Material.TIN, 8);
        System.out.println(storage1);
        System.out.println(storage2);

        storage2.transferToAnotherStorage(storage1, Material.LEAD, 2);
        System.out.println(storage1);
        System.out.println(storage2);


    }
}
