/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.common;

/**
 *
 * @author sotobotero
 */
/*
 * @Component
 * 
 * @Order(Ordered.HIGHEST_PRECEDENCE)
 * public class CORSFilter implements Filter {
 * 
 * static Logger logger = LoggerFactory.getLogger(CORSFilter.class);
 * 
 * @Override
 * public void init(FilterConfig filterConfig) throws ServletException {
 * 
 * }
 * 
 * @Override
 * public void doFilter(ServletRequest req, ServletResponse res, FilterChain
 * chain) throws IOException, ServletException {
 * HttpServletRequest request = (HttpServletRequest) req;
 * HttpServletResponse response = (HttpServletResponse) res;
 * System.out.println("CORSFilter HTTP Request: " + request.getMethod());
 * 
 * 
 * //disable cachin
 * response.addHeader("Access-Control-Max-Age", "-1");
 * // Authorize (allow) all domains to consume the content
 * response.addHeader("Access-Control-Allow-Origin", "*");
 * response.setHeader("Access-Control-Allow-Credentials", "true");
 * response.addHeader(
 * "Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
 * response.setHeader("Access-Control-Allow-Headers",
 * "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers,Authorization"
 * );
 * 
 * // For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS
 * handshake
 * if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
 * response.setStatus(HttpServletResponse.SC_OK);
 * } else {
 * chain.doFilter(req, res);
 * }
 * logger.info(request.getRemoteAddr());
 * }
 * 
 * @Override
 * public void destroy() {
 * }
 * }
 */
