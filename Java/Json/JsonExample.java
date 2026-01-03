package Json;

import org.json.JSONObject;

class JsonPracticalExample {
    public static void main(String[] args) {

        // 1️⃣ Create JSON Object
        JSONObject student = new JSONObject();

        student.put("id", 101);
        student.put("name", "Aayushi");
        student.put("marks", 85);
        student.put("passed", true);

        // 2️⃣ Print JSON
        System.out.println("Student JSON:");
        System.out.println(student.toString());

        // 3️⃣ Read values from JSON
        int id = student.getInt("id");
        String name = student.getString("name");
        int marks = student.getInt("marks");
        boolean passed = student.getBoolean("passed");

        // 4️⃣ Display values
        System.out.println("\nReading JSON values:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + passed);
    }
}
