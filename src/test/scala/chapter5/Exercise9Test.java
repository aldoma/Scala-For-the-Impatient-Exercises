package chapter5;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Exercise9Test {
    private final static String MANUFACTURER = "Ford";
    private final static String MODEL = "Fiesta";
    private final static int YEAR = 1985;
    private final static String LICENSE = "M 1245 AA";

    @Test(expected = IllegalArgumentException.class)
    public void testCtorManufacturerIsEmpty() {
        new Exercise9.Car("", MODEL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCtorManufacturerIsOnlySpaces() {
        new Exercise9.Car("  ", MODEL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCtorModelNameIsEmpty() {
        new Exercise9.Car(MANUFACTURER, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCtorModelNameIsOnlySpaces() {
        new Exercise9.Car(MANUFACTURER, "  ");
    }

    @Test
    public void testCtorAllValuesTestManufacturer() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR, LICENSE);
        assertThat(car.getManufacturer(), is(MANUFACTURER));
    }

    @Test
    public void testCtorAllValuesTestModelName() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR, LICENSE);
        assertThat(car.getModelName(), is(MODEL));
    }

    @Test
    public void testCtorAllValuesTestModelYear() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR, LICENSE);
        assertThat(car.getModelYear(), is(YEAR));
    }

    @Test
    public void testCtorAllValuesTestLicensePlate() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR, LICENSE);
        assertThat(car.getLicensePlate(), is(LICENSE));
    }

    @Test
    public void testCtorManufacturerAndModelNameTestManufacturer() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL);
        assertThat(car.getManufacturer(), is(MANUFACTURER));
    }

    @Test
    public void testCtorManufacturerAndModelNameTestModelName() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL);
        assertThat(car.getModelName(), is(MODEL));
    }

    @Test
    public void testCtorManufacturerAndModelNameTestModelYear() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL);
        assertThat(car.getModelYear(), is(Exercise9.Car.DEFAULT_MODEL_YEAR));
    }

    @Test
    public void testCtorManufacturerAndModelNameTestLicensePlate() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL);
        assertThat(car.getLicensePlate(), is(Exercise9.Car.DEFAULT_LICENSE_PLATE));
    }

    @Test
    public void testCtorManufacturerModelNameAndYearTestManufacturer() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR);
        assertThat(car.getManufacturer(), is(MANUFACTURER));
    }

    @Test
    public void testCtorManufacturerModelNameAndYearTestModelName() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR);
        assertThat(car.getModelName(), is(MODEL));
    }

    @Test
    public void testCtorManufacturerModelNameAndYearTestModelYear() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR);
        assertThat(car.getModelYear(), is(YEAR));
    }

    @Test
    public void testCtorManufacturerModelNameAndYearTestLicensePlate() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, YEAR);
        assertThat(car.getLicensePlate(), is(Exercise9.Car.DEFAULT_LICENSE_PLATE));
    }

    @Test
    public void testCtorManufacturerModelNameAndLicensePlateManufacturer() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, LICENSE);
        assertThat(car.getManufacturer(), is(MANUFACTURER));
    }

    @Test
    public void testCtorManufacturerModelNameAndLicensePlateTestModelName() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, LICENSE);
        assertThat(car.getModelName(), is(MODEL));
    }

    @Test
    public void testCtorManufacturerModelNameAndLicensePlateTestModelYear() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, LICENSE);
        assertThat(car.getModelYear(), is(Exercise9.Car.DEFAULT_MODEL_YEAR));
    }

    @Test
    public void testCtorManufacturerModelNameAndLicensePlateTestLicensePlate() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, LICENSE);
        assertThat(car.getLicensePlate(), is(LICENSE));
    }

    @Test
    public void testChangeLicensePlate() {
        final Exercise9.Car car = new Exercise9.Car(MANUFACTURER, MODEL, LICENSE);
        final String newLicense = "new license";
        car.setLicensePlate(newLicense);
        assertThat(car.getLicensePlate(), is(newLicense));
    }
}
