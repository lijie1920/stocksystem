package my.work.stock.system.domain.repository;

import my.work.stock.system.domain.entity.InnerDepartmentInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InnerDepartmentInfoRepository extends CrudRepository<InnerDepartmentInfo, Integer>, JpaSpecificationExecutor {

}
