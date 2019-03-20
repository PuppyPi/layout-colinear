package rebound.hci.graphics2d.gui.layout.colinear.data.targetless;

import rebound.annotations.semantic.SignalType;
import rebound.hci.graphics2d.gui.layout.colinear.data.targetful.ColinearLayoutEntry;

@SignalType
public interface TargetlessColinearLayoutEntry
{
	public ColinearLayoutEntry withTarget(Object target);
	
	
	
	
	//The subclasses *must* define these by more than just identity!
	@Override
	public abstract int hashCode();
	
	@Override
	public abstract boolean equals(Object obj);
}
