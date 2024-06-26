package rebound.hci.graphics2d.gui.layout.colinear.data.adt;

import static java.util.Objects.*;
import java.util.List;
import javax.annotation.Nonnull;
import rebound.hci.graphics2d.gui.layout.colinear.data.unified.UnifiedColinearLayoutParent;
import rebound.math.geom2d.Direction2D.Axis2D;

public class ColinearLayoutableBranch<Leaf>
implements ColinearLayoutable<Leaf>, UnifiedColinearLayoutParent
{
	protected final Axis2D axis;
	protected final List<ColinearLayoutEntry<Leaf>> entries;
	
	public ColinearLayoutableBranch(final @Nonnull Axis2D axis, final @Nonnull List<ColinearLayoutEntry<Leaf>> entries)
	{
		this.axis = requireNonNull(axis);
		this.entries = requireNonNull(entries);
	}
	
	@Override
	public Axis2D getAxis()
	{
		return this.axis;
	}
	
	@Override
	public List<ColinearLayoutEntry<Leaf>> getEntries()
	{
		return this.entries;
	}
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.axis == null) ? 0 : this.axis.hashCode());
		result = prime * result + ((this.entries == null) ? 0 : this.entries.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(final Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ColinearLayoutableBranch other = (ColinearLayoutableBranch) obj;
		if (this.axis != other.axis)
			return false;
		if (this.entries == null)
		{
			if (other.entries != null)
				return false;
		}
		else if (!this.entries.equals(other.entries))
			return false;
		return true;
	}
}
