# Example project to reproduce Maven weirdness

Bug or a design flaw, but it appears that a test scoped dependency may "promote" optional dependencies (compile scope) to non-optional 🤯. At least to me this behaviour doesn't make any sense.

This project is a reduced example. In the `optional-becomes-available-via-test` module `library-that-should-remain-optional` is only referred via optional and test scope, but still becomes as regular non-optional.


```bash
mvn install
cd optional-becomes-available-via-test
mvn dependency:tree
```
