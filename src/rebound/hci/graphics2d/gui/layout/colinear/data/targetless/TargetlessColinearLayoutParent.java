package rebound.hci.graphics2d.gui.layout.colinear.data.targetless;

import rebound.math.geom2d.Direction2D.Axis2D;

public class TargetlessColinearLayoutParent
{
	protected final Axis2D axis;
	protected final Iterable<TargetlessColinearLayoutEntry> entries;
	
	public TargetlessColinearLayoutParent(final Axis2D axis, final Iterable<TargetlessColinearLayoutEntry> entries)
	{
		this.axis = axis;
		this.entries = entries;
	}
	
	public Axis2D getAxis()
	{
		return this.axis;
	}
	
	public Iterable<TargetlessColinearLayoutEntry> getEntries()
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
		final TargetlessColinearLayoutParent other = (TargetlessColinearLayoutParent) obj;
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
