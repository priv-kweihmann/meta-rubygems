class RubyGemsTestExceptions():

    exec_wrapper_return_codes = {
        "htmldiff": 127,
        "rwinrm": 1,
        "rwinrmcp": 1
    }

    exec_wrapper_skips = {
        "gauntlet": "some internal weirdness",
        "restclient": "need an URL parameter",
        "setup": "unknown issue with ruby load function",
        "jmespath.rb": "seems to require some kind of input",
    }

    loadable_skips = {
        "aws-defaults": "uninitialized constant Aws::DefaultsModeConfigResolver::EC2Metadata (NameError)",
        "azure_graph_rbac": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "azure_mgmt_key_vault": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "azure_mgmt_resources": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "azure_mgmt_security": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "azure_mgmt_storage": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "corefoundation": "ffi_lib loading error",
        "gauntlet_flay": "causes a SIGKILL",
        "gauntlet_flog": "causes a SIGKILL",
        "gauntlet_grep": "causes a SIGKILL",
        "gauntlet_parser": "causes a SIGKILL",
        "jekyll-sass-converter": "module:Jekyll: uninitialized constant Jekyll::Page (NameError)",
        "jeventmachine": "`require': cannot load such file -- java (LoadError)",
        "ms_rest_azure": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "ms_rest": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "proxifier": "uninitialized class variable @@schemes",
        "ruby20_parser": "not the parser you are looking for",
        "ruby21_parser": "not the parser you are looking for",
        "ruby22_parser": "not the parser you are looking for",
        "ruby23_parser": "not the parser you are looking for",
        "ruby24_parser": "not the parser you are looking for",
        "ruby25_parser": "not the parser you are looking for",
        "ruby26_parser": "not the parser you are looking for",
        "ruby27_parser": "not the parser you are looking for",
        "ruby30_parser": "uninitialized constant RubyParser",
        "ruby31_parser": "uninitialized constant RubyParser",
        "simplecov-html": "needs extra configuration -> uninitialized constant SimpleCov (NameError)",
        "syslog-formatter": "module needs upfront configuration of a logging provider",
        "version": "needs extra configuration -> uninitialized constant Azure (NameError)",
    }

    gem_list_skips = {

    }
