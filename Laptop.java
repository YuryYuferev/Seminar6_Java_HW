import java.util.Objects;

public class Laptop {

        private int ram;
        private int storage;
        private String color;
        private String gpuType;
        private String screen;
        private String os;
        private String maufecturer;
        private double price;
    
        public Laptop(int ram, int storage, String color, String gpuType,
                      String screen, String os, String manufacturer, double price) {
            this.ram = ram;
            this.storage = storage;
            this.color = color;
            this.gpuType = gpuType;
            this.screen = screen;
            this.os = os;
            this.maufecturer = manufacturer;
            this.price = price;
        }
    
        public Laptop(String manufacturer, double price) {
            this(2, 256, "Black", "Integrated", "TN",
                    "Linux", manufacturer, price);
        }
    
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Laptop laptop = (Laptop) o;
            return ram == laptop.ram && storage == laptop.storage && Double.compare(laptop.price, price) == 0
                    && Objects.equals(color, laptop.color) && Objects.equals(gpuType, laptop.gpuType)
                    && Objects.equals(screen, laptop.screen) && Objects.equals(os, laptop.os)
                    && Objects.equals(maufecturer, laptop.maufecturer);
        }
    
        public int hashCode() {
            return Objects.hash(ram, storage, color, gpuType, screen, os, maufecturer, price);
        }
    
        public String toString() {
            return "Laptop{" +
                    "ram=" + ram +
                    ", storage=" + storage +
                    ", color='" + color + '\'' +
                    ", gpuType='" + gpuType + '\'' +
                    ", screen='" + screen + '\'' +
                    ", os='" + os + '\'' +
                    ", maufecturer='" + maufecturer + '\'' +
                    ", price=" + price +
                    '}';
        }
    
        public int getRam() {
            return ram;
        }
    
        public int getStorage() {
            return storage;
        }
    
        public String getCpuType() {
            return color;
        }
    
        public String getGpuType() {
            return gpuType;
        }
    
        public String getScreen() {
            return screen;
        }
    
        public String getOs() {
            return os;
        }
    
        public String getMaufecturer() {
            return maufecturer;
        }
    
        public double getPrice() {
            return price;
        }
    
        public void setRam(int ram) {
            this.ram = ram;
        }
    
        public void setStorage(int storage) {
            this.storage = storage;
        }
    
        public void setCpuType(String cpuType) {
            this.color = cpuType;
        }
    
        public void setGpuType(String gpuType) {
            this.gpuType = gpuType;
        }
    
        public void setScreen(String screen) {
            this.screen = screen;
        }
    
        public void setOs(String os) {
            this.os = os;
        }
    
        public void setMaufecturer(String maufecturer) {
            this.maufecturer = maufecturer;
        }
    
        public void setPrice(double price) {
            this.price = price;
        }

        public String getManufacturer() {
            return maufecturer;
        }
    }
    