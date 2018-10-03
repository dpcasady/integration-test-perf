package org.grails

import grails.testing.mixin.integration.Integration
import spock.lang.Specification
import spock.lang.Unroll

@Integration
class PerformanceSpec extends Specification {

    @Unroll
    void "this test runs faster with mockito"() {
        expect:
        1

        where:
        a << Arrays.asList(new Integer[100]) // run test 100 times
    }

}