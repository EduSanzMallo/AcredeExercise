package acrede

import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testConstraints() {

        def existingUser = new User( username: "wwdwd", postcode: 12, email: 'dwdw@geee.co.uk')

        mockForConstraintsTests(User, [existingUser])

        // validation should fail if both properties are null
        def user = new User()

        assert !user.validate()
        assert "nullable" == user.errors["username"]
        assert "nullable" == user.errors["postcode"]
        assert "nullable" == user.errors["email"]

        // So let's demonstrate other constraints

        user = new User(username: "dwwdwwdwdwdwdwd", postcode: 0, email: 'wqwqw')
        assert !user.validate()
        assert "maxSize" == user.errors["username"]
        assert "range" == user.errors["postcode"]
        assert "validator" == user.errors["email"]

        // Validation should pass!
        user = new User(username: "wfwffef", postcode: 99, email: 'samswosw@goo.vistabet')
        assert user.validate()

    }
}
