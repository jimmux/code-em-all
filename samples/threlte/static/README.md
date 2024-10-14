# Development notes

Model component creation has some gotchas in the docs at [https://threlte.xyz/docs/learn/basics/loading-assets].

- Model `.gltf` files can go in `static/models`
- Running `npx @threlte/gltf@latest static/models/Model.gltf` in root will create the component in root
  - Move the generated component to `src/lib/components/models/Model.svelte`
  - May want to rename with initial capital for consistency with other components
  - Edit `Model.svelte` call to `useGltf()` so it uses `"/models/Model.gltf"`
