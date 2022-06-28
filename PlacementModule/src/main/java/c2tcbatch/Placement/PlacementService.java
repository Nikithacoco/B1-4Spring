package c2tcbatch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repi;  
	
	public List<Placement> listAll() 
	{
		return repi.findAll();
	}
	
	public void save(Placement placement) 
	{
		repi.save(placement);
	}
	
	public Placement get(Integer id) 
	{
		return repi.findById(id).get();
	}
	
	public Placement get1(Integer hallticketno) 
	{
		return repi.findByHallticketno(hallticketno).get();
	}
	
	public void delete(Integer id)
	{
		repi.deleteById(id);
	}
}