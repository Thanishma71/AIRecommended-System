import java.io.File;
import java.util.List;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;

public class RecommendationSystem {
    public static void main(String[] args) {
        try {
            FileDataModel model = new FileDataModel(new File("data.csv"));
            PearsonCorrelationSimilarity similarity = new PearsonCorrelationSimilarity(model);
            NearestNUserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
            GenericUserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            LongPrimitiveIterator users = model.getUserIDs();
            while (users.hasNext()) {
                long userId = users.nextLong();
                List<RecommendedItem> recommendations = recommender.recommend(userId, 2);
                System.out.println("User " + userId + " recommendations:");
                if (recommendations.isEmpty()) {
                    System.out.println("  (no recommendations)");
                } else {
                    for (RecommendedItem recommendation : recommendations) {
                        System.out.printf("  Item ID: %d | Score: %.2f\n",
                                recommendation.getItemID(), recommendation.getValue());
                    }
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
