class RubyGemsTestExceptions():

    exec_wrapper_return_codes = {
        "htmldiff": 127,
        "rwinrm": 1,
        "rwinrmcp": 1
    }

    exec_wrapper_skips = {
        "setup": "unknown issue with ruby load function"
    }

    loadable_skips = {
        "syslog-formatter": "module needs upfront configuration of a logging provider"
    }

    gem_list_skips = {

    }
