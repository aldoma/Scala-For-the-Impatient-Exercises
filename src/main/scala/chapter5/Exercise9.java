package chapter5;

/**
 * Reimplement the class of the preceding exercise in Java, C#, or C++ (your
 * choice). How much shorter is the Scala class?
 */
public class Exercise9 {

    static class Car {
        static final int DEFAULT_MODEL_YEAR = -1;
        static final String DEFAULT_LICENSE_PLATE = "";

        private final String manufacturer;
        private final String modelName;
        private final int modelYear;
        private String licensePlate;

        Car(final String manufacturer, final String modelName, final int modelYear, final String licensePlate) {
            if (manufacturer.trim().isEmpty()) {
                throw new IllegalArgumentException("Manufacturer can not be empty");
            }
            if (modelName.trim().isEmpty()) {
                throw new IllegalArgumentException("Model name can not be empty");
            }

            this.manufacturer = manufacturer;
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.licensePlate = licensePlate;
        }

        Car(final String manufacturer, final String modelName) {
            this(manufacturer, modelName, DEFAULT_MODEL_YEAR, DEFAULT_LICENSE_PLATE);
        }

        Car(final String manufacturer, final String modelName, final int modelYear) {
            this(manufacturer, modelName, modelYear, DEFAULT_LICENSE_PLATE);
        }

        Car(final String manufacturer, final String modelName, final String licensePlate) {
            this(manufacturer, modelName, DEFAULT_MODEL_YEAR, licensePlate);
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getModelName() {
            return modelName;
        }

        public int getModelYear() {
            return modelYear;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(final String licensePlate) {
            this.licensePlate = licensePlate;
        }
    }
}
