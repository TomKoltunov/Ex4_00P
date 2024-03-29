package Tests;

import ex4_java_client.Pokemon;
import ex4_java_client.PokemonContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonContainerTest {

    @Test
    void update() {
        String json ="{\"Pokemons\":[{\"Pokemon\":{\"value\":5.0,\"type\":-1,\"pos\":\"35.20273974670703,32.10439601193746,0.0\"}},{\"Pokemon\":{\"value\":8.0,\"type\":-1,\"pos\":\"35.189541903742466,32.10714473742062,0.0\"}},{\"Pokemon\":{\"value\":13.0,\"type\":1,\"pos\":\"35.198546018801096,32.10442041371198,0.0\"}},{\"Pokemon\":{\"value\":5.0,\"type\":-1,\"pos\":\"35.20418622066997,32.10618391544376,0.0\"}},{\"Pokemon\":{\"value\":9.0,\"type\":-1,\"pos\":\"35.207511563168026,32.10516145234799,0.0\"}},{\"Pokemon\":{\"value\":12.0,\"type\":-1,\"pos\":\"35.19183431463849,32.106897389061444,0.0\"}}]}\n";
        PokemonContainer pokemons=new PokemonContainer();
        assertTrue(pokemons.isEmpty());
        pokemons.update(json);
        assertFalse(pokemons.isEmpty());
        assertEquals(pokemons.size(),6);
    }

    @Test
    void getMax() {
        String json ="{\"Pokemons\":[{\"Pokemon\":{\"value\":5.0,\"type\":-1,\"pos\":\"35.20273974670703,32.10439601193746,0.0\"}},{\"Pokemon\":{\"value\":8.0,\"type\":-1,\"pos\":\"35.189541903742466,32.10714473742062,0.0\"}},{\"Pokemon\":{\"value\":13.0,\"type\":1,\"pos\":\"35.198546018801096,32.10442041371198,0.0\"}},{\"Pokemon\":{\"value\":5.0,\"type\":-1,\"pos\":\"35.20418622066997,32.10618391544376,0.0\"}},{\"Pokemon\":{\"value\":9.0,\"type\":-1,\"pos\":\"35.207511563168026,32.10516145234799,0.0\"}},{\"Pokemon\":{\"value\":12.0,\"type\":-1,\"pos\":\"35.19183431463849,32.106897389061444,0.0\"}}]}\n";
        PokemonContainer pokemons=new PokemonContainer();
        assertTrue(pokemons.isEmpty());
        pokemons.update(json);
        Pokemon po=pokemons.getMax();
        assertEquals(po.getValue(),13.0);
        po=pokemons.getMax();
        assertEquals(po.getValue(),12.0);
    }



}