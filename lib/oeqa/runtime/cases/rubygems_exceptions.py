class RubyGemsTestExceptions():

    exec_wrapper_return_codes = {
        "htmldiff": 127,
        "rwinrm": 1,
        "rwinrmcp": 1
    }

    exec_wrapper_skips = {
        "gauntlet": "some internal weirdness",
        "jmespath.rb": "seems to require some kind of input",
        "jsonpath": "seems to require some kind of input",
        "restclient": "need an URL parameter",
        "setup": "unknown issue with ruby load function",
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
        "hiera_puppet": "uninitialized constant Puppet (NameError)",
        "jekyll-sass-converter": "module:Jekyll: uninitialized constant Jekyll::Page (NameError)",
        "jeventmachine": "`require': cannot load such file -- java (LoadError)",
        "nori": "uninitialized constant Nori::StringIO (NameError)",
        "ms_rest": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "ms_rest_azure": "uninitialized constant Faraday::Response::Middleware (NameError)",
        "proxifier": "uninitialized class variable @@schemes",
        "ruby_parser20": "not the parser you are looking for",
        "ruby_parser21": "not the parser you are looking for",
        "ruby_parser22": "not the parser you are looking for",
        "ruby_parser23": "not the parser you are looking for",
        "ruby_parser24": "not the parser you are looking for",
        "ruby_parser25": "not the parser you are looking for",
        "ruby_parser26": "not the parser you are looking for",
        "ruby_parser27": "not the parser you are looking for",
        "ruby_parser30": "uninitialized constant RubyParser",
        "ruby_parser31": "uninitialized constant RubyParser",
        "ruby_parser32": "uninitialized constant RubyParser",
        "ruby_parser33": "uninitialized constant RubyParser",
        "simplecov-html": "needs extra configuration -> uninitialized constant SimpleCov (NameError)",
        "syslog-formatter": "module needs upfront configuration of a logging provider",
        "version": "needs extra configuration -> uninitialized constant Azure (NameError)",
    }

    gem_list_skips = {

    }
