import spock.lang.Specification
import spock.lang.Unroll

class UnrollBugSpec extends Specification {

    @Unroll
    void "Valid Mandatory QueryValue #queryValues"() {
        expect:
        assert returnStatus

        where:
        queryValues                                                        || returnStatus
        '?from=2018-12&to=2019-12'                                         || true
        '?from=2018-12&to=2019-12'                                         || true
        '?to=2019-12&from=2018-12&divisions=test&teams=test&products=test' || false
    }
}
