package hometasks;

public class Doctor {

    String speciality;
    float yearsOfExperience;
    int checkUpPrice;
    boolean hasGoodReviews;
    boolean goodDoctor;
    boolean takingGoodCare;
    int rating = 0;

    public void doesAccurateAndPainless(boolean hasGoodReviews) {
        if (hasGoodReviews) {
            System.out.println(speciality + " does accurate and painless");
            rating++;
        } else {
            System.out.println(speciality + " does accurate and painless even if he tired");
            rating += 2;

        }
    }

    public void diagnosesDiseaseAndGivesRecommendations(boolean goodDoctor) {
        if (goodDoctor) {
            System.out.println(speciality + " diagnoses diseases and gives good recommendations ");
            rating += 2;
            takingGoodCare = true;
        } else {
            rating++;
            takingGoodCare = true;
            System.out.println(speciality + " has a bad service");
        }
    }

    public void rudeAndSlow(boolean hasGoodReviews, boolean takingGoodCare) {
        if (!hasGoodReviews && !takingGoodCare) {
            System.out.println(speciality + " rude and slow sometimes");
            rating -= 2;
        } else if (hasGoodReviews && !takingGoodCare) {
            System.out.println(speciality + " rude and slow always");
            rating--;
        } else {
            System.out.println(speciality + " rude and slow only when not in the mood");
        }

    }
}
    class Hospital {
    public static void main(String[] args) {

        Doctor doc1 = new Doctor();
        Doctor doc2 = new Doctor();

        doc1.speciality = "Dentist";
        doc1.yearsOfExperience = 5.5f;
        doc1.checkUpPrice = 500;
        doc1.takingGoodCare=true;
        doc1.hasGoodReviews = false;
        doc1.goodDoctor = true;
        doc1.doesAccurateAndPainless(doc1.hasGoodReviews);
        doc1.rudeAndSlow(doc1.hasGoodReviews, doc1.takingGoodCare);
        doc1.diagnosesDiseaseAndGivesRecommendations(doc1.takingGoodCare);

        doc2.speciality = "Dermatologist";
        doc2.yearsOfExperience = 3.0f;
        doc2.checkUpPrice = 250;
        doc2.takingGoodCare = false;
        doc2.hasGoodReviews = true;
        doc2.goodDoctor = false;
        doc2.doesAccurateAndPainless(doc2.goodDoctor);
        doc2.rudeAndSlow(doc2.hasGoodReviews, doc2.takingGoodCare);
        doc2.diagnosesDiseaseAndGivesRecommendations(doc1.takingGoodCare);


        if(doc1.rating > doc2.rating){
            System.out.println(doc1.speciality + " is doctor #1");
        }else if(doc2.rating > doc1.rating) {
            System.out.println(doc2.speciality + " is doctor #1");
        }else{
            System.out.println("Ratings are equal.Both are top doctors");
        }


    }
}



