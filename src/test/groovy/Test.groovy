import spock.lang.Specification

class Test extends Specification{
    def "test"(){
        when:
        def a = 2+2
        then:
        a == 4

    }
}
