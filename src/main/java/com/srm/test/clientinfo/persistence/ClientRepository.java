package com.srm.test.clientinfo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Cesar.
 * @version 1.0
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
