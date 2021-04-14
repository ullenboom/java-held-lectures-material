package de.tutego.fileformat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Objekt-JSON-Mapping mit Jackson
 * - Jackson Databind einbinden und nutzen
 *
 * @see <a href="https://github.com/FasterXML/jackson">Jackson Homepage</a>
 */
public class JSONdemo {
  public static void main( String[] args ) {
    Leaf leaf1 = new Leaf();
    leaf1.area = 12;
    Leaf leaf2 = new Leaf();
    leaf2.area = 122;
    Tree tree = new Tree();
    tree.area = 12;
    tree.height = 80;
    tree.leaves.add( leaf1 );
    tree.leaves.add( leaf2 );

    try {
      ObjectMapper objectMapper = new ObjectMapper();
      // objectMapper.enable( SerializationFeature.INDENT_OUTPUT );
      final String string = objectMapper.writeValueAsString( tree );
      System.out.println( string );

      String json = "{\"leaves\":[{\"area\":12.0},{\"area\":122.0}],\"height\":80,\"area\":12.0}";
      // objectMapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
      final Tree tree1 = objectMapper.readValue( json, Tree.class );
      System.out.println( tree1 );
    }
    catch ( JsonProcessingException e ) {
      e.printStackTrace();
    }
  }
}

@JsonIgnoreProperties( ignoreUnknown = true )
class Tree {
  @JsonProperty( "l" )
  public List<Leaf> leaves = new ArrayList<>();
  @JsonProperty( "h" )
  public int height;
  @JsonProperty( "a" )
  public double area;
}

class Leaf {
  public double area;
}
