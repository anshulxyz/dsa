package example

import org.scalatest.freespec.AnyFreeSpec

class HelloSpec extends AnyFreeSpec {
  "greeting should return 'hello'" in {
    assert(Hello.greeting == "hello")
  }
}
