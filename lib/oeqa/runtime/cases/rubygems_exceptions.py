class RubyGemsTestExceptions():

    exec_wrapper_return_codes = {
        "htmldiff": 127,
        "rwinrm": 1,
        "rwinrmcp": 1
    }

    exec_wrapper_skips = {
        "gauntlet": "some internal weirdness",
        "setup": "unknown issue with ruby load function"
    }

    loadable_skips = {
        "gauntlet_flay": "causes a SIGKILL",
        "gauntlet_flog": "causes a SIGKILL",
        "gauntlet_grep": "causes a SIGKILL",
        "gauntlet_parser": "causes a SIGKILL",
        "jekyll-sass-converter": "module:Jekyll: uninitialized constant Jekyll::Page (NameError)",
        "proxifier": "uninitialized class variable @@schemes",
        "ruby20_parser": "not the parser you are looking for",
        "ruby21_parser": "not the parser you are looking for",
        "ruby22_parser": "not the parser you are looking for",
        "ruby23_parser": "not the parser you are looking for",
        "ruby24_parser": "not the parser you are looking for",
        "ruby25_parser": "not the parser you are looking for",
        "ruby26_parser": "not the parser you are looking for",
        "ruby27_parser": "not the parser you are looking for",
        "simplecov-html": "needs extra configuration -> uninitialized constant SimpleCov (NameError)",
        "syslog-formatter": "module needs upfront configuration of a logging provider",
        "version": "needs extra configuration -> uninitialized constant Azure (NameError)",
    }

    gem_list_skips = {

    }
