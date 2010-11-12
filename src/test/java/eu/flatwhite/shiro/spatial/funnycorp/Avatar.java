package eu.flatwhite.shiro.spatial.funnycorp;

import eu.flatwhite.shiro.spatial.Space;

public class Avatar
    extends Person
{
    private static final long serialVersionUID = -3414745441591378292L;

    private final Person delegate;

    public Avatar( final Space space, final Person person )
    {
        super( space, person.getName(), person.getGender(), person.getBadgeNo() );

        this.delegate = person;
    }

    public Person getDelegate()
    {
        return delegate;
    }
}