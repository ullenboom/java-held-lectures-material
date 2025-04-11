package com.tutego.fileformat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonDemo {
  // https://github.com/FasterXML/jackson

  public static void main( String[] args ) {
    Leaf leaf1 = new Leaf( 12 );
    Leaf leaf2 = new Leaf( 122 );
    Tree tree = new Tree( List.of( leaf1, leaf2 ), 80, 12 );

    try {
      ObjectMapper objectMapper = new ObjectMapper();
      //      objectMapper.enable( SerializationFeature.INDENT_OUTPUT );
      String s = objectMapper.writeValueAsString( tree );
      System.out.println( s );

      String json = "{\"l\":[{\"area\":12.0},{\"area\":122.0}],\"height\":80,\"area\":12.0}";
      //      objectMapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
      Tree tree1 = objectMapper.readValue( json, Tree.class );
      System.out.println( tree1 );
    }
    catch ( JsonProcessingException e ) {
      throw new RuntimeException( e );
    }

  }
}

@JsonIgnoreProperties( ignoreUnknown = true )
record Tree(
    @JsonProperty( "l" )
    List<Leaf> leaves,
    @JsonProperty( "h" )
    int height,
    @JsonProperty( "a" )
    double area
) {
}

record Leaf( double area ) {
}