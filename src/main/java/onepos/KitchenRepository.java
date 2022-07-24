package onepos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface KitchenRepository extends PagingAndSortingRepository<Kitchen, Long>{
	
	List<Kitchen> findByOrderId(Long orderId);
}