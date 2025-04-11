public class HelloWorld {
  public static void main( String[] args ) {
    System.out.println( "Hello, World!" );
  }
}

/*
┌───────────────────┐     ┌───────────────────┐     ┌─────────────────────┐
│   Java-Program    ├────►│  Java Compiler    ├────►│  Bytecode           │
│   (.java file)    │     │  (javac)          │     │  (.class)           │
└───────────────────┘     └───────────────────┘     └───────────┬─────────┘
                                                                │
                                       ┌────────────────────────┼──────────────────────┐
                                       │                        │                      │
                                       │                        │                      │
                              ┌────────▼──────────┐   ┌─────────▼─────────┐   ┌────────▼──────────┐
                              │ JVM (Linux)       │   │ JVM (macOS)       │   │ JVM (Windows)     │
                              │ Executes Bytecode │   │ Executes Bytecode │   │ Executes Bytecode │
                              └───────────────────┘   └───────────────────┘   └───────────────────┘

 */