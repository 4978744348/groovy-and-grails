

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'com.auth.Role'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.controllerAnnotations.staticRules = [

	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/product/index',             access: ['ROLE_ADMIN','ROLE_USER']],
	[pattern: '/product/listProd',          access: ['ROLE_ADMIN','ROLE_USER']],
	[pattern: '/product/addProd',           access: ['ROLE_ADMIN']],
	[pattern: '/product/save',              access: ['ROLE_ADMIN']],
	[pattern: '/product/edit',              access: ['ROLE_ADMIN']],
	[pattern: '/product/Update',            access: ['ROLE_ADMIN']],
	[pattern: '/product/delete',            access: ['ROLE_ADMIN']],
	[pattern: '/user/index',                access: ['ROLE_ADMIN','ROLE_USER']]

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

