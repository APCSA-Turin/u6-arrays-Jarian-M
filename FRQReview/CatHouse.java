package FRQReview;

public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private int totalVaccinesAdministered;

    public CatHouse(Cat cat1, Cat cat2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        totalVaccinesAdministered = 0;
    }

    public Cat getCat1() {
        return cat1;
    }

    public Cat getCat2() {
        return cat2;
    }

    public int getTotalVaccinesAdministered() {
        return totalVaccinesAdministered;
    }

    public boolean hasVaccinesInStock() {
        return !cat1.getName().equals("G");
    }

    public void rollCall() {
        // COPY/PASTE YOUR SOLUTION HERE
        if(cat1.getAge() > cat2.getAge()) {
            cat1.introduce();
            cat2.introduce();
        } else if(cat2.getAge() > cat1.getAge()) {
            cat2.introduce();
            cat1.introduce();
        } else {
            cat1.introduce();
            cat2.introduce();
        }    
    }

    public boolean performVaccinations() {
        // COPY/PASTE YOUR SOLUTION HERE
        int num = 0;
        if(!cat1.isVaccinated()) {
            if(hasVaccinesInStock()) {
                cat1.vaccinate();
                num++;
                totalVaccinesAdministered++;
            } else {
                return false;
            }
        }
        if(!cat2.isVaccinated()) {
            if(hasVaccinesInStock()) {
                cat2.vaccinate();
                num++;
                totalVaccinesAdministered++;
            } else {
                return false;
            }
        }
        if(num >= 1) {
            return true;
        } else {
            return false;
        }
    
    }
}
