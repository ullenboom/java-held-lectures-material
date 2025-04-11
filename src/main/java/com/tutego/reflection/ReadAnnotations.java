package com.tutego.reflection;

//@FunctionalInterface
@SuppressWarnings( "deprecation" )
public class ReadAnnotations {
  public static void main( String[] args ) {
//    Tree tree = new Tree();
    Deprecated annotation = Tree.class.getAnnotation( Deprecated.class );
    System.out.println( annotation.forRemoval() );
    System.out.println( annotation.since() );
  }

  @Override public String toString() {
    return super.toString();
  }
}

@Deprecated//(since = "version 2.9", forRemoval = true)
class Tree {

}
