import java.util.*;

public class LaptopSeller {

    static Set<Laptop> available = new HashSet<>();
    static final Map<Integer, String> choices = new HashMap<> (){{
        put(1, "ram");
        put(2, "storage");
        put(3, "color");
        put(4, "os");
        put(5, "manufacturer");
    }};

    public static int getUserChoice(Scanner in) {

        System.out.println("Дорогой покупатель! Вас приветствует интернет-магазин <SuperNoteBook>! ");
        System.out.println("Для поиска лучшего ноутбука введите цифру, соответствующую необходимому критерию:");

        System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Цвет\n4 - Операционная система\n5 - Производитель");
        String result = in.nextLine();
        return Integer.parseInt(result);
    }

    public static int getLowerBound(Scanner in) {
        System.out.println("Введите минимальный желаемый объем: ");
        String result = in.nextLine();
        return Integer.parseInt(result);
    }

    public static String getName(Scanner in) {
        System.out.println("Введите наименование: ");
        String result = in.nextLine();
        return result.toLowerCase();
    }

    public static Set<Laptop> getByLowerBound(int lowerBound, String item) {
        Set<Laptop> result = new HashSet<>();

        for (var laptop : available) {
            if (item.equals("ram") && laptop.getRam() >= lowerBound) {
                result.add(laptop);
            } else if (item.equals("storage") && laptop.getStorage() >= lowerBound){
                result.add(laptop);
            }
        }

        return result;
    }

    public static Set<Laptop> getByName(String name, String item) {
        Set<Laptop> result = new HashSet<>();

        for (Laptop laptop : available) {
            if (item.equalsIgnoreCase("color") && laptop.getCpuType().toLowerCase().contains(name)) {
                result.add(laptop);
            } else if (item.equalsIgnoreCase("os") && laptop.getOs().toLowerCase().contains(name)) {
                result.add(laptop);
            } else if (item.equalsIgnoreCase("manufacturer") && laptop.getManufacturer().toLowerCase().contains(name)){
                result.add(laptop);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        available.add(new Laptop(4, 128, "Silver", "Integrated","IPS 14", "No OS", "Asus", 26900));
        available.add(new Laptop(4, 64, "Silver", "Integrated","IPS 14", "No OS", "Lenovo", 19900));
        available.add(new Laptop(4, 128, "Pink", "Integrated","IPS 14", "Windows 11", "Lenovo", 24900));
        available.add(new Laptop(16, 512, "Black", "Integrated","mini-LED 14", "macOS", "Apple", 262000));
        available.add(new Laptop(16, 512, "Black", "Radeon RX 6800M","IPS 17", "Windows 11", "Asus", 198000));
        available.add(new Laptop(8, 512, "Black", "Integrated Intel Iris Xe","IPS 15,6", "Windows 11", "Lenovo", 90000));

        int choice = getUserChoice(in);
        int lowerBound = 0;
        String color = "";
        String os = "";
        String maker = "";
        Set<Laptop> result;

        switch (choice) {
            case 1:
                lowerBound = getLowerBound(in);
                result = getByLowerBound(lowerBound, "ram");
                break;
            case 2:
                lowerBound = getLowerBound(in);
                result = getByLowerBound(lowerBound, "storage");
                break;
            case 3:
                color = getName(in);
                result = getByName(color, "color");
                break;
            case 4:
                os = getName(in);
                result = getByName(os, "os");
                break;
            case 5:
                maker = getName(in);
                result = getByName(maker, "manufacturer");
                break;
            default:
                System.out.println("Неверный выбор пункта меню");
                result = available;
                break;
        }

        for (var laptop : result) {
            System.out.println(laptop);
        }

        in.close();
    }
}

