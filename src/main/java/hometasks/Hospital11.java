package hometasks;

public class Hospital11 {
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
            System.out.println("Rating are equal.Both are top doctors");
        }


    }
}
