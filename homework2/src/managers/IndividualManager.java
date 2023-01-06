package managers;

import cars.Hatchback;

public class IndividualManager {
    private Hatchback hatchback;

    public IndividualManager(Hatchback hatchback) {
        this.hatchback = hatchback;
    }

    public void rent(Hatchback hatchback){
        System.out.println(hatchback.getBrandName() + " isimli araç bireysel olarak kiralandı");
    }
}
