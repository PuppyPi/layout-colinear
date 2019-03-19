package rebound.hci.graphics2d.gui.layout.colinear.data.targetful;

import rebound.annotations.semantic.SignalInterface;
import rebound.hci.graphics2d.gui.layout.colinear.data.targetless.TargetlessColinearLayoutEntry;
import rebound.hci.graphics2d.gui.layout.colinear.data.targetless.TargetlessInitialRemainderProportionalAmountColinearLayoutEntry;

@SignalInterface
public class InitialRemainderProportionalAmountColinearLayoutEntry
extends ColinearLayoutEntry
{
	protected final float amount;
	
	public InitialRemainderProportionalAmountColinearLayoutEntry(final float amount, final Object target)
	{
		super(target);
		this.amount = amount;
	}
	
	public float getAmount()
	{
		return this.amount;
	}
	
	@Override
	public TargetlessColinearLayoutEntry minusTarget()
	{
		return new TargetlessInitialRemainderProportionalAmountColinearLayoutEntry(this.amount);
	}
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(this.amount);
		result = prime * result + ((this.target == null) ? 0 : this.target.hashCode());
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
		final InitialRemainderProportionalAmountColinearLayoutEntry other = (InitialRemainderProportionalAmountColinearLayoutEntry) obj;
		if (Float.floatToIntBits(this.amount) != Float.floatToIntBits(other.amount))
			return false;
		if (this.target == null)
		{
			if (other.target != null)
				return false;
		}
		else if (!this.target.equals(other.target))
			return false;
		return true;
	}
}
