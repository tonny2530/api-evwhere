package th.ac.kmutt.sit.evwhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.util.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import th.ac.kmutt.sit.evwhere.entity.Provider;
import th.ac.kmutt.sit.evwhere.repository.ProviderRepository;

import java.sql.Timestamp;
import java.util.Optional;


@SpringBootApplication
@EnableSwagger2
public class EvwhereApplication{

	private static final Logger logger = LoggerFactory.getLogger(EvwhereApplication.class);

	@Autowired
	private ProviderRepository providerRepo;

	public static void main(String[] args) {
		SpringApplication.run(EvwhereApplication.class, args);
	}

//	public void run(String... var1) {
//		logger.info("Start run");
//		Timestamp now = new Timestamp(System.currentTimeMillis());
//		Provider provider = new Provider(1,"PEA Volta","0991112233","test@mail.com",now,now);
//
//		Mono<Provider> newProvider = providerRepo.save(provider);
//		Flux<Provider> providerFlux = providerRepo.findByProviderName(provider.getProviderName());
//
//		Mono<Provider> findByIdMono  = providerRepo.findById(provider.getProviderId());
//		Provider findBuProviderId = findByIdMono.block();
//		Assert.isNull(findBuProviderId, "Provider must be null");
//
//		Provider savedProvider = newProvider.block();
//		Assert.state(savedProvider != null, "Saved Provider must not be null");
//		Assert.state(savedProvider.getProviderName().equals(provider.getProviderName()), "Saved Provider name doesn't match");
//
//		providerFlux.collectList().block();
//
//		Optional<Provider> providerResult = providerRepo.findById(provider.getProviderId()).blockOptional();
//		Provider result = providerResult.get();
//		logger.info(result.toString());
//	}
}
