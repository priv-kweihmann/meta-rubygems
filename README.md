# meta-rubygems

A layer providing gems for Ruby.

## Tested variants

The following variants are tested regularly:

| variant     | glibc                                                                                                                                             | musl                                                                                                                                            |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| qemux86-64  | ![[master]-[glibc]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemux86-64%5D/badge.svg)   | ![[master]-[musl]-[qemux86-64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bmusl%5D-%5Bqemux86-64%5D/badge.svg)   |

Other variants most likely will work.
Feel free to contribute any needed patches.

### Tested revisions

Up to the following revisions automated checks being done

* poky: ddc9e2fd33abe6a0de7b4e0dacdb6f530ee99871
* meta-openembedded: 5d8dfa1ad4ac5d32536a10c9e299a3dd17296fc9

## Support

This layer is a rolling release.
Integration is continuously checked against the HEAD of the corresponding poky layer.
Don't expect tags or any kind of versioning.

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
