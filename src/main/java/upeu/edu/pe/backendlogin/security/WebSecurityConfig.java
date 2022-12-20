package upeu.edu.pe.backendlogin.security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@CrossOrigin(origins= "*")
public class WebSecurityConfig {
	
	private final UserDetailsService userDetailsService;
	private final JWTAuthorizationFilter jwtAuthorizationFilter;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManager) throws Exception {
		
		JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter();
		jwtAuthenticationFilter.setAuthenticationManager(authManager);
		jwtAuthenticationFilter.setFilterProcessesUrl("/api/login");
		
		return http
				.cors().configurationSource(corsConfigurationSource()).and()
				.csrf().disable()
				.authorizeRequests()
				// API PUBLICAS
				
				// Control
				
				// DOCUMENTO
				.antMatchers(HttpMethod.GET, "/api/documento/listarDocs").permitAll()
				.antMatchers(HttpMethod.POST, "/api/documento/crear-documento").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/documento/actualizar-documento/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/documento/borrar-documento/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/documento/listar-id/**").permitAll()
	
				// EMPLEADO
				.antMatchers(HttpMethod.GET, "/api/empleado/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/empleado/crear-empleado").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/empleado/actualizar-empleado/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/empleado/borrar-empleado/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/empleado/listar-id/**").permitAll()
	
				// JUNTA DIRECTIVA
				.antMatchers(HttpMethod.GET, "/api/JuntaDirectiva/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/JuntaDirectiva/crear-jd").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/JuntaDirectiva/actualizar-jd/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/JuntaDirectiva/borrar-jd/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/JuntaDirectiva/listar-jd/**").permitAll()
				// ORGANIZACION
				.antMatchers(HttpMethod.GET, "/api/organizacion/listar").permitAll()
				.antMatchers(HttpMethod.POST, "/api/organizacion/crear-organizacion").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/organizacion/actualizar-organizacion/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/organizacion/listar-organizacion/**").permitAll()
				// PARAMETRO
				.antMatchers(HttpMethod.GET, "/api/parametro/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/parametro/crear-parametro").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/parametro/actualizar-parametro/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/parametro/borrar-parametro/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/parametro/listar-para/**").permitAll()

				// PERSONA
				.antMatchers(HttpMethod.GET, "/api/persona/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/persona/crear-persona").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/persona/actualizar-persona/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/persona/borrar-persona/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/persona/listar-persona/**").permitAll()

				// PRIVILEGIO
				.antMatchers(HttpMethod.GET, "/api/privilegio/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/privilegio/crear-privilegio").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/privilegio/actualizar-privilegio/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/privilegio/borrar-privilegio/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/privilegio/listar-privi/**").permitAll()

				// REQUISITO
				.antMatchers(HttpMethod.GET, "/api/requisito/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/requisito/crear-requisito").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/requisito/actualizar-requisito/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/requisito/borrar-requisito/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/requisito/listar-requi/**").permitAll()

				// ROL
				.antMatchers(HttpMethod.GET, "/api/rol/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/rol/crear-rol").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/rol/actualizar-rol/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/rol/listar-rol/**").permitAll()

				// SOLICITUD
				.antMatchers(HttpMethod.GET, "/api/solicitud/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/solicitud/crear-solicitud").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/solicitud/actualizar-solicitud/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/solicitud/listar-solicitud/**").permitAll()

				// SOLIORGANIZACION
				.antMatchers(HttpMethod.GET, "/api/soliorg/listartodo").permitAll()
				.antMatchers(HttpMethod.POST, "/api/soliorg/crear-soliorg").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/soliorg/actualizar-soliorg/**").permitAll()
				.antMatchers(HttpMethod.GET, "/api/soliorg/listar-soliorg/**").permitAll()
	
				
				.antMatchers(HttpMethod.POST, "/api/usuario/create-usuario").permitAll()
				
				// API PRIVADAS
//				.antMatchers(HttpMethod.GET, "/api/categoria/get-all").access("hasAuthority('ADMIN_ROLE') or hasAuthority('USER_ROLE') ")
				.antMatchers(HttpMethod.GET, "/api/categoria/get-all").hasAuthority("ADMIN")
				.antMatchers(HttpMethod.POST, "/api/categoria/create-categoria").hasAuthority("ADMIN")
				.antMatchers(HttpMethod.PUT, "/api/categoria/update-categoria/**").hasAuthority("ADMIN")
				.antMatchers(HttpMethod.DELETE, "/api/categoria/delete-categoria/**").hasAuthority("ADMIN")
				.antMatchers(HttpMethod.GET, "/api/categoria/get-categoria/**").hasAuthority("USER_ROLE")
				.anyRequest()
				.authenticated()
				.and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and()
				.addFilter(jwtAuthenticationFilter)
				.addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
				.build();
	}
	
	
	@Bean
	AuthenticationManager authManager(HttpSecurity http) throws Exception{
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailsService)
				.passwordEncoder(passwordEncoder())
				.and()
				.build();
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		config.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Content-Type","Authorization"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
