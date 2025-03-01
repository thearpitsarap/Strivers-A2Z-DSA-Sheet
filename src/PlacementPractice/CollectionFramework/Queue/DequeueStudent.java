package PlacementPractice.CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueStudent {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.offerFirst("Sarap");
        dq.offerLast("Arpit");
        dq.offerFirst("Patil");
        dq.offerLast("Nice");
        /*
         * Step-by-Step Execution
         * 1️⃣ dq.offerFirst("Sarap");
         * Since the deque is empty, "Sarap" is added at the front:
         * 
         * 📌 Deque:
         * 👉 [Sarap]
         * 
         * 2️⃣ dq.offerLast("Arpit");
         * Adds "Arpit" to the end:
         * 
         * 📌 Deque:
         * 👉 [Sarap → Arpit]
         * 
         * 3️⃣ dq.offerFirst("Patil");
         * Adds "Patil" to the front:
         * 
         * 📌 Deque:
         * 👉 [Patil → Sarap → Arpit]
         * 
         * 4️⃣ dq.offerLast("Nice");
         * Adds "Nice" to the end:
         * 
         * 📌 Final Deque:
         * 👉 [Patil → Sarap → Arpit → Nice] ✅
         */
        
        System.out.println(dq.poll());
        for (String a : dq) {
            System.out.println(a);
        }
    }
}