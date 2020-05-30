package nl.dijkrosoft.java14;

import org.junit.Test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import static org.junit.Assert.assertEquals;

public class AapTest {

    @Test
    public void jsonb() {
        Jsonb jsonb = JsonbBuilder.create();
        var developer = new Developer(25, "java");
        var serialized = jsonb.toJson(developer);
        System.out.println("serialized = " + serialized);
        var clone = jsonb.fromJson(serialized, Developer.class);
        System.out.println("clone = " + clone);

        assertEquals(developer, clone);
    }
}