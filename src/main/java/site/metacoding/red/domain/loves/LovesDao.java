package site.metacoding.red.domain.loves;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LovesDao {
	public void insert(Loves loves);
	public List<Loves> findAll();
	public Loves findById(Integer id);
	public void update(Loves loves);
	public void deleteById(Integer id);
}
