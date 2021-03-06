package rebound.hci.graphics2d.gui.layout.colinear.data.targetless;

import rebound.annotations.semantic.SignalType;
import rebound.hci.graphics2d.gui.layout.colinear.data.targetful.ColinearLayoutEntry;
import rebound.hci.graphics2d.gui.layout.colinear.data.targetful.FinalRemainderColinearLayoutEntry;
import rebound.hci.graphics2d.gui.layout.colinear.data.unified.UnifiedFinalRemainderColinearLayoutEntry;

@SignalType
public enum TargetlessFinalRemainderColinearLayoutEntry
implements TargetlessColinearLayoutEntry, UnifiedFinalRemainderColinearLayoutEntry
{
	I;
	
	@Override
	public ColinearLayoutEntry withTarget(final Object target)
	{
		return new FinalRemainderColinearLayoutEntry(target);
	}
}
